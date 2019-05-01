package com.crm.service;

import java.util.List;

import com.crm.entities.BaseDict;
import com.crm.entities.Customer;
import com.crm.entities.PageModel;
import com.crm.entities.QueryVo;

public interface AdminService {

	/**
	 * 查询基本的类型
	 * @param code
	 * @return
	 */
	List<BaseDict> getBaseType(String code);

	
	/**
	 * 根据条件查询用户列表 分页显示
	 * @param vo  包含 四个条件：客户姓名、客户来源、客户行业、客户级别  和当前页
	 * @return  返回pageModel对象， 具体属性看com.crm.entities.PageModel
	 */
	PageModel<Customer> getAllCustByVoWithPage(QueryVo vo);

	
	/**
	 * 根据客户id查询客户
	 * @param id
	 * @return
	 */
	Customer getCustomerById(Integer id);


	/**
	 * 更新客户
	 * @param customer
	 */
	int update(Customer customer);


	void deleteById(Integer id);


	int insertCustomer(Customer customer);
	
}
