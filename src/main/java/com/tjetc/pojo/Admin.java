package com.tjetc.pojo;

import java.util.HashSet;
import java.util.Set;

public class Admin {
    private Integer id;

    private String name;

    private String phone;

    private String email;

    private String password;

    private String sex;

    private Integer states;

    private String photopath;

    private String rid;
    
    private Set<Service> services=new HashSet<Service>();

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath == null ? null : photopath.trim();
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid == null ? null : rid.trim();
    }
    

	public Set<Service> getServices() {
		return services;
	}

	public void setServices(Set<Service> services) {
		this.services = services;
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ ", sex=" + sex + ", states=" + states + ", photopath=" + photopath + ", rid=" + rid + "]";
	}
    
}