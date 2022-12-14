package com.bitacademy.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.BlogRepository;
import com.bitacademy.jblog.repository.CategoryRepository;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.CategoryVo;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<BlogVo> findAllList(String id) {
		return blogRepository.findAll(id);
	}
	
	public BlogVo findBlog(String id) {
		return blogRepository.findById(id);
	}
//================================기본설정 수정======================================================	
	public void BasicUpdate(BlogVo vo) {
		blogRepository.BasicUpdate(vo);
	}

//===========================카테고리 추가===========================================================	
	public void adminCategory(CategoryVo vo) {
		categoryRepository.BasicUpdate(vo);
		
	}	
	public List<CategoryVo> categotyAllList(String id) {
		return categoryRepository.categotyAllList(id);
	}
//================================글쓰기===========================================================	
	public void write(BlogVo vo) {
		
		blogRepository.write(vo);
	}
}
