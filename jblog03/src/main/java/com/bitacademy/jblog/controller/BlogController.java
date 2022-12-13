package com.bitacademy.jblog.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitacademy.jblog.service.BlogService;
import com.bitacademy.jblog.vo.BlogVo;

@Controller
@RequestMapping("/{id:(?!assets).*}")
public class BlogController {
	
	@Autowired
	private BlogService blogService;
//===============================================================================================	
	@RequestMapping({"", "/{path1}", "/{path1}/{path2}"})
	public String index(
			@PathVariable("id") String id,
			@PathVariable("path1") Optional<Long> path1,
			@PathVariable("path2") Optional<Long> path2){
		Long categotyNo = 0L;
		Long postNo = 0L;
		
		if(path1.isPresent()) {
			categotyNo= path1.get();
			
		}else if(path2.isPresent()) {
			categotyNo=path2.get();
		}
				
		return "blog/main";
	}
	
//================================회원정보 수정======================================================	
	@RequestMapping({"/admin", "/admin/basic"})
	public String adminBasic(@PathVariable("id") String id) {
		return "blog/admin-basic";
	}

//	@RequestMapping(value = {"/admin","/admin/basic"}, method = RequestMethod.GET)
//	public String adminBasic(@PathVariable("id") String id, Model model) {
//		model.addAttribute("id",id);
//		
//		return "bolg/admin-basic";
//	}
//	
//	@RequestMapping(value = {"/admin","/admin/basic"}, method = RequestMethod.POST)
//	public String adminBasic(@PathVariable("id") String id, BlogVo vo) {
//		vo.setId(id);
//		blogService.BasicUpdate(vo);
//		return "redirect:/+id";
//	}
////===============================================================================================	

}
