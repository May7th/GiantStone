package com.oyun.giantstone.dto;

import com.google.common.collect.Lists;
import com.oyun.giantstone.model.Department;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.beans.BeanUtils;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

/**
 * @program: giantstone
 * @description:
 * @author: changzhen
 * @create: 2018-06-15 10:31
 **/

@Getter
@Setter
@ToString
public class DeptLevelDto extends Department {

    private List<DeptLevelDto> deptLevelList = Lists.newArrayList();

    public static DeptLevelDto adapt(Department department){

        DeptLevelDto deptLevelDto = new DeptLevelDto();

        BeanUtils.copyProperties(department,deptLevelDto);

        return deptLevelDto;
    }

























}
