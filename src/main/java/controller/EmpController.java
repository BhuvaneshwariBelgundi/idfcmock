package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import dao.EmpDao;
import dto.EmpDto;
@Controller
public class EmpController {
	@Autowired
	EmpDto dto;
	@Autowired
	EmpDao dao;
	
@RequestMapping("/create")	
public ModelAndView signup() {
	ModelAndView modelAndView=new ModelAndView("signup.jsp");
	modelAndView.addObject("empobject", dto);
	return modelAndView;
}

@ResponseBody
@RequestMapping("/insert")
public void save(EmpDto dto)
{
	dao.insert(dto);
}

@RequestMapping("/delete")
public ModelAndView delete() {
	ModelAndView modelAndView=new ModelAndView("delete.jsp");
	modelAndView.addObject("deletebyid", dto);
	return modelAndView;
}

@ResponseBody
@RequestMapping("/deleteEmail")
public String deleteperson(EmpDto dto)
{
	EmpDto empDto=dao.findbyId(dto.getEmail());
	dao.deleteData(empDto);
	return "data deleted successfully" +empDto.getEmail();
}

@RequestMapping("/update")
public ModelAndView udate() {
	ModelAndView modelAndView=new ModelAndView("update.jsp");
	modelAndView.addObject("updatebyid", dto);
	return modelAndView;
}

@ResponseBody
@RequestMapping("/updatedetails")
public String updateperson(EmpDto dto) {
	dao.updateData(dto);
	return "data updated" +dto.getEmail();
	
}


@RequestMapping("/fetch")
public ModelAndView fetch()
{
	ModelAndView modelAndView=new ModelAndView("fetch.jsp");
	modelAndView.addObject("fetchbyid", dto);
	return modelAndView;
	
}

@ResponseBody
@RequestMapping("/display")
public ModelAndView fetchdetails(EmpDto dto) {
	String email=dto.getEmail();
	EmpDto d1=dao.fetchData(email);
	ModelAndView modelAndView=new ModelAndView("display.jsp");
	modelAndView.addObject("key", d1);
	return modelAndView;
}

@ResponseBody
@RequestMapping("/displayAll")
public ModelAndView displayall()
{
	List<EmpDto> details=dao.fetchAll();
	ModelAndView modelAndView=new ModelAndView("fetchAll.jsp");
	modelAndView.addObject("key", details);
	return modelAndView;
}
}
