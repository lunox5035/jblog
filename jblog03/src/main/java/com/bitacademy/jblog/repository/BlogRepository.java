package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.BlogVo;

@Repository
public class BlogRepository {

	@Autowired
	private SqlSession sqlSession;
	
	// 블로그 생성
	public void insert(BlogVo vo) {
		sqlSession.insert("blog.insert", vo);
	}
	
	public List<BlogVo> findAll(String id) {
		return sqlSession.selectList("blog.findAll",id);
	}
	
	public BlogVo findById(String id) {
		return sqlSession.selectOne("blog.findById",id);
	}
		
	public void BasicUpdate(BlogVo vo) {
		sqlSession.update("blog.BasicUpdate",vo);
	}
	
}
