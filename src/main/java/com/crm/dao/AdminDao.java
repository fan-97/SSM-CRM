package com.crm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.crm.entities.BaseDict;
import com.crm.entities.Customer;
import com.crm.entities.QueryVo;

public interface AdminDao {

	List<BaseDict> getBaseType(String code);

	int getTotalRecords(QueryVo vo);

	List<Customer> getAllCustByVoWithPage(  QueryVo vo);

	Customer getCustomerById(Integer id);

	int update(Customer customer);

	void deleteById(Integer id);

	int insert(Customer customer);
	
}
