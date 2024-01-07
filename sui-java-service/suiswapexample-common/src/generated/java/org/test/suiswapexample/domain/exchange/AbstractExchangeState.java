// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.exchange;

import java.util.*;
import java.math.*;
import java.util.Date;
import java.math.BigInteger;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.specialization.*;
import org.test.suiswapexample.domain.exchange.ExchangeEvent.*;

public abstract class AbstractExchangeState implements ExchangeState.SqlExchangeState {

    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Long offChainVersion;

    public Long getOffChainVersion() {
        return this.offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion) {
        this.offChainVersion = offChainVersion;
    }

    private String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    private Date createdAt;

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    private String updatedBy;

    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    private Date updatedAt;

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    private Boolean active;

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    private Boolean deleted;

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    private BigInteger version;

    public BigInteger getVersion() {
        return this.version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    private List<String> tokenPairs;

    public List<String> getTokenPairs() {
        return this.tokenPairs;
    }

    public void setTokenPairs(List<String> tokenPairs) {
        this.tokenPairs = tokenPairs;
    }

    private List<String> xTokenTypes;

    public List<String> getXTokenTypes() {
        return this.xTokenTypes;
    }

    public void setXTokenTypes(List<String> xTokenTypes) {
        this.xTokenTypes = xTokenTypes;
    }

    private List<String> yTokenTypes;

    public List<String> getYTokenTypes() {
        return this.yTokenTypes;
    }

    public void setYTokenTypes(List<String> yTokenTypes) {
        this.yTokenTypes = yTokenTypes;
    }

    public boolean isStateUnsaved() {
        return this.getOffChainVersion() == null;
    }

    private Boolean stateReadOnly;

    public Boolean getStateReadOnly() { return this.stateReadOnly; }

    public void setStateReadOnly(Boolean readOnly) { this.stateReadOnly = readOnly; }

    private boolean forReapplying;

    public boolean getForReapplying() {
        return forReapplying;
    }

    public void setForReapplying(boolean forReapplying) {
        this.forReapplying = forReapplying;
    }

    public AbstractExchangeState(List<Event> events) {
        initializeForReapplying();
        if (events != null && events.size() > 0) {
            this.setId(((ExchangeEvent.SqlExchangeEvent) events.get(0)).getExchangeEventId().getId());
            for (Event e : events) {
                mutate(e);
                this.setOffChainVersion((this.getOffChainVersion() == null ? ExchangeState.VERSION_NULL : this.getOffChainVersion()) + 1);
            }
        }
    }


    public AbstractExchangeState() {
        initializeProperties();
    }

    protected void initializeForReapplying() {
        this.forReapplying = true;

        initializeProperties();
    }
    
    protected void initializeProperties() {
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj instanceof ExchangeState) {
            return Objects.equals(this.getId(), ((ExchangeState)obj).getId());
        }
        return false;
    }


    public void mutate(Event e) {
        setStateReadOnly(false);
        if (false) { 
            ;
        } else if (e instanceof AbstractExchangeEvent.InitExchangeEvent) {
            when((AbstractExchangeEvent.InitExchangeEvent)e);
        } else if (e instanceof AbstractExchangeEvent.TokenPairAddedToExchange) {
            when((AbstractExchangeEvent.TokenPairAddedToExchange)e);
        } else if (e instanceof AbstractExchangeEvent.ExchangeUpdated) {
            when((AbstractExchangeEvent.ExchangeUpdated)e);
        } else {
            throw new UnsupportedOperationException(String.format("Unsupported event type: %1$s", e.getClass().getName()));
        }
    }

    protected void merge(ExchangeState s) {
        if (s == this) {
            return;
        }
        this.setName(s.getName());
        this.setTokenPairs(s.getTokenPairs());
        this.setXTokenTypes(s.getXTokenTypes());
        this.setYTokenTypes(s.getYTokenTypes());
        this.setActive(s.getActive());
        this.setVersion(s.getVersion());
    }

