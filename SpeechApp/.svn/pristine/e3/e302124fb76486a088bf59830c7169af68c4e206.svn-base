/**
 * CSJ
 */
window.onload = speech();
/**
 * 음성인식 담당 함수
 * 
 * @returns
 */
function speech() {

	window.SpeechRecognition = window.SpeechRecognition
			|| window.webkitSpeechRecognition;

	const recog = new SpeechRecognition();

	recog.lang = "ko-KR";

	recog.continuous = true;

	recog.maxAlternatives = 11000;

	recog.interimResults = true;

	recog.start();
	recog.addEventListener("result", (recogResult) => {
		console.log(recogResult);
		
		for (var i = 0; i < recogResult.results.length; i++) {
			var data = recogResult.results[i][0].transcript;
			console.log("인식된데이터: " + data);
			document.querySelector(".testRecognition").innerHTML = data;
		    
			// 회원가입
			if((data.indexOf("가입") > -1) || (data.indexOf("회원가입") > -1)){
		    	window.location.href="/index.do?memberReg=no";
		    }
			// 로그인
		    if((data.indexOf("로그인") > -1) || (data.indexOf("로긴") > -1)){
		    	window.location.href="/index.do?memberReg=yes";
		    }
		    //프로그램 종료
		    if((data.indexOf("종료") > -1) || (data.indexOf("꺼") > -1)){
		        alert("프로그램 종료합니다. 좋은하루되세요");
		        self.close();
		    }
		}
	});
};

/**
 * 회원가입과 로그인 전용 함수
 * 
 * @param type
 * @returns
 */
function memberFunction(type) {

	if (type == "login") {
		var loginId = document.querySelector(".login_id").value;
		var loginPw = document.querySelector(".login_pw").value;
		var loginArray = [ loginId, loginPw ];
		for (var i = 0; i < loginArray.length; i++) {
			if (loginArray[i] === "" || loginArray[i].length <= 0) {
				alert("입력되지않은 로그인 폼이 있습니다");
				return false;
			}
		}
		document.speechLoginFrm.method = "post";
		document.speechLoginFrm.action = "/memberLogin/memberLogin.do";
		document.speechLoginFrm.submit();

	} else {
		var memberId = document.querySelector(".member_id").value;
		var memberPw = document.querySelector(".member_pw").value;
		var memberArray = [ memberId, memberPw ];
		for (var i = 0; i < memberArray.length; i++) {
			if (memberArray[i].length <= 0 || memberArray[i] === "") {
				alert("입력되지않은 회원가입 폼이 있습니다");
				return false;
			}
		}
		document.speechMemberFrm.method = "post";
		document.speechMemberFrm.action = "/member/memberReg.do";
		document.speechMemberFrm.submit();
	}

}