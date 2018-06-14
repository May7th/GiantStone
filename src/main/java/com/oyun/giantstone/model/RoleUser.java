package com.oyun.giantstone.model;

import java.util.Date;

public class RoleUser {
    private Integer id;

    private Integer roleId;

    private Integer userId;

    private String operator;

    private Date opeateTime;

    private String opeateIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOpeateTime() {
        return opeateTime;
    }

    public void setOpeateTime(Date opeateTime) {
        this.opeateTime = opeateTime;
    }

    public String getOpeateIp() {
        return opeateIp;
    }

    public void setOpeateIp(String opeateIp) {
        this.opeateIp = opeateIp == null ? null : opeateIp.trim();
    }
}