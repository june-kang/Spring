$(function(){
	
	$('.form_submit').submit(function(){ // form_submit은 submit 타입의 클래스가 아니라 form 전체의 클래스값! form을 submit 하는것
		
		var uid = $('input[name=uid]').val();
		var pass = $('input[name=pass]').val();
		var pass2 = $('input[name=pass2]').val();
		var name = $('input[name=name]').val();


		var pattern1 = /[a-zA-Z0-9]/;

		// 아이디 자리수 체크(자리수 4 미만)
		if(uid.length < 4){
			alert('아이디는 최소 4자 이상이어야 합니다.');
			return false;
		}

		// 비밀번호 일치 여부 확인
		if(pass!=pass2){
			alert('비밀번호가 서로 일치하지 않습니다.');
			return false;
		}

		if(!pattern1.test(pass)||pass.length<8||pass.length>20){
			alert('비밀번호는 영문과 숫자로 8자리 이상 20자리 이하로 구성하여야 합니다.');
			return false;
		}

		if(!isUidOk){
			alert('이미 사용중인 아이디입니다.');
			return false;
		}

		if(!isNickOk){
			alert('이미 사용중인 닉네임입니다.');
			return false;
		}
		if(!isHpOk){
			alert('이미 사용중인 전화번호입니다.');
			return false;
		}
		if(!isEmailOk){
			alert('이미 사용중인 이메일입니다.');
			return false;
		}
		
		
	});
	
});
