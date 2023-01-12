package net.adminPortal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long PRODUCTID;

    @Column(name = "PRODUCTNAME")
    private String productName;

    @Column(name = "REPORTID")
    private long REPORTID;

    public long getPRODUCTID() {
        return PRODUCTID;
    }

    public void setPRODUCTID(long pRODUCTID) {
        PRODUCTID = pRODUCTID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getREPORTID() {
        return REPORTID;
    }

    public void setREPORTID(long rEPORTID) {
        REPORTID = rEPORTID;
    }

}
