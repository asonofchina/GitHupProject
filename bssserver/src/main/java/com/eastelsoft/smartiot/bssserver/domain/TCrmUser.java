package com.eastelsoft.smartiot.bssserver.domain;

import java.io.Serializable;
import java.util.Date;

public class TCrmUser implements Serializable {
    private String userId;

    private String customerId;

    private String productId;

    private String serviceNumber;

    private Integer payType;

    private String lifecycleStatus;

    private String partnerId;

    private Date effectiveTime;

    private Date expirationTime;

    private Date updatedTime;

    private String userName;

    private Integer identityType;

    private String identityCode;

    private String identifyFile;

    private static final long serialVersionUID = 1L;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber == null ? null : serviceNumber.trim();
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getLifecycleStatus() {
        return lifecycleStatus;
    }

    public void setLifecycleStatus(String lifecycleStatus) {
        this.lifecycleStatus = lifecycleStatus == null ? null : lifecycleStatus.trim();
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Integer identityType) {
        this.identityType = identityType;
    }

    public String getIdentityCode() {
        return identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode == null ? null : identityCode.trim();
    }

    public String getIdentifyFile() {
        return identifyFile;
    }

    public void setIdentifyFile(String identifyFile) {
        this.identifyFile = identifyFile == null ? null : identifyFile.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", customerId=").append(customerId);
        sb.append(", productId=").append(productId);
        sb.append(", serviceNumber=").append(serviceNumber);
        sb.append(", payType=").append(payType);
        sb.append(", lifecycleStatus=").append(lifecycleStatus);
        sb.append(", partnerId=").append(partnerId);
        sb.append(", effectiveTime=").append(effectiveTime);
        sb.append(", expirationTime=").append(expirationTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append(", userName=").append(userName);
        sb.append(", identityType=").append(identityType);
        sb.append(", identityCode=").append(identityCode);
        sb.append(", identifyFile=").append(identifyFile);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}