    public void when(AbstractExchangeEvent.InitExchangeEvent e) {
        throwOnWrongEvent(e);

        Long suiTimestamp = e.getSuiTimestamp();
        Long SuiTimestamp = suiTimestamp;
        String suiTxDigest = e.getSuiTxDigest();
        String SuiTxDigest = suiTxDigest;
        BigInteger suiEventSeq = e.getSuiEventSeq();
        BigInteger SuiEventSeq = suiEventSeq;
        String suiPackageId = e.getSuiPackageId();
        String SuiPackageId = suiPackageId;
        String suiTransactionModule = e.getSuiTransactionModule();
        String SuiTransactionModule = suiTransactionModule;
        String suiSender = e.getSuiSender();
        String SuiSender = suiSender;
        String suiType = e.getSuiType();
        String SuiType = suiType;
        String status = e.getStatus();
        String Status = status;

        if (this.getCreatedBy() == null){
            this.setCreatedBy(e.getCreatedBy());
        }
        if (this.getCreatedAt() == null){
            this.setCreatedAt(e.getCreatedAt());
        }
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        ExchangeState updatedExchangeState = (ExchangeState) ReflectUtils.invokeStaticMethod(
                    "org.test.suiswapexample.domain.exchange.__Init__Logic",
                    "mutate",
                    new Class[]{ExchangeState.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new Object[]{this, suiTimestamp, suiTxDigest, suiEventSeq, suiPackageId, suiTransactionModule, suiSender, suiType, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.suiswapexample.domain.exchange;
//
//public class __Init__Logic {
//    public static ExchangeState mutate(ExchangeState exchangeState, Long suiTimestamp, String suiTxDigest, BigInteger suiEventSeq, String suiPackageId, String suiTransactionModule, String suiSender, String suiType, String status, MutationContext<ExchangeState, ExchangeState.MutableExchangeState> mutationContext) {
//    }
//}

        if (this != updatedExchangeState) { merge(updatedExchangeState); } //else do nothing

    }

    public void when(AbstractExchangeEvent.TokenPairAddedToExchange e) {
        throwOnWrongEvent(e);

        String tokenPairId = e.getTokenPairId();
        String TokenPairId = tokenPairId;
        String xTokenType = e.getXTokenType();
        String XTokenType = xTokenType;
        String yTokenType = e.getYTokenType();
        String YTokenType = yTokenType;
        Long suiTimestamp = e.getSuiTimestamp();
        Long SuiTimestamp = suiTimestamp;
        String suiTxDigest = e.getSuiTxDigest();
        String SuiTxDigest = suiTxDigest;
        BigInteger suiEventSeq = e.getSuiEventSeq();
        BigInteger SuiEventSeq = suiEventSeq;
        String suiPackageId = e.getSuiPackageId();
        String SuiPackageId = suiPackageId;
        String suiTransactionModule = e.getSuiTransactionModule();
        String SuiTransactionModule = suiTransactionModule;
        String suiSender = e.getSuiSender();
        String SuiSender = suiSender;
        String suiType = e.getSuiType();
        String SuiType = suiType;
        String status = e.getStatus();
        String Status = status;

        if (this.getCreatedBy() == null){
            this.setCreatedBy(e.getCreatedBy());
        }
        if (this.getCreatedAt() == null){
            this.setCreatedAt(e.getCreatedAt());
        }
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        ExchangeState updatedExchangeState = (ExchangeState) ReflectUtils.invokeStaticMethod(
                    "org.test.suiswapexample.domain.exchange.AddTokenPairLogic",
                    "mutate",
                    new Class[]{ExchangeState.class, String.class, String.class, String.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new Object[]{this, tokenPairId, xTokenType, yTokenType, suiTimestamp, suiTxDigest, suiEventSeq, suiPackageId, suiTransactionModule, suiSender, suiType, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.suiswapexample.domain.exchange;
//
//public class AddTokenPairLogic {
//    public static ExchangeState mutate(ExchangeState exchangeState, String tokenPairId, String xTokenType, String yTokenType, Long suiTimestamp, String suiTxDigest, BigInteger suiEventSeq, String suiPackageId, String suiTransactionModule, String suiSender, String suiType, String status, MutationContext<ExchangeState, ExchangeState.MutableExchangeState> mutationContext) {
//    }
//}

        if (this != updatedExchangeState) { merge(updatedExchangeState); } //else do nothing

    }

    public void when(AbstractExchangeEvent.ExchangeUpdated e) {
        throwOnWrongEvent(e);

        String name = e.getName();
        String Name = name;
        Long suiTimestamp = e.getSuiTimestamp();
        Long SuiTimestamp = suiTimestamp;
        String suiTxDigest = e.getSuiTxDigest();
        String SuiTxDigest = suiTxDigest;
        BigInteger suiEventSeq = e.getSuiEventSeq();
        BigInteger SuiEventSeq = suiEventSeq;
        String suiPackageId = e.getSuiPackageId();
        String SuiPackageId = suiPackageId;
        String suiTransactionModule = e.getSuiTransactionModule();
        String SuiTransactionModule = suiTransactionModule;
        String suiSender = e.getSuiSender();
        String SuiSender = suiSender;
        String suiType = e.getSuiType();
        String SuiType = suiType;
        String status = e.getStatus();
        String Status = status;

        if (this.getCreatedBy() == null){
            this.setCreatedBy(e.getCreatedBy());
        }
        if (this.getCreatedAt() == null){
            this.setCreatedAt(e.getCreatedAt());
        }
        this.setUpdatedBy(e.getCreatedBy());
        this.setUpdatedAt(e.getCreatedAt());

        ExchangeState updatedExchangeState = (ExchangeState) ReflectUtils.invokeStaticMethod(
                    "org.test.suiswapexample.domain.exchange.UpdateLogic",
                    "mutate",
                    new Class[]{ExchangeState.class, String.class, Long.class, String.class, BigInteger.class, String.class, String.class, String.class, String.class, String.class, MutationContext.class},
                    new Object[]{this, name, suiTimestamp, suiTxDigest, suiEventSeq, suiPackageId, suiTransactionModule, suiSender, suiType, status, MutationContext.forEvent(e, s -> {if (s == this) {return this;} else {throw new UnsupportedOperationException();}})}
            );

//package org.test.suiswapexample.domain.exchange;
//
//public class UpdateLogic {
//    public static ExchangeState mutate(ExchangeState exchangeState, String name, Long suiTimestamp, String suiTxDigest, BigInteger suiEventSeq, String suiPackageId, String suiTransactionModule, String suiSender, String suiType, String status, MutationContext<ExchangeState, ExchangeState.MutableExchangeState> mutationContext) {
//    }
//}

        if (this != updatedExchangeState) { merge(updatedExchangeState); } //else do nothing

    }

    public void save() {
    }

    protected void throwOnWrongEvent(ExchangeEvent event) {
        String stateEntityId = this.getId(); // Aggregate Id
        String eventEntityId = ((ExchangeEvent.SqlExchangeEvent)event).getExchangeEventId().getId(); // EntityBase.Aggregate.GetEventIdPropertyIdName();
        if (!stateEntityId.equals(eventEntityId)) {
            throw DomainError.named("mutateWrongEntity", "Entity Id %1$s in state but entity id %2$s in event", stateEntityId, eventEntityId);
        }


        Long stateVersion = this.getOffChainVersion();

    }


    public static class SimpleExchangeState extends AbstractExchangeState {

        public SimpleExchangeState() {
        }

        public SimpleExchangeState(List<Event> events) {
            super(events);
        }

        public static SimpleExchangeState newForReapplying() {
            SimpleExchangeState s = new SimpleExchangeState();
            s.initializeForReapplying();
            return s;
        }

    }



}

