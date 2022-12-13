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
	public void BasicUpdate(BlogVo vo) {
		blogRepository.BasicUpdate(vo);
	}
}
