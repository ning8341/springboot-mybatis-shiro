package com.springboot.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Role implements Serializable {

    private Integer rid;

    private String rname;

    private Set<User> users = new HashSet<>();

    private Set<Module> modules = new HashSet<>();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Set<User> getUserSet() {
        return users;
    }

    public void setUserSet(Set<User> userSet) {
        this.users = userSet;
    }

    public Set<Module> getModuleSet() {
        return modules;
    }

    public void setModuleSet(Set<Module> moduleSet) {
        this.modules = moduleSet;
    }
}
