package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.PostVo;

@Repository
public class PostRepository {

	@Autowired
	private SqlSession sqlSession;
	
	public List<PostVo> postAllList(String id) {
		return sqlSession.selectList("post.findAllById",id);
	}
	
	public void postWrite(PostVo vo) {		
		sqlSession.insert("post.write",vo);
	}
	
}
