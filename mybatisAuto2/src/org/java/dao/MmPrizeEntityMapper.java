package org.java.dao;

import org.java.entity.MmPrizeEntity;

public interface MmPrizeEntityMapper {
    /**
     *
     * @mbggenerated 2017-04-26
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int insert(MmPrizeEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int insertSelective(MmPrizeEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    MmPrizeEntity selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int updateByPrimaryKeySelective(MmPrizeEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int updateByPrimaryKey(MmPrizeEntity record);
}