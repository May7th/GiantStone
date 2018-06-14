package com.oyun.giantstone.model;

import java.util.Date;

public class Role {
    private Integer id;

    private String name;

    private Integer type;

    private Integer seq;

    private Integer status;

    private String remark;

    private String operator;

    private Date opeateTime;

    private String opeateIp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSeq() {
        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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