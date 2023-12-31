// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.service;

import com.github.wubuku.sui.bean.*;
import com.github.wubuku.sui.utils.*;
import org.test.suiswapexample.domain.exchange.*;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.sui.contract.DomainBeanUtils;
import org.test.suiswapexample.sui.contract.Exchange;

import java.util.*;
import java.math.*;
import java.util.function.*;

public class SuiExchangeStateRetriever {

    private SuiJsonRpcClient suiJsonRpcClient;

    private Function<String, ExchangeState.MutableExchangeState> exchangeStateFactory;

    public SuiExchangeStateRetriever(SuiJsonRpcClient suiJsonRpcClient,
                                  Function<String, ExchangeState.MutableExchangeState> exchangeStateFactory
    ) {
        this.suiJsonRpcClient = suiJsonRpcClient;
        this.exchangeStateFactory = exchangeStateFactory;
    }

    public ExchangeState retrieveExchangeState(String objectId) {
        SuiMoveObjectResponse<Exchange> getObjectDataResponse = suiJsonRpcClient.getMoveObject(
                objectId, new SuiObjectDataOptions(true, true, true, true, true, true, true), Exchange.class
        );
        if (getObjectDataResponse.getData() == null) {
            return null;
        }
        Exchange exchange = getObjectDataResponse.getData().getContent().getFields();
        return toExchangeState(exchange);
    }

    private ExchangeState toExchangeState(Exchange exchange) {
        ExchangeState.MutableExchangeState exchangeState = exchangeStateFactory.apply(exchange.getId().getId());
        exchangeState.setVersion(exchange.getVersion());
        exchangeState.setName(exchange.getName());
        exchangeState.setTokenPairs(Arrays.asList(exchange.getTokenPairs()));
        exchangeState.setX_TokenTypes(Arrays.asList(exchange.getX_TokenTypes()));
        exchangeState.setY_TokenTypes(Arrays.asList(exchange.getY_TokenTypes()));
        return exchangeState;
    }

    
}

