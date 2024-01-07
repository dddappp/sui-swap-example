// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.service;

import com.github.wubuku.sui.bean.EventId;
import com.github.wubuku.sui.bean.Page;
import com.github.wubuku.sui.bean.PaginatedMoveEvents;
import com.github.wubuku.sui.bean.SuiMoveEventEnvelope;
import com.github.wubuku.sui.utils.SuiJsonRpcClient;
import org.test.suiswapexample.domain.tokenpair.AbstractTokenPairEvent;
import org.test.suiswapexample.sui.contract.ContractConstants;
import org.test.suiswapexample.sui.contract.DomainBeanUtils;
import org.test.suiswapexample.sui.contract.SuiPackage;
import org.test.suiswapexample.sui.contract.tokenpair.LiquidityInitialized;
import org.test.suiswapexample.sui.contract.tokenpair.LiquidityAdded;
import org.test.suiswapexample.sui.contract.tokenpair.LiquidityRemoved;
import org.test.suiswapexample.sui.contract.tokenpair.XSwappedForY;
import org.test.suiswapexample.sui.contract.tokenpair.YSwappedForX;
import org.test.suiswapexample.sui.contract.repository.TokenPairEventRepository;
import org.test.suiswapexample.sui.contract.repository.SuiPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TokenPairEventService {

    @Autowired
    private SuiPackageRepository suiPackageRepository;

    @Autowired
    private SuiJsonRpcClient suiJsonRpcClient;

    @Autowired
    private TokenPairEventRepository tokenPairEventRepository;

    @Transactional
    public void updateStatusToProcessed(AbstractTokenPairEvent event) {
        event.setStatus("D");
        tokenPairEventRepository.save(event);
    }

    @Transactional
    public void pullLiquidityInitializedEvents() {
        String packageId = getDefaultSuiPackageId();
        if (packageId == null) {
            return;
        }
        int limit = 1;
        EventId cursor = getLiquidityInitializedEventNextCursor();
        while (true) {
            PaginatedMoveEvents<LiquidityInitialized> eventPage = suiJsonRpcClient.queryMoveEvents(
                    packageId + "::" + ContractConstants.TOKEN_PAIR_MODULE_LIQUIDITY_INITIALIZED,
                    cursor, limit, false, LiquidityInitialized.class);

            if (eventPage.getData() != null && !eventPage.getData().isEmpty()) {
                cursor = eventPage.getNextCursor();
                for (SuiMoveEventEnvelope<LiquidityInitialized> eventEnvelope : eventPage.getData()) {
                    saveLiquidityInitialized(eventEnvelope);
                }
            } else {
                break;
            }
            if (!Page.hasNextPage(eventPage)) {
                break;
            }
        }
    }

    private EventId getLiquidityInitializedEventNextCursor() {
        AbstractTokenPairEvent lastEvent = tokenPairEventRepository.findFirstLiquidityInitializedByOrderBySuiTimestampDesc();
        return lastEvent != null ? new EventId(lastEvent.getSuiTxDigest(), lastEvent.getSuiEventSeq() + "") : null;
    }

    private void saveLiquidityInitialized(SuiMoveEventEnvelope<LiquidityInitialized> eventEnvelope) {
        AbstractTokenPairEvent.LiquidityInitialized liquidityInitialized = DomainBeanUtils.toLiquidityInitialized(eventEnvelope);
        if (tokenPairEventRepository.findById(liquidityInitialized.getTokenPairEventId()).isPresent()) {
            return;
        }
        tokenPairEventRepository.save(liquidityInitialized);
    }

    @Transactional
    public void pullLiquidityAddedEvents() {
        String packageId = getDefaultSuiPackageId();
        if (packageId == null) {
            return;
        }
        int limit = 1;
        EventId cursor = getLiquidityAddedEventNextCursor();
        while (true) {
            PaginatedMoveEvents<LiquidityAdded> eventPage = suiJsonRpcClient.queryMoveEvents(
                    packageId + "::" + ContractConstants.TOKEN_PAIR_MODULE_LIQUIDITY_ADDED,
                    cursor, limit, false, LiquidityAdded.class);

            if (eventPage.getData() != null && !eventPage.getData().isEmpty()) {
                cursor = eventPage.getNextCursor();
                for (SuiMoveEventEnvelope<LiquidityAdded> eventEnvelope : eventPage.getData()) {
                    saveLiquidityAdded(eventEnvelope);
                }
            } else {
                break;
            }
            if (!Page.hasNextPage(eventPage)) {
                break;
            }
        }
    }

    private EventId getLiquidityAddedEventNextCursor() {
        AbstractTokenPairEvent lastEvent = tokenPairEventRepository.findFirstLiquidityAddedByOrderBySuiTimestampDesc();
        return lastEvent != null ? new EventId(lastEvent.getSuiTxDigest(), lastEvent.getSuiEventSeq() + "") : null;
    }

    private void saveLiquidityAdded(SuiMoveEventEnvelope<LiquidityAdded> eventEnvelope) {
        AbstractTokenPairEvent.LiquidityAdded liquidityAdded = DomainBeanUtils.toLiquidityAdded(eventEnvelope);
        if (tokenPairEventRepository.findById(liquidityAdded.getTokenPairEventId()).isPresent()) {
            return;
        }
        tokenPairEventRepository.save(liquidityAdded);
    }

    @Transactional
    public void pullLiquidityRemovedEvents() {
        String packageId = getDefaultSuiPackageId();
        if (packageId == null) {
            return;
        }
        int limit = 1;
        EventId cursor = getLiquidityRemovedEventNextCursor();
        while (true) {
            PaginatedMoveEvents<LiquidityRemoved> eventPage = suiJsonRpcClient.queryMoveEvents(
                    packageId + "::" + ContractConstants.TOKEN_PAIR_MODULE_LIQUIDITY_REMOVED,
                    cursor, limit, false, LiquidityRemoved.class);

            if (eventPage.getData() != null && !eventPage.getData().isEmpty()) {
                cursor = eventPage.getNextCursor();
                for (SuiMoveEventEnvelope<LiquidityRemoved> eventEnvelope : eventPage.getData()) {
                    saveLiquidityRemoved(eventEnvelope);
                }
            } else {
                break;
            }
            if (!Page.hasNextPage(eventPage)) {
                break;
            }
        }
    }

    private EventId getLiquidityRemovedEventNextCursor() {
        AbstractTokenPairEvent lastEvent = tokenPairEventRepository.findFirstLiquidityRemovedByOrderBySuiTimestampDesc();
        return lastEvent != null ? new EventId(lastEvent.getSuiTxDigest(), lastEvent.getSuiEventSeq() + "") : null;
    }

    private void saveLiquidityRemoved(SuiMoveEventEnvelope<LiquidityRemoved> eventEnvelope) {
        AbstractTokenPairEvent.LiquidityRemoved liquidityRemoved = DomainBeanUtils.toLiquidityRemoved(eventEnvelope);
        if (tokenPairEventRepository.findById(liquidityRemoved.getTokenPairEventId()).isPresent()) {
            return;
        }
        tokenPairEventRepository.save(liquidityRemoved);
    }

    @Transactional
    public void pullXSwappedForYEvents() {
        String packageId = getDefaultSuiPackageId();
        if (packageId == null) {
            return;
        }
        int limit = 1;
        EventId cursor = getXSwappedForYEventNextCursor();
        while (true) {
            PaginatedMoveEvents<XSwappedForY> eventPage = suiJsonRpcClient.queryMoveEvents(
                    packageId + "::" + ContractConstants.TOKEN_PAIR_MODULE_X_SWAPPED_FOR_Y,
                    cursor, limit, false, XSwappedForY.class);

            if (eventPage.getData() != null && !eventPage.getData().isEmpty()) {
                cursor = eventPage.getNextCursor();
                for (SuiMoveEventEnvelope<XSwappedForY> eventEnvelope : eventPage.getData()) {
                    saveXSwappedForY(eventEnvelope);
                }
            } else {
                break;
            }
            if (!Page.hasNextPage(eventPage)) {
                break;
            }
        }
    }

    private EventId getXSwappedForYEventNextCursor() {
        AbstractTokenPairEvent lastEvent = tokenPairEventRepository.findFirstXSwappedForYByOrderBySuiTimestampDesc();
        return lastEvent != null ? new EventId(lastEvent.getSuiTxDigest(), lastEvent.getSuiEventSeq() + "") : null;
    }

    private void saveXSwappedForY(SuiMoveEventEnvelope<XSwappedForY> eventEnvelope) {
        AbstractTokenPairEvent.XSwappedForY xSwappedForY = DomainBeanUtils.toXSwappedForY(eventEnvelope);
        if (tokenPairEventRepository.findById(xSwappedForY.getTokenPairEventId()).isPresent()) {
            return;
        }
        tokenPairEventRepository.save(xSwappedForY);
    }

    @Transactional
    public void pullYSwappedForXEvents() {
        String packageId = getDefaultSuiPackageId();
        if (packageId == null) {
            return;
        }
        int limit = 1;
        EventId cursor = getYSwappedForXEventNextCursor();
        while (true) {
            PaginatedMoveEvents<YSwappedForX> eventPage = suiJsonRpcClient.queryMoveEvents(
                    packageId + "::" + ContractConstants.TOKEN_PAIR_MODULE_Y_SWAPPED_FOR_X,
                    cursor, limit, false, YSwappedForX.class);

            if (eventPage.getData() != null && !eventPage.getData().isEmpty()) {
                cursor = eventPage.getNextCursor();
                for (SuiMoveEventEnvelope<YSwappedForX> eventEnvelope : eventPage.getData()) {
                    saveYSwappedForX(eventEnvelope);
                }
            } else {
                break;
            }
            if (!Page.hasNextPage(eventPage)) {
                break;
            }
        }
    }

    private EventId getYSwappedForXEventNextCursor() {
        AbstractTokenPairEvent lastEvent = tokenPairEventRepository.findFirstYSwappedForXByOrderBySuiTimestampDesc();
        return lastEvent != null ? new EventId(lastEvent.getSuiTxDigest(), lastEvent.getSuiEventSeq() + "") : null;
    }

    private void saveYSwappedForX(SuiMoveEventEnvelope<YSwappedForX> eventEnvelope) {
        AbstractTokenPairEvent.YSwappedForX ySwappedForX = DomainBeanUtils.toYSwappedForX(eventEnvelope);
        if (tokenPairEventRepository.findById(ySwappedForX.getTokenPairEventId()).isPresent()) {
            return;
        }
        tokenPairEventRepository.save(ySwappedForX);
    }


    private String getDefaultSuiPackageId() {
        return suiPackageRepository.findById(ContractConstants.DEFAULT_SUI_PACKAGE_NAME)
                .map(SuiPackage::getObjectId).orElse(null);
    }
}
