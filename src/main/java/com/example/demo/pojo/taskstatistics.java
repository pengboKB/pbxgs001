package com.example.demo.pojo;

public class taskstatistics {
    private String id;

    private String taskId;

    private String type;

    private Integer secretNum;

    private Integer noSecretNum;

    private Integer suspectNum;

    private Integer noDealNum;

    private Integer totalNum;

    private Long createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getSecretNum() {
        return secretNum;
    }

    public void setSecretNum(Integer secretNum) {
        this.secretNum = secretNum;
    }

    public Integer getNoSecretNum() {
        return noSecretNum;
    }

    public void setNoSecretNum(Integer noSecretNum) {
        this.noSecretNum = noSecretNum;
    }

    public Integer getSuspectNum() {
        return suspectNum;
    }

    public void setSuspectNum(Integer suspectNum) {
        this.suspectNum = suspectNum;
    }

    public Integer getNoDealNum() {
        return noDealNum;
    }

    public void setNoDealNum(Integer noDealNum) {
        this.noDealNum = noDealNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}