# 一个 Sui Swap（DEX）示例应用

## 需求

可以参考英文版本的 [README.md](./README.md)。

这是一个 Sui Move 的示例项目，用于教学目的。客户是一个 Web3 开发者教育机构。 需求用中文简单说就是：

* 前端可以显示支持的币对列表。

* 用户可以初始化流动性（创建新的可以 swap 的代币对）。

* 用户可以添加流动性。

* 前端可以显示当前账号所占的流动性份额。

* 前端可以显示代币对中的代币储备。即在 X-Y 币对中有多少代币 X 和代币 Y。

* 提供兑换功能。代币 X 换成代币 Y，或者反过来也可以。每笔兑换收取换出代币的 0.3% 作为交易费。

* 用户可以移除流动性。

* 用户“提供流动性”获得的收益来自于手续费，没有其他。

以“教程”为目的，实现可以尽可能简单。

## 前置条件

[TBD]
