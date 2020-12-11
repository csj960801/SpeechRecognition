package com.speech.service;

import java.io.IOException;

import com.speech.vo.SpeechVO;

public interface UserService {
	boolean memberInsert(SpeechVO svo) throws IOException;

	boolean memberLogin(SpeechVO svo) throws IOException;
}
