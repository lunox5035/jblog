package com.bitacademy.jblog.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitacademy.jblog.repository.CategoryRepository;
import com.bitacademy.jblog.service.BlogService;
import com.bitacademy.jblog.service.CategoryService;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.CategoryVo;
import com.bitacademy.jblog.vo.PostVo;

@Controller
@RequestMapping("/{id:(?!assets).*}")
public class BlogController {
	
	@Autowired
	private BlogService blogService;
//===============================================================================================	
//	@RequestMapping({"", "/{path1}", "/{path1}/{path2}"})
//	public String index(
//			@PathVariable("id") String id,
//			@PathVariable("path1") Optional<Long> path1,
//			@PathVariable("path2") Optional<Long> path2){
//		Long categotyNo = 0L;
//		Long postNo = 0L;
//		
//		if(path1.isPresent()) {
//			categotyNo= path1.get();
//			
//		}else if(path2.isPresent()) {
//			categotyNo=path2.get();
//		}
//			
//		return "blog/main";
//	}
	@RequestMapping({"", "/{path1}", "/{path1}/{path2}"})
	public String index(
			@PathVariable("id") String id,
			@PathVariable("path1") Optional<Long> path1,
			@PathVariable("path2") Optional<Long> path2,
			Model model,BlogVo blogvo, PostVo postvo){
		Long categotyNo = 0L;
		Long postNo = 0L;
		
		if(path1.isPresent()) {
			categotyNo= path1.get();
			
		}else if(path2.isPresent()) {
			categotyNo=path2.get();
		}
		
		List<BlogVo> list = blogService.findAllList(id);
		model.addAttribute("list", list);		
		System.out.println(list);

		//------post 개시판물 출력용-----		
		List<PostVo> postList = blogService.postAllList(id);
		model.addAttribute("postList", postList);		
		System.out.println(postList);
				
		return "blog/main";
	
	}
	
	
//================================기본설정 수정======================================================	
//	@RequestMapping(value = {"/admin","/admin/basic"}, method = RequestMethod.GET)
//	public String adminBasic(@PathVariable("id") String id) {
//		return "blog/admin-basic";
//	}

	@RequestMapping(value = {"/admin","/admin/basic"}, method = RequestMethod.GET)
	public String adminBasic(@PathVariable("id") String id, Model model) {
		model.addAttribute("id",id);
		
		return "blog/admin-basic";
	}
//	
	@RequestMapping(value = {"/admin","/admin/basic"}, method = RequestMethod.POST)
	public String adminBasic(@PathVariable("id") String id, BlogVo blogvo) {
		blogvo.setId(id);
		blogService.BasicUpdate(blogvo);
		return "redirect:/+id";
	}
//===========================카테고리 추가===========================================================	
	@RequestMapping(value = "admin/category",method = RequestMethod.GET)
	public String adminCategory(@PathVariable("id") String id, Model model){
		List<CategoryVo> categoryList = blogService.categotyAllList(id);
		model.addAttribute("categoryList",categoryList);
		System.out.println("카테고리 내용 :"+categoryList);
		
		return "blog/admin-category";
	}
	
	@RequestMapping(value = "admin/category",method = RequestMethod.POST)
	public String adminCategory(@PathVariable("id") String id, CategoryVo categorvo) {
		categorvo.setId(id);
		blogService.adminCategory(categorvo);
		return "redirect:/+id";
	}
//===========================카테고리 삭제===========================================================	
	@RequestMapping(value = "admin/category/{no}",method = RequestMethod.GET)
	public String adminDelete(@PathVariable("id") String id,@PathVariable("no") Long no) {
		System.out.println("삭제:"+no+"=============================================");
		return "redirect:/+id";
	}
//=================================글쓰기==========================================================	
	@RequestMapping(value = "admin/write",method = RequestMethod.GET)
	public String adminWrite(@PathVariable("id") String id, Model model){
		
		List<BlogVo> list = blogService.findAllList(id);
		model.addAttribute("list", list);		
		System.out.println(list);

		return "blog/admin-write";
	}
	
	@RequestMapping(value = "admin/write",method = RequestMethod.POST)
	public String adminWrite(@PathVariable("id")String id,PostVo postvo,Model model){
		model.addAttribute("postvo",postvo);
		
		System.out.println("1."+postvo);
		blogService.postWrite(postvo);
		System.out.println("2."+postvo);
		return "redirect:/+id";
	}
	
}
