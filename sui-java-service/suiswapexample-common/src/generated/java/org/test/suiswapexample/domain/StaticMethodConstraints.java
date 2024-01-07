// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain;

import org.test.suiswapexample.specialization.ReflectUtils;
import org.test.suiswapexample.specialization.MutationContext;
import org.test.suiswapexample.specialization.VerificationContext;
import org.test.suiswapexample.domain.tokenpair.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.domain.liquiditytoken.*;
import org.test.suiswapexample.domain.exchange.*;

public class StaticMethodConstraints {

    public static void assertStaticVerificationAndMutationMethods() {

        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.tokenpair.InitializeLiquidityLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, TokenPairState.class, String.class, VerificationContext.class},
                    new String[]{"_", "_", "exchange"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.tokenpair.AddLiquidityLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, TokenPairState.class, VerificationContext.class},
                    new String[]{"_", "_"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.tokenpair.RemoveLiquidityLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, TokenPairState.class, String.class, VerificationContext.class},
                    new String[]{"_", "_", "liquidityToken"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.tokenpair.SwapXLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, TokenPairState.class, BigInteger.class, VerificationContext.class},
                    new String[]{"_", "_", "expectedYAmountOut"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.tokenpair.SwapYLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, TokenPairState.class, BigInteger.class, VerificationContext.class},
                    new String[]{"_", "_", "expectedXAmountOut"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.liquiditytoken.MintLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, LiquidityTokenState.class, BigInteger.class, VerificationContext.class},
                    new String[]{"_", "_", "amount"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.liquiditytoken.DestroyLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, LiquidityTokenState.class, VerificationContext.class},
                    new String[]{"_", "_"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.exchange.__Init__Logic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, ExchangeState.class, VerificationContext.class},
                    new String[]{"_", "_"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.exchange.AddTokenPairLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, ExchangeState.class, String.class, VerificationContext.class},
                    new String[]{"_", "_", "tokenPairId"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.exchange.UpdateLogic",
                    "verify",
                    new Class[]{java.util.function.Supplier.class, ExchangeState.class, String.class, VerificationContext.class},
                    new String[]{"_", "_", "name"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.liquiditytoken.MintLogic",
                    "mutate",
                    new Class[]{LiquidityTokenState.class, BigInteger.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new String[]{"_", "amount", "suiTimestamp", "suiTxDigest", "suiEventSeq", "suiPackageId", "suiTransactionModule", "suiSender", "suiType", "status"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.liquiditytoken.DestroyLogic",
                    "mutate",
                    new Class[]{LiquidityTokenState.class, BigInteger.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new String[]{"_", "amount", "suiTimestamp", "suiTxDigest", "suiEventSeq", "suiPackageId", "suiTransactionModule", "suiSender", "suiType", "status"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.exchange.__Init__Logic",
                    "mutate",
                    new Class[]{ExchangeState.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new String[]{"_", "suiTimestamp", "suiTxDigest", "suiEventSeq", "suiPackageId", "suiTransactionModule", "suiSender", "suiType", "status"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.exchange.AddTokenPairLogic",
                    "mutate",
                    new Class[]{ExchangeState.class, String.class, String.class, String.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new String[]{"_", "tokenPairId", "xTokenType", "yTokenType", "suiTimestamp", "suiTxDigest", "suiEventSeq", "suiPackageId", "suiTransactionModule", "suiSender", "suiType", "status"}
            );


        ReflectUtils.assertStaticMethodIfClassExists(
                    "org.test.suiswapexample.domain.exchange.UpdateLogic",
                    "mutate",
                    new Class[]{ExchangeState.class, String.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new String[]{"_", "name", "suiTimestamp", "suiTxDigest", "suiEventSeq", "suiPackageId", "suiTransactionModule", "suiSender", "suiType", "status"}
            );



    }

}


