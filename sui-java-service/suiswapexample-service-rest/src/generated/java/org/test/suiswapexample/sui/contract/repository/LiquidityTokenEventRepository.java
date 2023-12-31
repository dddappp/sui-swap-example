// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.repository;

import org.test.suiswapexample.domain.liquiditytoken.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface LiquidityTokenEventRepository extends JpaRepository<AbstractLiquidityTokenEvent, LiquidityTokenEventId> {

    List<AbstractLiquidityTokenEvent> findByStatusIsNull();

    AbstractLiquidityTokenEvent.LiquidityTokenMinted findFirstLiquidityTokenMintedByOrderBySuiTimestampDesc();

    AbstractLiquidityTokenEvent.LiquidityTokenDestroyed findFirstLiquidityTokenDestroyedByOrderBySuiTimestampDesc();

}
