package com.ycscm.app.model.base;

import java.util.Date;

public class ProxySave {
    /**
     * null
     */
    private Long id;

    /**
     * 代收点账号
     */
    private String agentCode;

    /**
     * 运单号
     */
    private String billCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 状态时间（每次更新状态时，更新时间）
     */
    private Date statusTime;

    /**
     * 核销时间
     */
    private Date writeoffTime;

    /**
     * 手机号
     */
    private String telPhone;

    /**
     * 提货码
     */
    private String pickupCode;

    /**
     * 验证次数
     */
    private Short checkNum;

    /**
     * 状态（到件/已签/取回/）
     */
    private Short status;

    /**
     * 核销状态(已核销/未核销)
     */
    private Short writeoffStatus;

    /**
     * null
     * @return ID null
     */
    public Long getId() {
        return id;
    }

    /**
     * null
     * @param id null
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 代收点账号
     * @return AGENT_CODE 代收点账号
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * 代收点账号
     * @param agentCode 代收点账号
     */
    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode == null ? null : agentCode.trim();
    }

    /**
     * 运单号
     * @return BILL_CODE 运单号
     */
    public String getBillCode() {
        return billCode;
    }

    /**
     * 运单号
     * @param billCode 运单号
     */
    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    /**
     * 创建时间
     * @return CREATE_TIME 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return UPDATE_TIME 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 状态时间（每次更新状态时，更新时间）
     * @return STATUS_TIME 状态时间（每次更新状态时，更新时间）
     */
    public Date getStatusTime() {
        return statusTime;
    }

    /**
     * 状态时间（每次更新状态时，更新时间）
     * @param statusTime 状态时间（每次更新状态时，更新时间）
     */
    public void setStatusTime(Date statusTime) {
        this.statusTime = statusTime;
    }

    /**
     * 核销时间
     * @return WRITEOFF_TIME 核销时间
     */
    public Date getWriteoffTime() {
        return writeoffTime;
    }

    /**
     * 核销时间
     * @param writeoffTime 核销时间
     */
    public void setWriteoffTime(Date writeoffTime) {
        this.writeoffTime = writeoffTime;
    }

    /**
     * 手机号
     * @return TEL_PHONE 手机号
     */
    public String getTelPhone() {
        return telPhone;
    }

    /**
     * 手机号
     * @param telPhone 手机号
     */
    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone == null ? null : telPhone.trim();
    }

    /**
     * 提货码
     * @return PICKUP_CODE 提货码
     */
    public String getPickupCode() {
        return pickupCode;
    }

    /**
     * 提货码
     * @param pickupCode 提货码
     */
    public void setPickupCode(String pickupCode) {
        this.pickupCode = pickupCode == null ? null : pickupCode.trim();
    }

    /**
     * 验证次数
     * @return CHECK_NUM 验证次数
     */
    public Short getCheckNum() {
        return checkNum;
    }

    /**
     * 验证次数
     * @param checkNum 验证次数
     */
    public void setCheckNum(Short checkNum) {
        this.checkNum = checkNum;
    }

    /**
     * 状态（到件/已签/取回/）
     * @return STATUS 状态（到件/已签/取回/）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 状态（到件/已签/取回/）
     * @param status 状态（到件/已签/取回/）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 核销状态(已核销/未核销)
     * @return WRITEOFF_STATUS 核销状态(已核销/未核销)
     */
    public Short getWriteoffStatus() {
        return writeoffStatus;
    }

    /**
     * 核销状态(已核销/未核销)
     * @param writeoffStatus 核销状态(已核销/未核销)
     */
    public void setWriteoffStatus(Short writeoffStatus) {
        this.writeoffStatus = writeoffStatus;
    }
}