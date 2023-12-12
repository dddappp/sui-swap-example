// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module sui_swap_example::liquidity {
    friend sui_swap_example::token_pair_initialize_liquidity_logic;
    friend sui_swap_example::token_pair_add_liquidity_logic;
    friend sui_swap_example::token_pair_remove_liquidity_logic;
    friend sui_swap_example::token_pair_swap_x_logic;
    friend sui_swap_example::token_pair_swap_y_logic;
    friend sui_swap_example::token_pair;

    #[allow(unused_const)]
    const EDataTooLong: u64 = 102;

    struct Liquidity has store {
        provider: address,
        amount: u64,
    }

    public fun provider(liquidity: &Liquidity): address {
        liquidity.provider
    }

    public fun amount(liquidity: &Liquidity): u64 {
        liquidity.amount
    }

    public(friend) fun set_amount(liquidity: &mut Liquidity, amount: u64) {
        liquidity.amount = amount;
    }

    public(friend) fun new_liquidity(
        provider: address,
        amount: u64,
    ): Liquidity {
        Liquidity {
            provider,
            amount,
        }
    }

    public(friend) fun drop_liquidity(liquidity: Liquidity) {
        let Liquidity {
            provider: _,
            amount: _,
        } = liquidity;
    }


}
