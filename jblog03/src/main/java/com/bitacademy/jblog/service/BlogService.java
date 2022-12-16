package com.bitacademy.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.BlogRepository;
import com.bitacademy.jblog.repository.CategoryRepository;
import com.bitacademy.jblog.repository.PostRepository;
import com.bitacademy.jblog.vo.BlogVo;
import com.bitacademy.jblog.vo.CategoryVo;
import com.bitacademy.jblog.vo.PostVo;

@Service
public class BlogService {

	@Autowired
	private BlogRepository blogRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private PostRepository postRepository; 
	
	public List<BlogVo> findAllList(String id) {
		return blogRepository.findAll(id);
	}
	
	public BlogVo findBlog(String id) {
		return blogRepository.findById(id);
	}
	//------post 개시판물 출력용-----		
	public List<PostVo> postAllList(String id) {
		return postRepository.postAllList(id);
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
//===========================카테고리 삭제===========================================================	
	public void categoryDelete(Long no) {
		categoryRepository.categoryDelete(no);
	}
	
//================================글쓰기===========================================================	
	public void postWrite(PostVo vo) {
		
		postRepository.postWrite(vo);
	}
	
	
//======
}
