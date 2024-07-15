package com.mobile.integration.grandstores.BinTransferTrack.BinTransferTrackEntity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "XXGS_BIN_TRNS_PICK")
public class BinTransferTrackPickEO {
 
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lnsseq")
    @SequenceGenerator(name = "lnsseq", sequenceName = "xxgs_bin_trns_pick_line_id_s", allocationSize = 1)
    @Column(name = "LINE_ID")
    public BigDecimal lineId;

    @Column(name = "HEADER_ID")
    public BigDecimal headerId;


    @Column(name = "INV_ORG")
    public String invOrg;
    
    @Column(name = "INV_ORG_ID")
    public BigDecimal invOrgId;
    
    @Column(name = "INVENTORY_ITEM_ID")
    public BigDecimal inventoryItemId;
    
    @Column(name = "ITEM_CODE")
    public String itemCode;
    
    @Column(name = "DESCRIPTION")
    public String description;
    
    @Column(name = "UOM")
    public String uom;
    
    @Column(name = "PICKED_QTY")
    public BigDecimal pickedQty;
    
    @Column(name = "PICKED_SUBINV")
    public String pickedSubinv;
    
    @Column(name = "PICKED_LOCATOR")
    public String pickedLocator;
    
    @Column(name = "PICKED_LOCATOR_ID")
    public String pickedlocatorId;
    
    @Column(name = "TYPE")
    public String type;
    
    @Column(name = "ATTRIBUTE_CATEGORY")
    public String attributeCategory;
    
    @Column(name = "ATTRIBUTE1")
    public String attribute1;
    
    @Column(name = "ATTRIBUTE2")
    public String attribute2;
    
    @Column(name = "ATTRIBUTE3")
    public String attribute3;
    
    @Column(name = "ATTRIBUTE4")
    public String attribute4;
    
    @Column(name = "ATTRIBUTE5")
    public String attribute5;
    
    @Column(name = "ATTRIBUTE6")
    public String attribute6;
    
    @Column(name = "ATTRIBUTE7")
    public String attribute7;
    
    @Column(name = "ATTRIBUTE8")
    public String attribute8;
    
    @Column(name = "ATTRIBUTE9")
    public String attribute9;
    
    @Column(name = "ATTRIBUTE10")
    public String attribute10;
    
    @Column(name = "LAST_UPDATE_DATE")
    public Date lastUpdateDate;
    
    @Column(name = "LAST_UPDATED_BY")
    public BigDecimal lastUpdatedBy;
    
    @Column(name = "CREATION_DATE")
    public Date creationDate;
    
    @Column(name = "CREATED_BY")
    public BigDecimal createdBy;
    
    @Column(name = "LAST_UPDATE_LOGIN")
    public BigDecimal lastUpdateLogin;

    public BinTransferTrackPickEO() {
    }

    public BinTransferTrackPickEO(BigDecimal headerId, BigDecimal lineId, String invOrg, BigDecimal invOrgId,
            BigDecimal inventoryItemId, String itemCode, String description, String uom, BigDecimal pickedQty,
            String pickedSubinv, String pickedLocator, String pickedlocatorId, String type, String attributeCategory,
            String attribute1, String attribute2, String attribute3, String attribute4, String attribute5,
            String attribute6, String attribute7, String attribute8, String attribute9, String attribute10,
            Date lastUpdateDate, BigDecimal lastUpdatedBy, Date creationDate, BigDecimal createdBy,
            BigDecimal lastUpdateLogin) {
        this.headerId = headerId;
        this.lineId = lineId;
        this.invOrg = invOrg;
        this.invOrgId = invOrgId;
        this.inventoryItemId = inventoryItemId;
        this.itemCode = itemCode;
        this.description = description;
        this.uom = uom;
        this.pickedQty = pickedQty;
        this.pickedSubinv = pickedSubinv;
        this.pickedLocator = pickedLocator;
        this.pickedlocatorId = pickedlocatorId;
        this.type = type;
        this.attributeCategory = attributeCategory;
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
        this.attribute3 = attribute3;
        this.attribute4 = attribute4;
        this.attribute5 = attribute5;
        this.attribute6 = attribute6;
        this.attribute7 = attribute7;
        this.attribute8 = attribute8;
        this.attribute9 = attribute9;
        this.attribute10 = attribute10;
        this.lastUpdateDate = lastUpdateDate;
        this.lastUpdatedBy = lastUpdatedBy;
        this.creationDate = creationDate;
        this.createdBy = createdBy;
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public BigDecimal getHeaderId() {
        return headerId;
    }

    public void setHeaderId(BigDecimal headerId) {
        this.headerId = headerId;
    }

    public BigDecimal getLineId() {
        return lineId;
    }

    public void setLineId(BigDecimal lineId) {
        this.lineId = lineId;
    }

    public String getInvOrg() {
        return invOrg;
    }

    public void setInvOrg(String invOrg) {
        this.invOrg = invOrg;
    }

    public BigDecimal getInvOrgId() {
        return invOrgId;
    }

    public void setInvOrgId(BigDecimal invOrgId) {
        this.invOrgId = invOrgId;
    }

    public BigDecimal getInventoryItemId() {
        return inventoryItemId;
    }

    public void setInventoryItemId(BigDecimal inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUom() {
        return uom;
    }

    public void setUom(String uom) {
        this.uom = uom;
    }

    public BigDecimal getPickedQty() {
        return pickedQty;
    }

    public void setPickedQty(BigDecimal pickedQty) {
        this.pickedQty = pickedQty;
    }

    public String getPickedSubinv() {
        return pickedSubinv;
    }

    public void setPickedSubinv(String pickedSubinv) {
        this.pickedSubinv = pickedSubinv;
    }

    public String getPickedLocator() {
        return pickedLocator;
    }

    public void setPickedLocator(String pickedLocator) {
        this.pickedLocator = pickedLocator;
    }

    public String getPickedlocatorId() {
        return pickedlocatorId;
    }

    public void setPickedlocatorId(String pickedlocatorId) {
        this.pickedlocatorId = pickedlocatorId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3;
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4;
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5;
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6;
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7;
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8;
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9;
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(BigDecimal lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    
    
    



}