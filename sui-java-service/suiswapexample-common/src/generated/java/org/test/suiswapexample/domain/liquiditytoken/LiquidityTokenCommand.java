// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.liquiditytoken;

import java.util.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.suiswapexample.domain.*;
import org.test.suiswapexample.domain.Command;
import org.test.suiswapexample.specialization.DomainError;

public interface LiquidityTokenCommand extends Command {

    String getId();

    void setId(String id);

    Long getOffChainVersion();

    void setOffChainVersion(Long offChainVersion);

    static void throwOnInvalidStateTransition(LiquidityTokenState state, Command c) {
        if (state.getOffChainVersion() == null) {
            if (isCommandCreate((LiquidityTokenCommand)c)) {
                return;
            }
            throw DomainError.named("premature", "Can't do anything to unexistent aggregate");
        }
        if (state.getDeleted() != null && state.getDeleted()) {
            throw DomainError.named("zombie", "Can't do anything to deleted aggregate.");
        }
        if (isCommandCreate((LiquidityTokenCommand)c))
            throw DomainError.named("rebirth", "Can't create aggregate that already exists");
    }

    static boolean isCommandCreate(LiquidityTokenCommand c) {
        if (c.getOffChainVersion().equals(LiquidityTokenState.VERSION_NULL))
            return true;
        return false;
    }

}

