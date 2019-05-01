package com.crm.entities;

public class QueryVo {
	private String custName;//客户名称
	private String custSource;//客户来源你
	private String custIndustry;//所属行业
	private String custLevel;//客户级别
	
	private int startIndex;
	private int pageSize ;
	
	
	private Integer currentPage;//当前页
	
	
	
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

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustSource() {
		return custSource;
	}

	public void setCustSource(String custSource) {
		this.custSource = custSource;
	}

	public String getCustIndustry() {
		return custIndustry;
	}

	public void setCustIndustry(String custIndustry) {
		this.custIndustry = custIndustry;
	}

	public String getCustLevel() {
		return custLevel;
	}

	public void setCustLevel(String custLevel) {
		this.custLevel = custLevel;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	@Override
	public String toString() {
		return "QueryVo [custName=" + custName + ", custSource=" + custSource + ", custIndustry=" + custIndustry
				+ ", custLevel=" + custLevel + ", currentPage=" + currentPage + "]";
	}
	
	
	
	
}
