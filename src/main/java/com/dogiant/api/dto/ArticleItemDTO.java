package com.dogiant.api.dto;

import java.util.Date;

public class ArticleItemDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1904444469514676979L;
	private Long id;
	private ArticleCatDTO articleCatDTO;
	private Integer type;
	private String userName;
	private String title;
	private String subtitle;
	private String author;
	private String digest;
	private String content;
	private String coverPicUrl;
	private Boolean coverIntoContent;
	private String sourceUrl;
	private String linkUrl;
	private String fileUrl;
	private Integer status;
	private Date ctime;
	private Date mtime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ArticleCatDTO getArticleCatDTO() {
		return articleCatDTO;
	}

	public void setArticleCatDTO(ArticleCatDTO articleCatDTO) {
		this.articleCatDTO = articleCatDTO;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCoverPicUrl() {
		return coverPicUrl;
	}

	public void setCoverPicUrl(String coverPicUrl) {
		this.coverPicUrl = coverPicUrl;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public Boolean getCoverIntoContent() {
		return coverIntoContent;
	}

	public void setCoverIntoContent(Boolean coverIntoContent) {
		this.coverIntoContent = coverIntoContent;
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

}
