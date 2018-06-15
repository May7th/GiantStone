package com.oyun.giantstone.Service.Impl;

import com.google.common.collect.Lists;
import com.oyun.giantstone.Service.TreeService;
import com.oyun.giantstone.dao.DepartmentMapper;
import com.oyun.giantstone.dto.DeptLevelDto;
import com.oyun.giantstone.model.Department;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @program: giantstone
 * @description:
 * @author: changzhen
 * @create: 2018-06-15 10:36
 **/

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private DepartmentMapper departmentMapper;

    public List<DeptLevelDto> departmentTree(){

        List<Department> departments = departmentMapper.getAllDepartment();

        List<DeptLevelDto> deptLevelDtoList = Lists.newArrayList();

        for (Department department :
                departments) {
            deptLevelDtoList.add(DeptLevelDto.adapt(department));
        }

        return departmentListToTree(deptLevelDtoList);

    }

    public List<DeptLevelDto> departmentListToTree(List<DeptLevelDto> deptLevelList ){

        if (CollectionUtils.isEmpty(deptLevelList)){
            return Lists.newArrayList();
        }
        return null;
    }


















}
