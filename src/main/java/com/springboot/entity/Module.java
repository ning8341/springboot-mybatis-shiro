package com.springboot.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Module implements Serializable {
    private Integer mid;

    private String mname;

    Set<Role> roles = new HashSet<>();

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Set<Role> getRoleSet() {
        return roles;
    }

    public void setRoleSet(Set<Role> roleSet) {
        this.roles = roleSet;
    }
}
