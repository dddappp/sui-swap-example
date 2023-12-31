// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.sui.contract;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.wubuku.sui.bean.*;

import java.math.*;
import java.util.*;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Exchange {

    private UID id;

    private String adminCap;

    private BigInteger schemaVersion;

    public String getAdminCap() {
        return adminCap;
    }

    public void setAdminCap(String adminCap) {
        this.adminCap = adminCap;
    }

    public BigInteger getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(BigInteger schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    private Long offChainVersion;

    private String name;

    private String[] tokenPairs;

    private String[] x_TokenTypes;

    private String[] y_TokenTypes;

    private BigInteger version;

    public UID getId() {
        return id;
    }

    public void setId(UID id) {
        this.id = id;
    }

    public Long getOffChainVersion() {
        return offChainVersion;
    }

    public void setOffChainVersion(Long offChainVersion) {
        this.offChainVersion = offChainVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTokenPairs() {
        return tokenPairs;
    }

    public void setTokenPairs(String[] tokenPairs) {
        this.tokenPairs = tokenPairs;
    }

    public String[] getX_TokenTypes() {
        return x_TokenTypes;
    }

    public void setX_TokenTypes(String[] x_TokenTypes) {
        this.x_TokenTypes = x_TokenTypes;
    }

    public String[] getY_TokenTypes() {
        return y_TokenTypes;
    }

    public void setY_TokenTypes(String[] y_TokenTypes) {
        this.y_TokenTypes = y_TokenTypes;
    }

    public BigInteger getVersion() {
        return version;
    }

    public void setVersion(BigInteger version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "id=" + id +
                ", offChainVersion=" + offChainVersion +
                ", name=" + '\'' + name + '\'' +
                ", tokenPairs=" + Arrays.toString(tokenPairs) +
                ", x_TokenTypes=" + Arrays.toString(x_TokenTypes) +
                ", y_TokenTypes=" + Arrays.toString(y_TokenTypes) +
                ", version=" + version +
                '}';
    }
}
