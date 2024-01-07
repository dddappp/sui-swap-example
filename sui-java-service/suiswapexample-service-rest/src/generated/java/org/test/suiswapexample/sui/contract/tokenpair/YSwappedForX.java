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

    private BigInteger expectedX_AmountOut;

    private String sender;

    private String x_TokenType;

    private String y_TokenType;

    private BigInteger x_Amount;

    private BigInteger y_Amount;

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

    public BigInteger getExpectedX_AmountOut() {
        return expectedX_AmountOut;
    }

    public void setExpectedX_AmountOut(BigInteger expectedX_AmountOut) {
        this.expectedX_AmountOut = expectedX_AmountOut;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getX_TokenType() {
        return x_TokenType;
    }

    public void setX_TokenType(String x_TokenType) {
        this.x_TokenType = x_TokenType;
    }

    public String getY_TokenType() {
        return y_TokenType;
    }

    public void setY_TokenType(String y_TokenType) {
        this.y_TokenType = y_TokenType;
    }

    public BigInteger getX_Amount() {
        return x_Amount;
    }

    public void setX_Amount(BigInteger x_Amount) {
        this.x_Amount = x_Amount;
    }

    public BigInteger getY_Amount() {
        return y_Amount;
    }

    public void setY_Amount(BigInteger y_Amount) {
        this.y_Amount = y_Amount;
    }

    @Override
    public String toString() {
        return "YSwappedForX{" +
                "id=" + '\'' + id + '\'' +
                ", version=" + version +
                ", expectedX_AmountOut=" + expectedX_AmountOut +
                ", sender=" + '\'' + sender + '\'' +
                ", x_TokenType=" + '\'' + x_TokenType + '\'' +
                ", y_TokenType=" + '\'' + y_TokenType + '\'' +
                ", x_Amount=" + x_Amount +
                ", y_Amount=" + y_Amount +
                '}';
    }

}