package org.java.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MmAddStockDetail {
    /**
     * 入库明细ID
     */
    private String id;

    /**
     * 科目编号(物料基础资料)
     */
    private String projectCode;

    /**
     * 科目名称(物料基础资料)
     */
    private String projectName;

    /**
     * 父节点CODE(物料基础资料)
     */
    private String regionParent;

    /**
     * 等级（一级科目：FRIST,二级科目：SECOND,三级科目:THIRD,品类：CLASS）(物料基础资料)
     */
    private String regionLevel;

    /**
     * 型号(物料基础资料)
     */
    private String version;

    /**
     * 单位(物料基础资料)
     */
    private String unit;

    /**
     * 图号(物料基础资料)
     */
    private String picturenum;

    /**
     * 参考成本价格(物料基础资料)
     */
    private BigDecimal consultCost;

    /**
     * 销售价格(物料基础资料)
     */
    private BigDecimal proposeCost;

    /**
     * 备注(物料基础资料)
     */
    private String remark;

    /**
     * 是否启用（0.不启用,1.启用）(物料基础资料)
     */
    private Short blFlag;

    /**
     * 供货商
     */
    private String supplier;

    /**
     * 物品批次号
     */
    private String batchNumber;

    /**
     * 入库数目
     */
    private Long storageNumber;

    /**
     * 采购单价
     */
    private BigDecimal purchPrice;

    /**
     * 采购合计
     */
    private BigDecimal purchTotal;

    /**
     * 销售合计(销售单价在基础数据表)
     */
    private BigDecimal proposeTotal;

    /**
     * 有效日期
     */
    private Date effectiveTime;

    /**
     * 失效日期
     */
    private Date invalidTime;

    /**
     * 创建人
     */
    private String createUserCode;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改人
     */
    private String modifyUserCode;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 入库单号外键
     */
    private String storageNumberId;

    /**
     * 一级科目代码
     */
    private String firstProjectCode;

    /**
     * 一级科目名称
     */
    private String firstProjectName;

    /**
     * 二级科目代码
     */
    private String secondProjectCode;

    /**
     * 二级科目名称
     */
    private String secondProjectName;

    /**
     * 三级科目代码
     */
    private String threeProjectCode;

    /**
     * 三级科目名称
     */
    private String threeProjectName;

    /**
     * 入库明细ID
     * @return ID 入库明细ID
     */
    public String getId() {
        return id;
    }

    /**
     * 入库明细ID
     * @param id 入库明细ID
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 科目编号(物料基础资料)
     * @return PROJECT_CODE 科目编号(物料基础资料)
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 科目编号(物料基础资料)
     * @param projectCode 科目编号(物料基础资料)
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    /**
     * 科目名称(物料基础资料)
     * @return PROJECT_NAME 科目名称(物料基础资料)
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 科目名称(物料基础资料)
     * @param projectName 科目名称(物料基础资料)
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 父节点CODE(物料基础资料)
     * @return REGION_PARENT 父节点CODE(物料基础资料)
     */
    public String getRegionParent() {
        return regionParent;
    }

    /**
     * 父节点CODE(物料基础资料)
     * @param regionParent 父节点CODE(物料基础资料)
     */
    public void setRegionParent(String regionParent) {
        this.regionParent = regionParent == null ? null : regionParent.trim();
    }

    /**
     * 等级（一级科目：FRIST,二级科目：SECOND,三级科目:THIRD,品类：CLASS）(物料基础资料)
     * @return REGION_LEVEL 等级（一级科目：FRIST,二级科目：SECOND,三级科目:THIRD,品类：CLASS）(物料基础资料)
     */
    public String getRegionLevel() {
        return regionLevel;
    }

    /**
     * 等级（一级科目：FRIST,二级科目：SECOND,三级科目:THIRD,品类：CLASS）(物料基础资料)
     * @param regionLevel 等级（一级科目：FRIST,二级科目：SECOND,三级科目:THIRD,品类：CLASS）(物料基础资料)
     */
    public void setRegionLevel(String regionLevel) {
        this.regionLevel = regionLevel == null ? null : regionLevel.trim();
    }

    /**
     * 型号(物料基础资料)
     * @return VERSION 型号(物料基础资料)
     */
    public String getVersion() {
        return version;
    }

    /**
     * 型号(物料基础资料)
     * @param version 型号(物料基础资料)
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 单位(物料基础资料)
     * @return UNIT 单位(物料基础资料)
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 单位(物料基础资料)
     * @param unit 单位(物料基础资料)
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**
     * 图号(物料基础资料)
     * @return PICTURENUM 图号(物料基础资料)
     */
    public String getPicturenum() {
        return picturenum;
    }

    /**
     * 图号(物料基础资料)
     * @param picturenum 图号(物料基础资料)
     */
    public void setPicturenum(String picturenum) {
        this.picturenum = picturenum == null ? null : picturenum.trim();
    }

    /**
     * 参考成本价格(物料基础资料)
     * @return CONSULT_COST 参考成本价格(物料基础资料)
     */
    public BigDecimal getConsultCost() {
        return consultCost;
    }

    /**
     * 参考成本价格(物料基础资料)
     * @param consultCost 参考成本价格(物料基础资料)
     */
    public void setConsultCost(BigDecimal consultCost) {
        this.consultCost = consultCost;
    }

    /**
     * 销售价格(物料基础资料)
     * @return PROPOSE_COST 销售价格(物料基础资料)
     */
    public BigDecimal getProposeCost() {
        return proposeCost;
    }

    /**
     * 销售价格(物料基础资料)
     * @param proposeCost 销售价格(物料基础资料)
     */
    public void setProposeCost(BigDecimal proposeCost) {
        this.proposeCost = proposeCost;
    }

    /**
     * 备注(物料基础资料)
     * @return REMARK 备注(物料基础资料)
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注(物料基础资料)
     * @param remark 备注(物料基础资料)
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 是否启用（0.不启用,1.启用）(物料基础资料)
     * @return BL_FLAG 是否启用（0.不启用,1.启用）(物料基础资料)
     */
    public Short getBlFlag() {
        return blFlag;
    }

    /**
     * 是否启用（0.不启用,1.启用）(物料基础资料)
     * @param blFlag 是否启用（0.不启用,1.启用）(物料基础资料)
     */
    public void setBlFlag(Short blFlag) {
        this.blFlag = blFlag;
    }

    /**
     * 供货商
     * @return SUPPLIER 供货商
     */
    public String getSupplier() {
        return supplier;
    }

    /**
     * 供货商
     * @param supplier 供货商
     */
    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
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
     * 入库数目
     * @return STORAGE_NUMBER 入库数目
     */
    public Long getStorageNumber() {
        return storageNumber;
    }

    /**
     * 入库数目
     * @param storageNumber 入库数目
     */
    public void setStorageNumber(Long storageNumber) {
        this.storageNumber = storageNumber;
    }

    /**
     * 采购单价
     * @return PURCH_PRICE 采购单价
     */
    public BigDecimal getPurchPrice() {
        return purchPrice;
    }

    /**
     * 采购单价
     * @param purchPrice 采购单价
     */
    public void setPurchPrice(BigDecimal purchPrice) {
        this.purchPrice = purchPrice;
    }

    /**
     * 采购合计
     * @return PURCH_TOTAL 采购合计
     */
    public BigDecimal getPurchTotal() {
        return purchTotal;
    }

    /**
     * 采购合计
     * @param purchTotal 采购合计
     */
    public void setPurchTotal(BigDecimal purchTotal) {
        this.purchTotal = purchTotal;
    }

    /**
     * 销售合计(销售单价在基础数据表)
     * @return PROPOSE_TOTAL 销售合计(销售单价在基础数据表)
     */
    public BigDecimal getProposeTotal() {
        return proposeTotal;
    }

    /**
     * 销售合计(销售单价在基础数据表)
     * @param proposeTotal 销售合计(销售单价在基础数据表)
     */
    public void setProposeTotal(BigDecimal proposeTotal) {
        this.proposeTotal = proposeTotal;
    }

    /**
     * 有效日期
     * @return EFFECTIVE_TIME 有效日期
     */
    public Date getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 有效日期
     * @param effectiveTime 有效日期
     */
    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * 失效日期
     * @return INVALID_TIME 失效日期
     */
    public Date getInvalidTime() {
        return invalidTime;
    }

    /**
     * 失效日期
     * @param invalidTime 失效日期
     */
    public void setInvalidTime(Date invalidTime) {
        this.invalidTime = invalidTime;
    }

    /**
     * 创建人
     * @return CREATE_USER_CODE 创建人
     */
    public String getCreateUserCode() {
        return createUserCode;
    }

    /**
     * 创建人
     * @param createUserCode 创建人
     */
    public void setCreateUserCode(String createUserCode) {
        this.createUserCode = createUserCode == null ? null : createUserCode.trim();
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
     * 修改人
     * @return MODIFY_USER_CODE 修改人
     */
    public String getModifyUserCode() {
        return modifyUserCode;
    }

    /**
     * 修改人
     * @param modifyUserCode 修改人
     */
    public void setModifyUserCode(String modifyUserCode) {
        this.modifyUserCode = modifyUserCode == null ? null : modifyUserCode.trim();
    }

    /**
     * 修改时间
     * @return MODIFY_TIME 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 修改时间
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 入库单号外键
     * @return STORAGE_NUMBER_ID 入库单号外键
     */
    public String getStorageNumberId() {
        return storageNumberId;
    }

    /**
     * 入库单号外键
     * @param storageNumberId 入库单号外键
     */
    public void setStorageNumberId(String storageNumberId) {
        this.storageNumberId = storageNumberId == null ? null : storageNumberId.trim();
    }

    /**
     * 一级科目代码
     * @return FIRST_PROJECT_CODE 一级科目代码
     */
    public String getFirstProjectCode() {
        return firstProjectCode;
    }

    /**
     * 一级科目代码
     * @param firstProjectCode 一级科目代码
     */
    public void setFirstProjectCode(String firstProjectCode) {
        this.firstProjectCode = firstProjectCode == null ? null : firstProjectCode.trim();
    }

    /**
     * 一级科目名称
     * @return FIRST_PROJECT_NAME 一级科目名称
     */
    public String getFirstProjectName() {
        return firstProjectName;
    }

    /**
     * 一级科目名称
     * @param firstProjectName 一级科目名称
     */
    public void setFirstProjectName(String firstProjectName) {
        this.firstProjectName = firstProjectName == null ? null : firstProjectName.trim();
    }

    /**
     * 二级科目代码
     * @return SECOND_PROJECT_CODE 二级科目代码
     */
    public String getSecondProjectCode() {
        return secondProjectCode;
    }

    /**
     * 二级科目代码
     * @param secondProjectCode 二级科目代码
     */
    public void setSecondProjectCode(String secondProjectCode) {
        this.secondProjectCode = secondProjectCode == null ? null : secondProjectCode.trim();
    }

    /**
     * 二级科目名称
     * @return SECOND_PROJECT_NAME 二级科目名称
     */
    public String getSecondProjectName() {
        return secondProjectName;
    }

    /**
     * 二级科目名称
     * @param secondProjectName 二级科目名称
     */
    public void setSecondProjectName(String secondProjectName) {
        this.secondProjectName = secondProjectName == null ? null : secondProjectName.trim();
    }

    /**
     * 三级科目代码
     * @return THREE_PROJECT_CODE 三级科目代码
     */
    public String getThreeProjectCode() {
        return threeProjectCode;
    }

    /**
     * 三级科目代码
     * @param threeProjectCode 三级科目代码
     */
    public void setThreeProjectCode(String threeProjectCode) {
        this.threeProjectCode = threeProjectCode == null ? null : threeProjectCode.trim();
    }

    /**
     * 三级科目名称
     * @return THREE_PROJECT_NAME 三级科目名称
     */
    public String getThreeProjectName() {
        return threeProjectName;
    }

    /**
     * 三级科目名称
     * @param threeProjectName 三级科目名称
     */
    public void setThreeProjectName(String threeProjectName) {
        this.threeProjectName = threeProjectName == null ? null : threeProjectName.trim();
    }
}