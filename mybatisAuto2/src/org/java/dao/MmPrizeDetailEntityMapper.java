package org.java.dao;

import org.java.entity.MmPrizeDetailEntity;

public interface MmPrizeDetailEntityMapper {
    /**
     *
     * @mbggenerated 2017-04-26
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int insert(MmPrizeDetailEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int insertSelective(MmPrizeDetailEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    MmPrizeDetailEntity selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int updateByPrimaryKeySelective(MmPrizeDetailEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int updateByPrimaryKey(MmPrizeDetailEntity record);
}