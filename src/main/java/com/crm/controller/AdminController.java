package com.crm.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.crm.entities.BaseDict;
import com.crm.entities.Customer;
import com.crm.entities.PageModel;
import com.crm.entities.QueryVo;
import com.crm.service.AdminService;

@Controller
@RequestMapping("admin")
public class AdminController {

	@Autowired
	private AdminService service;

	/**
	 * 分页查询客户的列表
	 * 
	 * @param currentPage 要查询的当前页
	 * @return 返回 "/WEB-INF/jsp/customer.jsp"
	 */
	@RequestMapping(value = {"list"})
	public String customerList(QueryVo vo, Model model) {
		// 1.先查询分类信息 客户来源:002 所属行业：001 客户等级：006
		List<BaseDict> fromType = service.getBaseType("002");
		model.addAttribute("fromType", fromType);
		List<BaseDict> industryType = service.getBaseType("001");
		model.addAttribute("industryType", industryType);
		List<BaseDict> levelType = service.getBaseType("006");
		model.addAttribute("levelType", levelType);
		// 2.按条件查询客户信息

		// 处理查询条件
		if (null != vo) {
			if (null != vo.getCustName() && !vo.getCustName().trim().equals("")) {
				vo.setCustName(vo.getCustName().trim());
			}
			if (null != vo.getCustSource() && !vo.getCustName().trim().equals("")) {
				vo.setCustSource(vo.getCustSource());
			}
			if (null != vo.getCustIndustry() && !vo.getCustIndustry().trim().equals("")) {
				vo.setCustIndustry(vo.getCustIndustry());
			}
			if (null != vo.getCustLevel() && !vo.getCustLevel().trim().equals("")) {
				vo.setCustLevel(vo.getCustLevel());
			}

			if (null == vo.getCurrentPage()) {
				vo.setCurrentPage(1);
			}
			
		}
		model.addAttribute("vo",vo);
		// 调用业务逻辑层进行查询
		PageModel<Customer> page = service.getAllCustByVoWithPage(vo);
		//返回到页面显示
		model.addAttribute("page",page);
		return "customer";
	}
	
	@RequestMapping("editUI")
	@ResponseBody
	public Customer editCustomer(Integer id) {
		System.err.println(id);
		//查询当前客户的信息
		Customer customer = service.getCustomerById(id);
		return customer;
	}
	
	@RequestMapping("update")
	@ResponseBody
	public String update(Customer customer) {
		service.update(customer);
		return "ok";
	}
	
	@RequestMapping("delete")
	@ResponseBody
	public String delete(Integer id) {
		service.deleteById(id);
		return "ok";
	}
	
	@RequestMapping("deletes")
	@ResponseBody
	public String deletes(HttpServletRequest request) {
		String[] values = request.getParameterValues("check");
		for(int i=0;i<values.length;i++) {
			service.deleteById(Integer.parseInt(values[i]));
		}
		return "ok";
	}
	
	@RequestMapping("insert")
	@ResponseBody
	public String insert(Customer customer) {
		customer.setCustCreatetime(new Date());
		int num  = service.insertCustomer(customer);
		if (num>=1) {
			return "ok";
		}
		return "err";
	}
}
