package com.peter.entity;

import java.util.Date;

/**
 * Created by PeterYu on 2019/3/30.
 */
public class Area {
    private Integer id;
    //区域名字
    private String areaName;
    //排序
    private Integer order;
    //创建时间
    private Date createTs;
    //修改时间
    private Date ts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Date getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}
