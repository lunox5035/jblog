package com.bitacademy.jblog.repository;

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
			vo.setTitle("기본 카테고리");
			sqlSession.insert("category.insert", vo);
		}
		
}
