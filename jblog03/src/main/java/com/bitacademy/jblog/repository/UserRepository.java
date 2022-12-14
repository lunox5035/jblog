package com.bitacademy.jblog.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.UserVo;

@Repository
public class UserRepository {

	@Autowired
	private SqlSession sqlSession;

//----------------------------------------------------------------------------------------------------

	public void insert(UserVo vo) {
		sqlSession.insert("user.insert", vo);
		
	}
	
//----------------------------------------------------------------------------------------------------
	
	public UserVo findByIdAndPassword(String id, String password) {
		Map<String, Object> map =new HashMap<>();
		map.put("id", id);
		map.put("password", password);
		
		return (UserVo)sqlSession.selectOne("user.findByIdAndPassword",map);
		
	}
	
}
