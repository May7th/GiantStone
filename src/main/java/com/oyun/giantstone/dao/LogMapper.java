package com.oyun.giantstone.dao;

import com.oyun.giantstone.model.Log;
import com.oyun.giantstone.model.LogWithBLOBs;

public interface LogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LogWithBLOBs record);

    int insertSelective(LogWithBLOBs record);

    LogWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LogWithBLOBs record);

    int updateByPrimaryKey(Log record);
}