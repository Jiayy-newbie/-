package com.tjetc.pojo;

public class Servicerequest {
    private Integer id;

    private String serid;

    private String cretime;

    private String sertext;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerid() {
        return serid;
    }

    public void setSerid(String serid) {
        this.serid = serid == null ? null : serid.trim();
    }

    public String getCretime() {
        return cretime;
    }

    public void setCretime(String cretime) {
        this.cretime = cretime == null ? null : cretime.trim();
    }

    public String getSertext() {
        return sertext;
    }

    public void setSertext(String sertext) {
        this.sertext = sertext == null ? null : sertext.trim();
    }

	@Override
	public String toString() {
		return "Servicerequest [id=" + id + ", serid=" + serid + ", cretime=" + cretime + ", sertext=" + sertext + "]";
	}
    
}