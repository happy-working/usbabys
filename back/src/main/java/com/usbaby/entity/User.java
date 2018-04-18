package com.usbaby.entity;

import java.util.Date;

public class User {
    private String worknumber;

    private String nickname;

    private String username;

    private String userphone;

    private String babyname;

    private Date adddate;

    private Integer unitid;

    private String pictureurl;

    private String type;

    private Integer rolemenuid;

    public String getWorknumber() {
        return worknumber;
    }

    public void setWorknumber(String worknumber) {
        this.worknumber = worknumber == null ? null : worknumber.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone == null ? null : userphone.trim();
    }

    public String getBabyname() {
        return babyname;
    }

    public void setBabyname(String babyname) {
        this.babyname = babyname == null ? null : babyname.trim();
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getPictureurl() {
        return pictureurl;
    }

    public void setPictureurl(String pictureurl) {
        this.pictureurl = pictureurl == null ? null : pictureurl.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getRolemenuid() {
        return rolemenuid;
    }

    public void setRolemenuid(Integer rolemenuid) {
        this.rolemenuid = rolemenuid;
    }
}