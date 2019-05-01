package com.crm.entities;


 /** 
 * @ClassName: Base_Dict 
 * @Description: 数据字典类
 * @author: fan
 * @date: 2019年4月30日 上午8:48:51  
 */
public class BaseDict {
	private String dictId;//字典id
	private String dictTypeCode;//数据字典类别代码
	private String dictTypeName;//数据字典类别名称
	private String dictItemName;//数据字典项目名称
	private String dictItemCode;//数据字典项目代码（可为空）
	private int dictSort;//排序字段
	private String dictEnable;//字典可用状态 1：可用 0：暂停
	private String dictMemo;//备注
	
	
	
	public String getDictId() {
		return dictId;
	}
	public void setDictId(String dictId) {
		this.dictId = dictId;
	}
	public String getDictTypeCode() {
		return dictTypeCode;
	}
	public void setDictTypeCode(String dictTypeCode) {
		this.dictTypeCode = dictTypeCode;
	}
	public String getDictTypeName() {
		return dictTypeName;
	}
	public void setDictTypeName(String dictTypeName) {
		this.dictTypeName = dictTypeName;
	}
	public String getDictItemName() {
		return dictItemName;
	}
	public void setDictItemName(String dictItemName) {
		this.dictItemName = dictItemName;
	}
	public String getDictItemCode() {
		return dictItemCode;
	}
	public void setDictItemCode(String dictItemCode) {
		this.dictItemCode = dictItemCode;
	}
	public int getDictSort() {
		return dictSort;
	}
	public void setDictSort(int dictSort) {
		this.dictSort = dictSort;
	}
	public String getDictEnable() {
		return dictEnable;
	}
	public void setDictEnable(String dictEnable) {
		this.dictEnable = dictEnable;
	}
	public String getDictMemo() {
		return dictMemo;
	}
	public void setDictMemo(String dictMemo) {
		this.dictMemo = dictMemo;
	}
	
	
}
