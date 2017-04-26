package org.java.dao;

import org.java.entity.MmPrizeDepartDetailEntity;

public interface MmPrizeDepartDetailEntityMapper {
    /**
     *
     * @mbggenerated 2017-04-26
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int insert(MmPrizeDepartDetailEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int insertSelective(MmPrizeDepartDetailEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    MmPrizeDepartDetailEntity selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int updateByPrimaryKeySelective(MmPrizeDepartDetailEntity record);

    /**
     *
     * @mbggenerated 2017-04-26
     */
    int updateByPrimaryKey(MmPrizeDepartDetailEntity record);
}