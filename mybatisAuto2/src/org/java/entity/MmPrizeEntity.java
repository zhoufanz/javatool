package org.java.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MmPrizeEntity {
    /**
     * 主键
     */
    private String id;

    /**
     * 奖励单号
     */
    private String prizeCode;

    /**
     * 奖励名称
     */
    private String prizeName;

    /**
     * 奖励状态（MM_P_ZCZ.暂存中,MM_P_YTJ.已提交)
     */
    private Short prizeFlag;

    /**
     * 采购合计
     */
    private BigDecimal jlPurchTotal;

    /**
     * 销售合计
     */
    private BigDecimal jlProposeTotal;

    /**
     * 品类数量
     */
    private Long categoryNumber;

    /**
     * 总数量
     */
    private Long totalNumber;

    /**
     * 奖励部门数量
     */
    private Long prizeSiteCodeCount;

    /**
     * 操作人(选择器)
     */
    private String inputUserCode;

    /**
     * 操作时间
     */
    private Date inputTime;

    /**
     * 摘要
     */
    private String prizeRemark;

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
     * 奖励名称
     * @return PRIZE_NAME 奖励名称
     */
    public String getPrizeName() {
        return prizeName;
    }

    /**
     * 奖励名称
     * @param prizeName 奖励名称
     */
    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    /**
     * 奖励状态（MM_P_ZCZ.暂存中,MM_P_YTJ.已提交)
     * @return PRIZE_FLAG 奖励状态（MM_P_ZCZ.暂存中,MM_P_YTJ.已提交)
     */
    public Short getPrizeFlag() {
        return prizeFlag;
    }

    /**
     * 奖励状态（MM_P_ZCZ.暂存中,MM_P_YTJ.已提交)
     * @param prizeFlag 奖励状态（MM_P_ZCZ.暂存中,MM_P_YTJ.已提交)
     */
    public void setPrizeFlag(Short prizeFlag) {
        this.prizeFlag = prizeFlag;
    }

    /**
     * 采购合计
     * @return JL_PURCH_TOTAL 采购合计
     */
    public BigDecimal getJlPurchTotal() {
        return jlPurchTotal;
    }

    /**
     * 采购合计
     * @param jlPurchTotal 采购合计
     */
    public void setJlPurchTotal(BigDecimal jlPurchTotal) {
        this.jlPurchTotal = jlPurchTotal;
    }

    /**
     * 销售合计
     * @return JL_PROPOSE_TOTAL 销售合计
     */
    public BigDecimal getJlProposeTotal() {
        return jlProposeTotal;
    }

    /**
     * 销售合计
     * @param jlProposeTotal 销售合计
     */
    public void setJlProposeTotal(BigDecimal jlProposeTotal) {
        this.jlProposeTotal = jlProposeTotal;
    }

    /**
     * 品类数量
     * @return CATEGORY_NUMBER 品类数量
     */
    public Long getCategoryNumber() {
        return categoryNumber;
    }

    /**
     * 品类数量
     * @param categoryNumber 品类数量
     */
    public void setCategoryNumber(Long categoryNumber) {
        this.categoryNumber = categoryNumber;
    }

    /**
     * 总数量
     * @return TOTAL_NUMBER 总数量
     */
    public Long getTotalNumber() {
        return totalNumber;
    }

    /**
     * 总数量
     * @param totalNumber 总数量
     */
    public void setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
    }

    /**
     * 奖励部门数量
     * @return PRIZE_SITE_CODE_COUNT 奖励部门数量
     */
    public Long getPrizeSiteCodeCount() {
        return prizeSiteCodeCount;
    }

    /**
     * 奖励部门数量
     * @param prizeSiteCodeCount 奖励部门数量
     */
    public void setPrizeSiteCodeCount(Long prizeSiteCodeCount) {
        this.prizeSiteCodeCount = prizeSiteCodeCount;
    }

    /**
     * 操作人(选择器)
     * @return INPUT_USER_CODE 操作人(选择器)
     */
    public String getInputUserCode() {
        return inputUserCode;
    }

    /**
     * 操作人(选择器)
     * @param inputUserCode 操作人(选择器)
     */
    public void setInputUserCode(String inputUserCode) {
        this.inputUserCode = inputUserCode == null ? null : inputUserCode.trim();
    }

    /**
     * 操作时间
     * @return INPUT_TIME 操作时间
     */
    public Date getInputTime() {
        return inputTime;
    }

    /**
     * 操作时间
     * @param inputTime 操作时间
     */
    public void setInputTime(Date inputTime) {
        this.inputTime = inputTime;
    }

    /**
     * 摘要
     * @return PRIZE_REMARK 摘要
     */
    public String getPrizeRemark() {
        return prizeRemark;
    }

    /**
     * 摘要
     * @param prizeRemark 摘要
     */
    public void setPrizeRemark(String prizeRemark) {
        this.prizeRemark = prizeRemark == null ? null : prizeRemark.trim();
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
}