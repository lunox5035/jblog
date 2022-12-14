package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.BlogRepository;
import com.bitacademy.jblog.repository.CategoryRepository;
import com.bitacademy.jblog.repository.UserRepository;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.CategoryVo;
import com.bitacademy.jblog.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private CategoryRepository categoryRepository;

//----------------------------------------------------------------------------------------------------
	public void join(UserVo userVo,BlogVo blogVo,CategoryVo categoryVo) {
//		System.out.println("userVo:"+userVo);

		blogVo.setTitle(userVo.getName()+"님의 블로그");
		blogVo.setId(userVo.getId());
		
		categoryVo.setId(userVo.getId());
		
//		System.out.println("blogVo:"+blogVo);
//		System.out.println("categoryVo:"+categoryVo);
		
		userRepository.insert(userVo);
		blogRepository.insert(blogVo);
		categoryRepository.BasicUpdate(categoryVo);
		
	}

//----------------------------------------------------------------------------------------------------

	public UserVo findByIdAndPassword(String id, String password) {
		return userRepository.findByIdAndPassword(id, password);
	}

	
		

}
