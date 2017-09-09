package com.dogiant.api.dto;

import java.io.Serializable;
import java.util.List;

public class PagedResult<T> implements Serializable {

	private static final long serialVersionUID = 8004323068239831454L;

	int pageNo; // 当前页数

	int pageRows; // 每页最多返回多少条记录

	int pageRowsReal; // 当前页返回记录数

	int allPage; // 共多少页

	long allRows; // 共有多少行记录

	List<T> result; // 结果

	public boolean hasNextPage() {
		return (allPage == 1 || pageNo == allPage);
	}

	public boolean hasPrevPage() {
		return (allPage == 1 || pageNo == 1);
	}

	public long getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageRows() {
		return pageRows;
	}

	public void setPageRows(int pageRows) {
		this.pageRows = pageRows;
	}

	public int getPageRowsReal() {
		return pageRowsReal;
	}

	public void setPageRowsReal(int pageRowsReal) {
		this.pageRowsReal = pageRowsReal;
	}

	public long getAllPage() {
		return allPage;
	}

	public void setAllPage(int allPage) {
		this.allPage = allPage;
	}

	public long getAllRows() {
		return allRows;
	}

	public void setAllRows(long allRows) {
		this.allRows = allRows;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public PagedResult<T> getPagedInfo(int pageNo, int pageRows, long counts,
			List<T> result) {
		PagedResult<T> pr = new PagedResult<T>();
		int allP = (int) (counts / pageRows + (counts % pageRows == 0 ? 0 : 1));
		if (pageNo > allP) {
			pageNo = allP;
		}
		if (pageNo == 0) {
			pageNo = 1;
		}
		pr.setAllPage(allP);
		pr.setAllRows(counts);
		pr.setPageNo(pageNo);
		pr.setPageRows(pageRows);
		pr.setPageRowsReal(result == null ? 0 : result.size());
		pr.setResult(result);
		return pr;
	}

}
