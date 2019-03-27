var isUidOk = false;
var isNickOk = false;
var isHpOk = false;
var isEmailOk = false;

$(document).ready(function(){
	
	
	$('input[name=uid]').keyup(function(){
		var tag = $(this);
		var uid = tag.val();
		
		if(uid.length >= 4){
			// ajax 통신
			$.ajax({
				url:"/fridgeideas/member/idCheck",
				type:"get",
				data:{"uid":uid},
				dataType:"json",
				success:function(data){
					if(data.result==1){
						$('.resultId').css({'color':'red','font-size':'11px'}).text('이미 사용중인 아이디입니다.');
						tag.focus();
						isUidOk = false;
					} else{
						$('.resultId').css({'color':'green','font-size':'11px'}).text('사용가능한 아이디입니다.');
						isUidOk = true;
					}
				}
				
			});				
		}
	});
	
	$('input[name=nick]').focusout(function(){
		var tag = $(this);
		var nick = tag.val();
		
		if(nick.length > 0){
			$.ajax({
				url:"/fridgeideas/member/nickCheck",
				type:"get",
				data:{"nick":nick},
				dataType:"json",
				success:function(data){
					if(data.result==1){
						$('.resultNick').css({'color':'red','font-size':'11px'}).text('이미 사용중인 닉네임입니다.');
						tag.focus();
						isNickOk = false;
					} else{
						$('.resultNick').css({'color':'green','font-size':'11px'}).text('사용가능한 닉네임입니다.');
						isNickOk = true;
					}
					
				}
				
				
			});
		}		
		
	});
	
	$('input[name=hp]').focusout(function(){
		var tag = $(this);
		var hp = tag.val();
		
		if(hp.length > 0){
			$.ajax({
				url:"/fridgeideas/member/hpCheck",
				type:"get",
				data:{"hp":hp},
				dataType:"json",
				success:function(data){
					if(data.result==1){
						$('.resultHp').css({'color':'red','font-size':'11px'}).text('이미 사용중인 전화번호입니다.');
						tag.focus();
						isHpOk = false;
					} else{
						$('.resultHp').css({'color':'green','font-size':'11px'}).text('사용가능한 전화번호입니다.');
						isHpOk = true;
					}
					
				}
				
				
			});
		}
			
		
	});
	
	$('input[name=email]').focusout(function(){
		var tag = $(this);
		var email = tag.val();
		
		if(email.length > 0){
			$.ajax({
				url:"/fridgeideas/member/emailCheck",
				type:"get",
				data:{"email":email},
				dataType:"json",
				success:function(data){
					if(data.result==1){
						$('.resultEmail').css({'color':'red','font-size':'11px'}).text('이미 사용중인 이메일입니다.');
						tag.focus();
						isEmailOk = false;
					} else{
						$('.resultEmail').css({'color':'green','font-size':'11px'}).text('사용가능한 이메일입니다.');
						isEmailOk = true;
					}
					
				}
						
			});
			
		}		
		
		
	});
	
});