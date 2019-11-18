package com.tjetc.pojo;

public class Service {
    private String id;

    private String servtitle;

    private Integer uid;

    private String servtype;

    private String curname;

    private String cretime;

    private Integer stateid;
    
    private Admin admin;
    
    private Servicerequest reService;
    
    private Servicestate state;
    
    private String statee;
    
    private String aname;
    

    public Servicerequest getReService() {
		return reService;
	}

	public void setReService(Servicerequest reService) {
		this.reService = reService;
	}

	public String getStatee() {
		return statee;
	}

	public void setStatee(String statee) {
		this.statee = statee;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Servicestate getState() {
		return state;
	}

	public void setState(Servicestate state) {
		this.state = state;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getServtitle() {
        return servtitle;
    }

    public void setServtitle(String servtitle) {
        this.servtitle = servtitle == null ? null : servtitle.trim();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getServtype() {
        return servtype;
    }

    public void setServtype(String servtype) {
        this.servtype = servtype == null ? null : servtype.trim();
    }

    public String getCurname() {
        return curname;
    }

    public void setCurname(String curname) {
        this.curname = curname == null ? null : curname.trim();
    }

    public String getCretime() {
        return cretime;
    }

    public void setCretime(String cretime) {
        this.cretime = cretime == null ? null : cretime.trim();
    }

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

	@Override
	public String toString() {
		return "Service [id=" + id + ", servtitle=" + servtitle + ", uid=" + uid + ", servtype=" + servtype
				+ ", curname=" + curname + ", cretime=" + cretime + ", stateid=" + stateid + "]";
	}
}