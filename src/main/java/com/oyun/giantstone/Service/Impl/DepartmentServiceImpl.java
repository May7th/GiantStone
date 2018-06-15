package com.oyun.giantstone.Service.Impl;

import com.google.common.base.Preconditions;
import com.oyun.giantstone.Service.DepartmentService;
import com.oyun.giantstone.dao.DepartmentMapper;
import com.oyun.giantstone.exception.PermissionException;
import com.oyun.giantstone.model.Department;
import com.oyun.giantstone.util.LevelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @program: giantstone
 * @description: 部门服务接口实现类
 * @author: changzhen
 * @create: 2018-06-14 22:20
 **/
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public void save(Department department){

        if (checkExist(department.getParentId(),department.getName(),department.getId())){
            throw new PermissionException("在同级下存在相同名称部门");
        }
        department.setLevel(LevelUtil.calculateLevel(getLevel(department.getParentId()),department.getParentId()));
        department.setOperator("admin");
        department.setOpeateIp("127.0.0.1");
        department.setOpeateTime(new Date());
        departmentMapper.insertSelective(department);

    }

    @Override
    public void updata(Department department) {
        if (checkExist(department.getParentId(),department.getName(),department.getId())){
            throw new PermissionException("在同级下存在相同名称部门");
        }
        Department before = departmentMapper.selectByPrimaryKey(department.getId());

        Preconditions.checkNotNull(before,"待更新的部门不存在");


    }

    private boolean checkExist(Integer parentId,String DepartmentName,Integer departmentId){
        //TODO
        return true;
    }

    private String getLevel(Integer departmentId){

        Department department = departmentMapper.selectByPrimaryKey(departmentId);

        if (department == null){
            return null;
        }else {
            return department.getLevel();
        }
    }























}
