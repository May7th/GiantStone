package com.oyun.giantstone.model;

import java.util.Date;

public class Authority {
    private Integer id;

    private String code;

    private String name;

    private Integer authorityModuleId;

    private String url;

    private Integer type;

    private Integer seq;

    private Integer status;

    private String remark;

    private String operator;

    private Date opeateTime;

    private String opeateIp;

    private String component;

    private String icon;

    private String path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAuthorityModuleId() {
        return authorityModuleId;
    }

    public void setAuthorityModuleId(Integer authorityModuleId) {
        this.authorityModuleId = authorityModuleId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
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

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }
}