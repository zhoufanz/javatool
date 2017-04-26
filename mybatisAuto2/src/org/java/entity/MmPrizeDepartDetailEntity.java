package org.java.entity;

public class MmPrizeDepartDetailEntity {
    /**
     * 主键
     */
    private String id;

    /**
     * 奖励详情ID
     */
    private String countId;

    /**
     * 奖励单个数量
     */
    private Long prizeNuitNumber;

    /**
     * 奖励网点（部门）
     */
    private String prizeSiteCode;

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
     * 奖励详情ID
     * @return COUNT_ID 奖励详情ID
     */
    public String getCountId() {
        return countId;
    }

    /**
     * 奖励详情ID
     * @param countId 奖励详情ID
     */
    public void setCountId(String countId) {
        this.countId = countId == null ? null : countId.trim();
    }

    /**
     * 奖励单个数量
     * @return PRIZE_NUIT_NUMBER 奖励单个数量
     */
    public Long getPrizeNuitNumber() {
        return prizeNuitNumber;
    }

    /**
     * 奖励单个数量
     * @param prizeNuitNumber 奖励单个数量
     */
    public void setPrizeNuitNumber(Long prizeNuitNumber) {
        this.prizeNuitNumber = prizeNuitNumber;
    }

    /**
     * 奖励网点（部门）
     * @return PRIZE_SITE_CODE 奖励网点（部门）
     */
    public String getPrizeSiteCode() {
        return prizeSiteCode;
    }

    /**
     * 奖励网点（部门）
     * @param prizeSiteCode 奖励网点（部门）
     */
    public void setPrizeSiteCode(String prizeSiteCode) {
        this.prizeSiteCode = prizeSiteCode == null ? null : prizeSiteCode.trim();
    }
}