package com.dogiant.api.dto;

import java.util.Date;

public class SectionDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -493244293880133783L;
	private Long id;
	private String code;
	private String name;
	private Integer type;
	private String content;
	private Integer status;
	private Date ctime;
	private Date mtime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCtime() {
		return ctime;
	}

	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}

	public Date getMtime() {
		return mtime;
	}

	public void setMtime(Date mtime) {
		this.mtime = mtime;
	}

	@Override
	public String toString() {
		return "SectionDTO [id=" + id + ", code=" + code + ", name=" + name + ", type=" + type + ", content=" + content
				+ ", status=" + status + ", ctime=" + ctime + ", mtime=" + mtime + "]";
	}
	
	

}
