package com.example.wiki.domain;

import java.util.Date;

public class Message {
    private Integer id;

    private String title;

    private String content;

    private Date createTime;

    private Integer sendUserId;

    private String sendUserName;

    private String sendRealName;

    private Integer receiveUserCount;

    private Integer readCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getSendUserName() {
        return sendUserName;
    }

    public void setSendUserName(String sendUserName) {
        this.sendUserName = sendUserName;
    }

    public String getSendRealName() {
        return sendRealName;
    }

    public void setSendRealName(String sendRealName) {
        this.sendRealName = sendRealName;
    }

    public Integer getReceiveUserCount() {
        return receiveUserCount;
    }

    public void setReceiveUserCount(Integer receiveUserCount) {
        this.receiveUserCount = receiveUserCount;
    }

    public Integer getReadCount() {
        return readCount;
    }

    public void setReadCount(Integer readCount) {
        this.readCount = readCount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", createTime=").append(createTime);
        sb.append(", sendUserId=").append(sendUserId);
        sb.append(", sendUserName=").append(sendUserName);
        sb.append(", sendRealName=").append(sendRealName);
        sb.append(", receiveUserCount=").append(receiveUserCount);
        sb.append(", readCount=").append(readCount);
        sb.append("]");
        return sb.toString();
    }
}