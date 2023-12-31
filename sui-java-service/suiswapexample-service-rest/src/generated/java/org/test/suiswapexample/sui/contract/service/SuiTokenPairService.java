// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.service;

import com.github.wubuku.sui.utils.SuiJsonRpcClient;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.domain.tokenpair.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.math.*;

@Service
public class SuiTokenPairService {

    @Autowired
    private TokenPairStateRepository tokenPairStateRepository;

    private SuiTokenPairStateRetriever suiTokenPairStateRetriever;

    @Autowired
    public SuiTokenPairService(SuiJsonRpcClient suiJsonRpcClient) {
        this.suiTokenPairStateRetriever = new SuiTokenPairStateRetriever(suiJsonRpcClient,
                id -> {
                    TokenPairState.MutableTokenPairState s = new AbstractTokenPairState.SimpleTokenPairState();
                    s.setId(id);
                    return s;
                }
        );
    }

    @Transactional
    public void updateTokenPairState(String objectId) {
        TokenPairState tokenPairState = suiTokenPairStateRetriever.retrieveTokenPairState(objectId);
        if (tokenPairState == null) {
            return;
        }
        tokenPairStateRepository.merge(tokenPairState);
    }

}

