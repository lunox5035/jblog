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
//		System.out.println("1.userVo:"+vo);
		sqlSession.insert("user.insert", vo);
//		System.out.println("2.userVo:"+vo);
		
	}
	
//----------------------------------------------------------------------------------------------------
	
	public UserVo findByIdlAndPassword(String id, String password) {
		Map<String, Object> map =new HashMap<>();
		map.put("id", id);
		map.put("password", password);
		
		return (UserVo)sqlSession.selectOne("user.findByIdlAndPassword",map);
		
	}
	
}
