// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.service;

import com.github.wubuku.sui.utils.SuiJsonRpcClient;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.domain.exchange.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.math.*;

@Service
public class SuiExchangeService {

    @Autowired
    private ExchangeStateRepository exchangeStateRepository;

    private SuiExchangeStateRetriever suiExchangeStateRetriever;

    @Autowired
    public SuiExchangeService(SuiJsonRpcClient suiJsonRpcClient) {
        this.suiExchangeStateRetriever = new SuiExchangeStateRetriever(suiJsonRpcClient,
                id -> {
                    ExchangeState.MutableExchangeState s = new AbstractExchangeState.SimpleExchangeState();
                    s.setId(id);
                    return s;
                }
        );
    }

    @Transactional
    public void updateExchangeState(String objectId) {
        ExchangeState exchangeState = suiExchangeStateRetriever.retrieveExchangeState(objectId);
        if (exchangeState == null) {
            return;
        }
        exchangeStateRepository.merge(exchangeState);
    }

}
