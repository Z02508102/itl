package com.zpx.itl.pojo;

import java.util.List;

public class PageBean<T> {
	
	private int currentPage;//当前页
	private int total;//总记录数
	private int pageSize;//每页显示几条数据
	private int totalPage;//总页数
	private String url;
	private List<T> beanlist;

	public List<T> getBeanlist() {
		return this.beanlist;
	}

	public void setBeanlist(List<T> beanlist) {
		this.beanlist = beanlist;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "PageBean [currentPage=" + currentPage + ", total=" + total + ", pageSize=" + pageSize + ", totalPage="
				+ totalPage + ", url=" + url + ", beanlist=" + beanlist + "]";
	}

	
	
}