package com.oyun.giantstone.Service;

import com.oyun.giantstone.model.Department;

/**
 * @program: giantstone
 * @description: 部门服务接口
 * @author: changzhen
 * @create: 2018-06-14 22:19
 **/
public interface DepartmentService {

    /**
     * 插入新部门
     * @param department
     */
    void save(Department department);
}
