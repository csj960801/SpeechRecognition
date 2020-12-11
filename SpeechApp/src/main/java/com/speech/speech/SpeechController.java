package com.speech.speech;

import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.speech.service.UserServiceImpl;
import com.speech.vo.SpeechVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class SpeechController {

	@Autowired
	private UserServiceImpl service;

	private static final Logger logger = LoggerFactory.getLogger(SpeechController.class);

	/**
	 * toIndex
	 */
	@RequestMapping(value = "/index.do")
	public Map<String, Object> home(Locale locale, Model model) {
		Map<String, Object> indexMap = new HashMap<String, Object>();
		return indexMap;
	}

	/**
	 * 회원가입전용
	 * 
	 * @param svo
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/member/memberReg.do", method = RequestMethod.POST)
	public Map<String, Object> MemberReg(SpeechVO svo) throws IOException {
		boolean regFlag = service.memberInsert(svo);
		Map<String, Object> memberMap = new HashMap<String, Object>();
		if (regFlag) {
			memberMap.put("success", regFlag);
		}

		return memberMap;
	}

	/**
	 * 로그인전용
	 * 
	 * @param svo
	 * @return
	 * @throws IOException
	 */
	@RequestMapping(value = "/memberLogin/memberLogin.do", method = RequestMethod.POST)
	public Map<String, Object> MemberLogin(SpeechVO svo) throws IOException {
		boolean loginFlag = service.memberLogin(svo);
		Map<String, Object> memberMap = new HashMap<String, Object>();

		logger.info("로그인id: " + svo.getLogin_id());
		logger.info("로그인pw: " + svo.getLogin_pw());
		logger.info("로그인 성공여부 " + loginFlag);
		if (loginFlag) {
			memberMap.put("loginSuccess", loginFlag);
		}

		return memberMap;
	}

}