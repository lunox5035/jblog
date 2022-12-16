package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.CategoryVo;

@Repository
public class CategoryRepository {

	@Autowired
	private SqlSession sqlSession;
	
	// 카테고리 생성
	public void BasicUpdate(CategoryVo vo) {
		
		sqlSession.insert("category.insert", vo);
	}
	
	public List<CategoryVo> categotyAllList(String id) {
		return sqlSession.selectList("category.findAllById", id);
	}
	
	public Boolean categoryDelete(Long no) {
		return sqlSession.delete("category.categoryDelete") ==1;
		 
	}
		
}

	