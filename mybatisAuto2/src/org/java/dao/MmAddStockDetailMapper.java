package org.java.dao;

import org.java.entity.MmAddStockDetail;

public interface MmAddStockDetailMapper {
    /**
     *
     * @mbggenerated 2017-04-19
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-04-19
     */
    int insert(MmAddStockDetail record);

    /**
     *
     * @mbggenerated 2017-04-19
     */
    int insertSelective(MmAddStockDetail record);

    /**
     *
     * @mbggenerated 2017-04-19
     */
    MmAddStockDetail selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-04-19
     */
    int updateByPrimaryKeySelective(MmAddStockDetail record);

    /**
     *
     * @mbggenerated 2017-04-19
     */
    int updateByPrimaryKey(MmAddStockDetail record);
}