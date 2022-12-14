package com.bitacademy.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.BlogRepository;
import com.bitacademy.jblog.vo.BlogVo;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	
	public List<BlogVo> findAllList() {
		return blogRepository.findAll();
	}
	
	public BlogVo findBlog(String id) {
		return blogRepository.findById(id);
	}
//================================회원정보 수정======================================================	
	public void BasicUpdate(BlogVo vo) {
		blogRepository.BasicUpdate(vo);
	}

//===========================카테고리 수정===========================================================	
	public void adminWrite(BlogVo vo) {
		blogRepository.BasicUpdate(vo);
		
	}
//================================글쓰기===========================================================	
	public void write(BlogVo vo) {
		
		blogRepository.write(vo);
	}
}
