// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract.tokenpair;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import org.test.suiswapexample.sui.contract.*;

import java.math.*;
import java.util.*;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class YSwappedForX {
    private String id;

    private BigInteger version;

    private BigInteger expectedXAmountOut;

    private String sender;

    private String xTokenType;

    private String yTokenType;

    private BigInteger xAmount;

    private BigInteger yAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    public BigInteger getExpectedXAmountOut() {
        return expectedXAmountOut;
    }

    public void setExpectedXAmountOut(BigInteger expectedXAmountOut) {
        this.expectedXAmountOut = expectedXAmountOut;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getXTokenType() {
        return xTokenType;
    }

    public void setXTokenType(String xTokenType) {
        this.xTokenType = xTokenType;
    }

    public String getYTokenType() {
        return yTokenType;
    }

    public void setYTokenType(String yTokenType) {
        this.yTokenType = yTokenType;
    }

    public BigInteger getXAmount() {
        return xAmount;
    }

    public void setXAmount(BigInteger xAmount) {
        this.xAmount = xAmount;
    }

    public BigInteger getYAmount() {
        return yAmount;
    }

    public void setYAmount(BigInteger yAmount) {
        this.yAmount = yAmount;
    }

    @Override
    public String toString() {
        return "YSwappedForX{" +
                "id=" + '\'' + id + '\'' +
                ", version=" + version +
                ", expectedXAmountOut=" + expectedXAmountOut +
                ", sender=" + '\'' + sender + '\'' +
                ", xTokenType=" + '\'' + xTokenType + '\'' +
                ", yTokenType=" + '\'' + yTokenType + '\'' +
                ", xAmount=" + xAmount +
                ", yAmount=" + yAmount +
                '}';
    }

}
