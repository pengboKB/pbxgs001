package com.example.demo.pojo;

public class task {
    private String id;

    private String location;

    private String name;

    private String status;

    private Long createTime;

    private Long endTime;

    private String userId;

    private Integer total;

    private Integer secretNum;

    private String type;

    private Boolean active;

    private Integer rank;

    private Integer checkTotal;

    private String executetype;

    private String cron;

    private Integer hitTotal;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSecretNum() {
        return secretNum;
    }

    public void setSecretNum(Integer secretNum) {
        this.secretNum = secretNum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getCheckTotal() {
        return checkTotal;
    }

    public void setCheckTotal(Integer checkTotal) {
        this.checkTotal = checkTotal;
    }

    public String getExecutetype() {
        return executetype;
    }

    public void setExecutetype(String executetype) {
        this.executetype = executetype == null ? null : executetype.trim();
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    public Integer getHitTotal() {
        return hitTotal;
    }

    public void setHitTotal(Integer hitTotal) {
        this.hitTotal = hitTotal;
    }
}