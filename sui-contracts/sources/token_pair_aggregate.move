// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module sui_swap_example::token_pair_aggregate {
    use sui::balance::Balance;
    use sui::tx_context;
    use sui_swap_example::exchange::Exchange;
    use sui_swap_example::token_pair;
    use sui_swap_example::token_pair_add_liquidity_logic;
    use sui_swap_example::token_pair_initialize_liquidity_logic;
    use sui_swap_example::token_pair_swap_x_logic;
    use sui_swap_example::token_pair_swap_y_logic;

    public fun initialize_liquidity<X, Y>(
        exchange: &mut Exchange,
        x_amount: Balance<X>,
        y_amount: Balance<Y>,
        ctx: &mut tx_context::TxContext,
    ) {
        let liquidity_initialized = token_pair_initialize_liquidity_logic::verify<X, Y>(
            exchange,
            &x_amount,
            &y_amount,
            ctx,
        );
        let token_pair = token_pair_initialize_liquidity_logic::mutate<X, Y>(
            &liquidity_initialized,
            x_amount,
            y_amount,
            exchange,
            ctx,
        );
        token_pair::set_liquidity_initialized_id(&mut liquidity_initialized, token_pair::id(&token_pair));
        token_pair::share_object(token_pair);
        token_pair::emit_liquidity_initialized(liquidity_initialized);
    }

    public fun add_liquidity<X, Y>(
        token_pair: &mut token_pair::TokenPair<X, Y>,
        x_amount: Balance<X>,
        y_amount: Balance<Y>,
        ctx: &mut tx_context::TxContext,
    ) {
        let liquidity_added = token_pair_add_liquidity_logic::verify<X, Y>(
            &x_amount,
            &y_amount,
            token_pair,
            ctx,
        );
        token_pair_add_liquidity_logic::mutate<X, Y>(
            &liquidity_added,
            x_amount,
            y_amount,
            token_pair,
            ctx,
        );
        token_pair::update_object_version(token_pair);
        token_pair::emit_liquidity_added(liquidity_added);
    }

    public fun swap_x<X, Y>(
        token_pair: &mut token_pair::TokenPair<X, Y>,
        x_amount: Balance<X>,
        ctx: &mut tx_context::TxContext,
    ): Balance<Y> {
        let x_swapped_for_y = token_pair_swap_x_logic::verify<X, Y>(
            &x_amount,
            token_pair,
            ctx,
        );
        let swap_x_return = token_pair_swap_x_logic::mutate<X, Y>(
            &x_swapped_for_y,
            x_amount,
            token_pair,
            ctx,
        );
        token_pair::update_object_version(token_pair);
        token_pair::emit_x_swapped_for_y(x_swapped_for_y);
        swap_x_return
    }

    public fun swap_y<X, Y>(
        token_pair: &mut token_pair::TokenPair<X, Y>,
        y_amount: Balance<Y>,
        ctx: &mut tx_context::TxContext,
    ): Balance<X> {
        let y_swapped_for_x = token_pair_swap_y_logic::verify<X, Y>(
            &y_amount,
            token_pair,
            ctx,
        );
        let swap_y_return = token_pair_swap_y_logic::mutate<X, Y>(
            &y_swapped_for_x,
            y_amount,
            token_pair,
            ctx,
        );
        token_pair::update_object_version(token_pair);
        token_pair::emit_y_swapped_for_x(y_swapped_for_x);
        swap_y_return
    }

}
