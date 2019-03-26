<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<section id="sub">
  <div class="banner" id="community_banner">
  	<span>Community</span>
  </div>
  <nav>
    <img src="${ctxPath }/img/tag.png" alt="tag" />
    <span>Home > <strong>Community</strong></span>
  </nav>
  <div class="commu_write">
    <div class="write_form">
      <form action="#" method="post">
		<table>
			<tr>
				<td>Title</td>
				<td><input type="text" name="subject" placeholder="제목을 입력하세요." required /></td>
			</tr>
			<tr>
				<td>Content</td>
				<td>
					<textarea name="content" rows="20" required></textarea>
				</td>
			</tr>
			<tr>
				<td>Upload</td>
				<td>
					<input type="file" name="file" />
				</td>
			</tr>
		</table>
		<div class="btns">
	        <input type="submit" class="submit" value="submit" />
		  <input type="reset" class="reset" value="reset" />
		</div>
  	  </form>
    </div>
  </div>
</section>
<%@ include file="../_tail.jsp" %>
