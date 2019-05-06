package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.entities.BaseDict;
import com.crm.entities.Customer;
import com.crm.entities.QueryVo;

 /** 
 * @ClassName: AdminDao 
 * @Description: TODO
 * @author: moon
 * @date: 2019年5月6日 下午3:03:52  
 */
public interface AdminDao {
	
	
	/**
	 * 查询分类类别
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseType(String code);

	
	/**
	 * 根据条件获取总的记录数
	 * @param vo
	 * @return
	 */
	int getTotalRecords(QueryVo vo);

	/**
	 * 通过条件分页查询对象集合
	 * @param vo
	 * @return
	 */
	List<Customer> getAllCustByVoWithPage(  QueryVo vo);

	/**
	 * 通过id获取客户信息
	 * @param id
	 * @return
	 */
	Customer getCustomerById(Integer id);

	/**
	 * 更新客户信息
	 * @param customer
	 * @return
	 */
	int update(Customer customer);

	/**
	 * 删除客户
	 * @param id
	 */
	void deleteById(Integer id);

	/**
	 * 添加客户
	 * @param customer
	 * @return
	 */
	int insert(Customer customer);
	
}
