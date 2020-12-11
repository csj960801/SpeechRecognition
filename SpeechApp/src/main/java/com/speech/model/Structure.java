package com.speech.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Model단
 * 
 * @author CSJ
 *
 */
public class Structure {

	/**
	 * 자연어 처리 함수
	 * 
	 * @param SpeechData
	 * @return
	 */
	public String speechRecog(List<String> SpeechData) {
		String answer = "";
		for (int i = 0; i < SpeechData.size(); i++) {
			String data = SpeechData.get(i).toString();
			System.out.println("1)리스트에 저장되어있는 데이터: " + data);

			for (int j = 0; j < data.length(); j++) {
				char wordDevide = data.charAt(j);
				System.out.println("2)리스트에 저장된 데이터를 한 문자씩 구별: " + wordDevide);

				if (wordDevide == 'ㅇ') {
					answer = wordDevide + " 포함되어있습니다.";
				}
			}
		}
		return (SpeechData.size() > 0) ? answer : null;
	}

	public static void main(String[] arg) {
		Structure structure = new Structure();

		// 데이터 저장 리스트
		List<String> dataList = new ArrayList<String>();
		// View 측에서 request로 데이터를 받아올 Map
		Map<String, Object> dataMap = new HashMap<String, Object>();

		if (dataList.isEmpty()) {
			// 예제 데이터
			dataMap.put("data", "안녕");
			dataList.add(dataMap.get("data").toString());
		}

		// 결과값
		System.out.println(structure.speechRecog(dataList));
	}

}// end of class