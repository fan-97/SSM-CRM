package com.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crm.dao.AdminDao;
import com.crm.entities.BaseDict;
import com.crm.entities.Customer;
import com.crm.entities.PageModel;
import com.crm.entities.QueryVo;
import com.crm.service.AdminService;

@Service
@Transactional//开启事务
public class AdminServiceImpl implements AdminService {
		
	@Autowired
	private AdminDao dao;

	public List<BaseDict> getBaseType(String code) {
		return dao.getBaseType(code);
	}

	public PageModel<Customer> getAllCustByVoWithPage(QueryVo vo) {
		//1.先根据条件去dao层查询符合条件的总的记录数
		int totalRecords = dao.getTotalRecords(vo);
		//2.创建pageModel对象
		PageModel<Customer> pageModel = new PageModel<Customer>(vo.getCurrentPage(), totalRecords);
		vo.setStartIndex(pageModel.getStartIndex());
		vo.setPageSize(pageModel.getPageSize());
		//3.查询当前的对象并设置list集合到pageModel对象中
		List<Customer> list = dao.getAllCustByVoWithPage(vo);
		pageModel.setList(list);
		//4.设置url
		pageModel.setUrl("admin/list");
		return pageModel;
	}

	public Customer getCustomerById(Integer id) {
		return dao.getCustomerById(id);
	}

	public int update(Customer customer) {
		return dao.update(customer);
	}

	public void deleteById(Integer id) {
		dao.deleteById(id);
	}

	public int insertCustomer(Customer customer) {
		return dao.insert(customer);
	}
}
