package com.oyun.giantstone.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.bind.annotation.GetMapping;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class Department {

    private Integer id;

    @NotBlank(message = "部门名称不能为空")
    @Length(max = 15,min = 2,message = "部门名称长度为2-15个字")
    private String name;

    private Integer parentId;

    private String level;

    @NotNull(message = "展示顺序不可以为空")
    private Integer seq;

    @Length(max = 150,message = "备注需要在150个字以内")
    private String remark;

    private String operator;

    private Date opeateTime;

    private String opeateIp;
}