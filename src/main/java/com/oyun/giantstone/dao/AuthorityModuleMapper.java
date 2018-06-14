package com.oyun.giantstone.dao;

import com.oyun.giantstone.model.AuthorityModule;

public interface AuthorityModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AuthorityModule record);

    int insertSelective(AuthorityModule record);

    AuthorityModule selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AuthorityModule record);

    int updateByPrimaryKey(AuthorityModule record);
}