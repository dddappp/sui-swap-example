// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.service;

import com.github.wubuku.sui.utils.SuiJsonRpcClient;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.domain.liquiditytoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.math.*;

@Service
public class SuiLiquidityTokenService {

    @Autowired
    private LiquidityTokenStateRepository liquidityTokenStateRepository;

    private SuiLiquidityTokenStateRetriever suiLiquidityTokenStateRetriever;

    @Autowired
    public SuiLiquidityTokenService(SuiJsonRpcClient suiJsonRpcClient) {
        this.suiLiquidityTokenStateRetriever = new SuiLiquidityTokenStateRetriever(suiJsonRpcClient,
                id -> {
                    LiquidityTokenState.MutableLiquidityTokenState s = new AbstractLiquidityTokenState.SimpleLiquidityTokenState();
                    s.setId(id);
                    return s;
                }
        );
    }

    @Transactional
    public void updateLiquidityTokenState(String objectId) {
        LiquidityTokenState liquidityTokenState = suiLiquidityTokenStateRetriever.retrieveLiquidityTokenState(objectId);
        if (liquidityTokenState == null) {
            return;
        }
        liquidityTokenStateRepository.merge(liquidityTokenState);
    }

    @Transactional
    public void deleteLiquidityToken(String objectId) {
        LiquidityTokenState.MutableLiquidityTokenState s = (LiquidityTokenState.MutableLiquidityTokenState) liquidityTokenStateRepository.get(objectId, true);
        if (s != null) {
            s.setDeleted(true);
            liquidityTokenStateRepository.merge(s);
        }
    }

}

