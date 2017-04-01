package com.ycscm.app.base.repository;

import com.ycscm.app.model.base.ProxySave;

public interface ProxySaveMapper {
    /**
     *
     * @mbggenerated 2017-04-01
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-04-01
     */
    int insert(ProxySave record);

    /**
     *
     * @mbggenerated 2017-04-01
     */
    int insertSelective(ProxySave record);

    /**
     *
     * @mbggenerated 2017-04-01
     */
    ProxySave selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2017-04-01
     */
    int updateByPrimaryKeySelective(ProxySave record);

    /**
     *
     * @mbggenerated 2017-04-01
     */
    int updateByPrimaryKey(ProxySave record);
}