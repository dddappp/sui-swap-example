// <autogenerated>
//   This file was generated by dddappp code generator.
//   Any changes made to this file manually will be lost next time the file is regenerated.
// </autogenerated>

package org.test.suiswapexample.domain;

import java.io.Serializable;
import java.math.BigInteger;
import org.test.suiswapexample.domain.*;

public class SuiEventId implements Serializable {
    private String txDigest;

    public String getTxDigest()
    {
        return this.txDigest;
    }

    public void setTxDigest(String txDigest)
    {
        this.txDigest = txDigest;
    }

    private BigInteger eventSeq;

    public BigInteger getEventSeq()
    {
        return this.eventSeq;
    }

    public void setEventSeq(BigInteger eventSeq)
    {
        this.eventSeq = eventSeq;
    }

    public SuiEventId()
    {
    }

    public SuiEventId(String txDigest, BigInteger eventSeq)
    {
        this.txDigest = txDigest;
        this.eventSeq = eventSeq;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        SuiEventId other = (SuiEventId)obj;
        return true 
            && (txDigest == other.txDigest || (txDigest != null && txDigest.equals(other.txDigest)))
            && (eventSeq == other.eventSeq || (eventSeq != null && eventSeq.equals(other.eventSeq)))
            ;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        if (this.txDigest != null) {
            hash += 13 * this.txDigest.hashCode();
        }
        if (this.eventSeq != null) {
            hash += 13 * this.eventSeq.hashCode();
        }
        return hash;
    }

    @Override
    public String toString() {
        return "SuiEventId{" +
                "txDigest=" + '\'' + txDigest + '\'' +
                ", eventSeq=" + eventSeq +
                '}';
    }


}

