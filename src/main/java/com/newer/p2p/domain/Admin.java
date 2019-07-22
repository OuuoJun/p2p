package com.newer.p2p.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Admin implements Serializable {

    private static final long serialVersionUID = -8057770282576337367L;

    private int aid;
    private String memberType;
    private String ausername;
    private String apassword;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date register;

    public Admin() {
    }

    @Override
    public String toString() {
        return "Admin{" +
                "aid=" + aid +
                ", memberType='" + memberType + '\'' +
                ", ausername='" + ausername + '\'' +
                ", apassword='" + apassword + '\'' +
                ", register=" + register +
                '}';
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public String getAusername() {
        return ausername;
    }

    public void setAusername(String ausername) {
        this.ausername = ausername;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    public Date getRegister() {
        return register;
    }

    public void setRegister(Date register) {
        this.register = register;
    }

    public Admin(int aid, String memberType, String ausername, String apassword, Date register) {
        this.aid = aid;
        this.memberType = memberType;
        this.ausername = ausername;
        this.apassword = apassword;
        this.register = register;
    }
}
