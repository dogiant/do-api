package com.dogiant.api.dto;

public class ArticleCatDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -384346253991760172L;
	/**
	 * 栏目ID
	 */
	private Long catId;
	/**
	 * 栏目代码(英文名)
	 */
	private String catCode;
	/**
	 * 栏目名称
	 */
	private String catName;
	/**
	 * 1 系统设定类型 不允许删改
	 */
	private int catType;
	/**
	 * 是否终极正文页栏目
	 */
	private Boolean isTextCat;
	/**
	 * 关键字
	 */
	private String keywords;
	/**
	 * 描述
	 */
	private String catDesc;

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public String getCatCode() {
		return catCode;
	}

	public void setCatCode(String catCode) {
		this.catCode = catCode;
	}

	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public int getCatType() {
		return catType;
	}

	public void setCatType(int catType) {
		this.catType = catType;
	}

	public Boolean getIsTextCat() {
		return isTextCat;
	}

	public void setIsTextCat(Boolean isTextCat) {
		this.isTextCat = isTextCat;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getCatDesc() {
		return catDesc;
	}

	public void setCatDesc(String catDesc) {
		this.catDesc = catDesc;
	}

	@Override
	public String toString() {
		return "ArticleCatDTO [catId=" + catId + ", catCode=" + catCode + ", catName=" + catName + ", catType="
				+ catType + ", isTextCat=" + isTextCat + ", keywords=" + keywords + ", catDesc=" + catDesc + "]";
	}

}
