// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain.tokenpair;

import java.util.*;
import java.math.BigInteger;
import java.util.Date;
import org.test.suiswapexample.domain.*;

public class TokenPairCommands {
    private TokenPairCommands() {
    }

    public static class InitializeLiquidity extends AbstractTokenPairCommand implements TokenPairCommand {

        public String getCommandType() {
            return "InitializeLiquidity";
        }

        public void setCommandType(String commandType) {
            //do nothing
        }

        /**
         * Id
         */
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        /**
         * Exchange
         */
        private String exchange;

        public String getExchange() {
            return this.exchange;
        }

        public void setExchange(String exchange) {
            this.exchange = exchange;
        }

        /**
         * Off Chain Version
         */
        private Long offChainVersion;

        public Long getOffChainVersion() {
            return this.offChainVersion;
        }

        public void setOffChainVersion(Long offChainVersion) {
            this.offChainVersion = offChainVersion;
        }

    }

    public static class AddLiquidity extends AbstractTokenPairCommand implements TokenPairCommand {

        public String getCommandType() {
            return "AddLiquidity";
        }

        public void setCommandType(String commandType) {
            //do nothing
        }

        /**
         * Id
         */
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        /**
         * Off Chain Version
         */
        private Long offChainVersion;

        public Long getOffChainVersion() {
            return this.offChainVersion;
        }

        public void setOffChainVersion(Long offChainVersion) {
            this.offChainVersion = offChainVersion;
        }

    }

    public static class RemoveLiquidity extends AbstractTokenPairCommand implements TokenPairCommand {

        public String getCommandType() {
            return "RemoveLiquidity";
        }

        public void setCommandType(String commandType) {
            //do nothing
        }

        /**
         * Id
         */
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        /**
         * Liquidity Token
         */
        private String liquidityToken;

        public String getLiquidityToken() {
            return this.liquidityToken;
        }

        public void setLiquidityToken(String liquidityToken) {
            this.liquidityToken = liquidityToken;
        }

        /**
         * Off Chain Version
         */
        private Long offChainVersion;

        public Long getOffChainVersion() {
            return this.offChainVersion;
        }

        public void setOffChainVersion(Long offChainVersion) {
            this.offChainVersion = offChainVersion;
        }

    }

    public static class SwapX extends AbstractTokenPairCommand implements TokenPairCommand {

        public String getCommandType() {
            return "SwapX";
        }

        public void setCommandType(String commandType) {
            //do nothing
        }

        /**
         * Id
         */
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        /**
         * Expected Y Amount Out
         */
        private BigInteger expectedYAmountOut;

        public BigInteger getExpectedYAmountOut() {
            return this.expectedYAmountOut;
        }

        public void setExpectedYAmountOut(BigInteger expectedYAmountOut) {
            this.expectedYAmountOut = expectedYAmountOut;
        }

        /**
         * Off Chain Version
         */
        private Long offChainVersion;

        public Long getOffChainVersion() {
            return this.offChainVersion;
        }

        public void setOffChainVersion(Long offChainVersion) {
            this.offChainVersion = offChainVersion;
        }

    }

    public static class SwapY extends AbstractTokenPairCommand implements TokenPairCommand {

        public String getCommandType() {
            return "SwapY";
        }

        public void setCommandType(String commandType) {
            //do nothing
        }

        /**
         * Id
         */
        private String id;

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        /**
         * Expected X Amount Out
         */
        private BigInteger expectedXAmountOut;

        public BigInteger getExpectedXAmountOut() {
            return this.expectedXAmountOut;
        }

        public void setExpectedXAmountOut(BigInteger expectedXAmountOut) {
            this.expectedXAmountOut = expectedXAmountOut;
        }

        /**
         * Off Chain Version
         */
        private Long offChainVersion;

        public Long getOffChainVersion() {
            return this.offChainVersion;
        }

        public void setOffChainVersion(Long offChainVersion) {
            this.offChainVersion = offChainVersion;
        }

    }

}

