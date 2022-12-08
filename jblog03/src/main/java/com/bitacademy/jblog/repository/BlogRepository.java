package com.bitacademy.jblog.repository;

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
		System.out.println("2.blogVo:"+vo);
		vo.setProfile("기본 프로필");
		System.out.println("3.blogVo:"+vo);
		sqlSession.insert("blog.insert", vo);
		System.out.println("4.blogVo:"+vo);
	}
}
