package com.bitacademy.jblog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bitacademy.jblog.service.UserService;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.CategoryVo;
import com.bitacademy.jblog.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
//----------------------------------------------------------------------------------------------------
	// 회원가입
	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join(@ModelAttribute UserVo userVo) {
		return "user/join";
	}
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(@ModelAttribute @Valid UserVo uservo,BindingResult result, Model model) {
		if (result.hasErrors()){
			List<ObjectError> errors =result.getAllErrors();
			for(ObjectError error : errors) {
				System.out.println(error);
			}
			
			model.addAllAttributes(result.getModel());
			//대체가능
			//model.addAttribute("userVo",userVo);
			return "user/join";
		}
//		blogvo.setTitle(uservo.getName()+"의 블로그");
//		blogvo.setProfile("profile");
//		categoryVo.setTitle("기본 카테고리");
//		
//		blogvo.setUser_id(uservo.getId());
//		categoryVo.setId(uservo.getId());
		
		userService.join(uservo);
		System.out.println("UserRepository:"+uservo);
		
		return "redirect:/user/joinsuccess";
	}
	@RequestMapping("/joinsuccess")
	public String joinsuccess() {
		return "user/joinsuccess";
	}
//----------------------------------------------------------------------------------------------------

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {

		return "user/login";
	}
//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public String login() {
//
//		return "user/login";
//	}

}
