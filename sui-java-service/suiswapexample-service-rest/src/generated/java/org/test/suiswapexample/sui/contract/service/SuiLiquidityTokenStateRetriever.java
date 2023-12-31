// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.service;

import com.github.wubuku.sui.bean.*;
import com.github.wubuku.sui.utils.*;
import org.test.suiswapexample.domain.liquiditytoken.*;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.sui.contract.DomainBeanUtils;
import org.test.suiswapexample.sui.contract.LiquidityToken;

import java.util.*;
import java.math.*;
import java.util.function.*;

public class SuiLiquidityTokenStateRetriever {

    private SuiJsonRpcClient suiJsonRpcClient;

    private Function<String, LiquidityTokenState.MutableLiquidityTokenState> liquidityTokenStateFactory;

    public SuiLiquidityTokenStateRetriever(SuiJsonRpcClient suiJsonRpcClient,
                                  Function<String, LiquidityTokenState.MutableLiquidityTokenState> liquidityTokenStateFactory
    ) {
        this.suiJsonRpcClient = suiJsonRpcClient;
        this.liquidityTokenStateFactory = liquidityTokenStateFactory;
    }

    public LiquidityTokenState retrieveLiquidityTokenState(String objectId) {
        SuiMoveObjectResponse<LiquidityToken> getObjectDataResponse = suiJsonRpcClient.getMoveObject(
                objectId, new SuiObjectDataOptions(true, true, true, true, true, true, true), LiquidityToken.class
        );
        if (getObjectDataResponse.getData() == null) {
            return null;
        }
        LiquidityToken liquidityToken = getObjectDataResponse.getData().getContent().getFields();
        List<String> typeArgs = DomainBeanUtils.extractTypeArguments(getObjectDataResponse.getData().getContent().getType());
        return toLiquidityTokenState(liquidityToken, typeArgs);
    }

    private LiquidityTokenState toLiquidityTokenState(LiquidityToken liquidityToken , List<String> typeArgs) {
        LiquidityTokenState.MutableLiquidityTokenState liquidityTokenState = liquidityTokenStateFactory.apply(liquidityToken.getId().getId());
        liquidityTokenState.setVersion(BigInteger.valueOf(-1));
        liquidityTokenState.setAmount(liquidityToken.getAmount());
        liquidityTokenState.setX_TokenType(typeArgs.get(0));
        liquidityTokenState.setY_TokenType(typeArgs.get(1));
        return liquidityTokenState;
    }

    
}

