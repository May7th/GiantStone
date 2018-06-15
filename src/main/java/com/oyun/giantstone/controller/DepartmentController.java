package com.oyun.giantstone.controller;

import com.oyun.giantstone.Service.DepartmentService;
import com.oyun.giantstone.common.JsonData;
import com.oyun.giantstone.model.Department;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: giantstone
 * @description: 部门控制器
 * @author: changzhen
 * @create: 2018-06-14 22:04
 **/
@RestController
@RequestMapping("/admin/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public JsonData saveDepartment(@Validated Department department){
        departmentService.save(department);
        return JsonData.success();

    }
}
