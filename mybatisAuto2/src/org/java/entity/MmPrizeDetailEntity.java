package org.java.entity;

import java.math.BigDecimal;

public class MmPrizeDetailEntity {
    /**
     * 主键
     */
    private String id;

    /**
     * 物品批次号
     */
    private String batchNumber;

    /**
     * 奖励单号
     */
    private String prizeCode;

    /**
     * 采购合计
     */
    private BigDecimal unitPurchTotal;

    /**
     * 销售合计
     */
    private BigDecimal unitProposeTotal;

    /**
     * 奖励总数量
     */
    private Long applicationNumber;

    /**
     * 奖励部门数量
     */
    private Long prizeUnitSiteCodeCount;

    /**
     * 详情备注
     */
    private String detailRemark;

    /**
     * 主键
     * @return ID 主键
     */
    public String getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 物品批次号
     * @return BATCH_NUMBER 物品批次号
     */
    public String getBatchNumber() {
        return batchNumber;
    }

    /**
     * 物品批次号
     * @param batchNumber 物品批次号
     */
    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    /**
     * 奖励单号
     * @return PRIZE_CODE 奖励单号
     */
    public String getPrizeCode() {
        return prizeCode;
    }

    /**
     * 奖励单号
     * @param prizeCode 奖励单号
     */
    public void setPrizeCode(String prizeCode) {
        this.prizeCode = prizeCode == null ? null : prizeCode.trim();
    }

    /**
     * 采购合计
     * @return UNIT_PURCH_TOTAL 采购合计
     */
    public BigDecimal getUnitPurchTotal() {
        return unitPurchTotal;
    }

    /**
     * 采购合计
     * @param unitPurchTotal 采购合计
     */
    public void setUnitPurchTotal(BigDecimal unitPurchTotal) {
        this.unitPurchTotal = unitPurchTotal;
    }

    /**
     * 销售合计
     * @return UNIT_PROPOSE_TOTAL 销售合计
     */
    public BigDecimal getUnitProposeTotal() {
        return unitProposeTotal;
    }

    /**
     * 销售合计
     * @param unitProposeTotal 销售合计
     */
    public void setUnitProposeTotal(BigDecimal unitProposeTotal) {
        this.unitProposeTotal = unitProposeTotal;
    }

    /**
     * 奖励总数量
     * @return APPLICATION_NUMBER 奖励总数量
     */
    public Long getApplicationNumber() {
        return applicationNumber;
    }

    /**
     * 奖励总数量
     * @param applicationNumber 奖励总数量
     */
    public void setApplicationNumber(Long applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    /**
     * 奖励部门数量
     * @return PRIZE_UNIT_SITE_CODE_COUNT 奖励部门数量
     */
    public Long getPrizeUnitSiteCodeCount() {
        return prizeUnitSiteCodeCount;
    }

    /**
     * 奖励部门数量
     * @param prizeUnitSiteCodeCount 奖励部门数量
     */
    public void setPrizeUnitSiteCodeCount(Long prizeUnitSiteCodeCount) {
        this.prizeUnitSiteCodeCount = prizeUnitSiteCodeCount;
    }

    /**
     * 详情备注
     * @return DETAIL_REMARK 详情备注
     */
    public String getDetailRemark() {
        return detailRemark;
    }

    /**
     * 详情备注
     * @param detailRemark 详情备注
     */
    public void setDetailRemark(String detailRemark) {
        this.detailRemark = detailRemark == null ? null : detailRemark.trim();
    }
}