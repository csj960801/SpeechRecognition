package com.speech.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.speech.dao.UserDAOImpl;
import com.speech.vo.SpeechVO;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAOImpl dao;

	/**
	 * 회원가입
	 * 
	 * @throws IOException
	 */
	@Override
	public boolean memberInsert(SpeechVO svo) throws IOException {
		// TODO Auto-generated method stub
		return dao.memberInsert(svo);
	}

	/**
	 * 로그인
	 */
	@Override
	public boolean memberLogin(SpeechVO svo) throws IOException {
		// TODO Auto-generated method stub
		return dao.memberLogin(svo);
	}

}
