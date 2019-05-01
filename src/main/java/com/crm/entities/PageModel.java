package com.crm.entities;

import java.util.List;

public class PageModel<T> {

	private int currentPage;// 当前页
	private int startIndex;// 开始索引 计算
	private int pageSize = 10;// 每一页显示的大小,默认显示10条记录
	private int totalRecords;// 总的记录数,查询
	private int totalPage;// 总的页数，通过计算
	private int prePage;// 上一页
	private int nextPage;// 下一页
	
	private boolean head;//是否是首页
	private boolean tail;//是否是末尾页
	
	private int startPage;// 开始页码
	private int endPage;// 结束页码
	private List<T> list;// 页面显示的对象集合

	private String url;// 链接

	public PageModel(int currentPage, int totalRecords) {
		this.currentPage = currentPage;
		this.totalRecords = totalRecords;

		totalPage = (totalRecords % pageSize == 0) ? (totalRecords / pageSize) : (totalRecords / pageSize + 1);
		startIndex = (currentPage - 1) * pageSize;

		startPage = currentPage - 5;
		endPage = currentPage + 5;

		// 页码显示1-10页
		if (totalPage > 10) {
			if (startPage < 1) {
				startPage = 1;
				endPage = startPage + 9;
			}
			if (endPage > totalPage) {
				endPage = totalPage;
				startPage = endPage - 9;
			}

		} else {
			startPage = 1;
			endPage = totalPage;
		}
	}

	public List<T> getList() {
		return list;
	}

	public void setList(List<T> list) {
		this.list = list;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalRecords() {
		return totalRecords;
	}

	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public boolean getHead() {
		return currentPage==1;
	}


	public boolean getTail() {
		return currentPage==totalPage;
	}

	public int getPrePage() {
		return currentPage-1;
	}

	public void setPrePage(int prePage) {
		this.prePage = prePage;
	}

	public int getNextPage() {
		return currentPage+1;
	}

	public void setNextPage(int nextPage) {
		this.nextPage = nextPage;
	}

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
