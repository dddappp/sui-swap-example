// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

module sui_swap_example::x_swapped_for_y {

    use std::string::String;
    use sui::object;
    use sui_swap_example::token_pair::{Self, XSwappedForY};

    public fun id(x_swapped_for_y: &XSwappedForY): object::ID {
        token_pair::x_swapped_for_y_id(x_swapped_for_y)
    }

    public fun sender(x_swapped_for_y: &XSwappedForY): address {
        token_pair::x_swapped_for_y_sender(x_swapped_for_y)
    }

    public fun x_token_type(x_swapped_for_y: &XSwappedForY): String {
        token_pair::x_swapped_for_y_x_token_type(x_swapped_for_y)
    }

    public fun y_token_type(x_swapped_for_y: &XSwappedForY): String {
        token_pair::x_swapped_for_y_y_token_type(x_swapped_for_y)
    }

    public fun x_amount(x_swapped_for_y: &XSwappedForY): u64 {
        token_pair::x_swapped_for_y_x_amount(x_swapped_for_y)
    }

    public fun y_amount(x_swapped_for_y: &XSwappedForY): u64 {
        token_pair::x_swapped_for_y_y_amount(x_swapped_for_y)
    }

}
