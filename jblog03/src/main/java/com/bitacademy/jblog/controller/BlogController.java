package com.bitacademy.jblog.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/{id:(?!assets).*}")
public class BlogController {

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
	
	@RequestMapping({"/admin","/admin/basic"})
	public String adminBasic(@PathVariable("id") String id) {
		return"blog/admin-basic";
	}
}
