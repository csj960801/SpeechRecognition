package com.speech.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import com.speech.SqlSession.SqlSessionOpenner;
import com.speech.vo.SpeechVO;

public class UserDAOImpl implements UserDAO {

	private static SqlSession session;

	/**
	 * 회원가입
	 * 
	 * @throws IOException
	 */
	@Override
	public boolean memberInsert(SpeechVO svo) throws IOException {
		session = SqlSessionOpenner.sessionInstance().openSession();
		int userInsert = session.insert("memberInsert", svo);
		if (userInsert > 0) {
			session.commit();
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 로그인
	 * 
	 * @throws IOException
	 */
	@Override
	public boolean memberLogin(SpeechVO svo) throws IOException {
		session = SqlSessionOpenner.sessionInstance().openSession();
		SpeechVO userLogin = session.selectOne("memberLogin", svo);
		if (userLogin != null) {
			// session.commit();
			return true;
		} else {
			return false;
		}
	}
}