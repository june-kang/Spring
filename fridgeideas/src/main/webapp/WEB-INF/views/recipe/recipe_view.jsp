<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<script>
	$(function(){
		var time_h = $('.time_h');
		var time_m = $('.time_m');
		
		if(${recipeVO.cooking_time_h}==0){
			time_h.hide();
		} else if(${recipeVO.cooking_time_m}==0){
			time_m.hide();
		}
		
	});
</script>
<section id="sub">
  <div class="banner" id="recipe_banner"><span>Recipe</span></div>
  <nav>
    <img src="${ctxPath }/img/tag.png" alt="tag" />
    <span>Home > Recipe >  <strong>Beginner</strong></span>
  </nav>
  <div class="recipe_intro">
    <div class="recipe_info">
      <p>
        <span>${recipeVO.recipe_name }</span><br />
        <span>★★★★★</span><br />
        <span>${recipeVO.made} made it | ${recipeVO.review }reviews | ${recipeVO.clipped} clipped </span><br />
        <span>Recipe by : ${recipeVO.nick} </span>
      </p>
      <p>
        ${recipeVO.author_write }
      </p>
    </div>
    <div class="recipe_photo">

      <ul>
        <li><img src="${ctxPath }/img/i_made_it.png" alt="i made it" /><span>I Made It</span></li>
        <li><img src="${ctxPath }/img/pre_scrap.png" alt="스크랩전" /><span>Scrap</span></li>
        <li><img src="${ctxPath }/img/rating.png" alt="별점주기" /><span>Rating</span></li>
      </ul>
    </div>
  </div>
  <div class="ingredients">
    <div>
      <span>Ingredients</span>
      <ul>
      <li><img src="${ctxPath }/img/cooking_time.png" alt="요리시간"><span class="time_h">${recipeVO.cooking_time_h } h  </span><span class="time_m">${recipeVO.cooking_time_m } m</span></li>
      <li><img src="${ctxPath }/img/serving.png" alt="몇인분"><span>${recipeVO.serving } servings</span></li>
      </ul>
    </div>
      <div>
        <ul>
        <c:forEach var="source" items="${ingredList }">
          <li><img src="${ctxPath }/img/mark.png" alt="mark" /><span>${source }</span></li>
         </c:forEach>
        </ul>
    </div>
  </div>
  <div class="direction">
    <div>
      <span>Direction</span>
    </div>
    <ul>
    <c:if test="${!empty recipeVO.direction1 }">
      <li>
        <img src="${ctxPath }/img/1.png" alt="1" />
        ${recipeVO.direction1 }
      </li>
    </c:if>
    <c:if test="${!empty recipeVO.direction2 }">
      <li>
        <img src="${ctxPath }/img/2.png" alt="2" />
        ${recipeVO.direction2 }
      </li>
    </c:if>
    <c:if test="${!empty recipeVO.direction3 }">
      <li>
        <img src="${ctxPath }/img/3.png" alt="3" />
        ${recipeVO.direction3 }
      </li>
    </c:if>
    <c:if test="${!empty recipeVO.direction4 }">
      <li>
        <img src="${ctxPath }/img/4.png" alt="4" />
        ${recipeVO.direction4 }
      </li>
    </c:if>
    <c:if test="${!empty recipeVO.direction5 }">
      <li>
        <img src="${ctxPath }/img/5.png" alt="5" />
        ${recipeVO.direction5 }
      </li>
    </c:if>
    <c:if test="${!empty recipeVO.direction6 }">
      <li>
        <img src="${ctxPath }/img/6.png" alt="6" />
        ${recipeVO.direction6 }
      </li>
    </c:if>
    <c:if test="${!empty recipeVO.direction7 }">
      <li>
        <img src="${ctxPath }/img/7.png" alt="7" />
        ${recipeVO.direction7 }
      </li>
    </c:if>
    <c:if test="${!empty recipeVO.direction8 }">
      <li>
        <img src="${ctxPath }/img/8.png" alt="8" />
        ${recipeVO.direction8 }
      </li>
    </c:if>
    <c:if test="${!empty recipeVO.direction9 }">
      <li>
        <img src="${ctxPath }/img/9.png" alt="9" />
        ${recipeVO.direction9 }
      </li>
    </c:if>
      
  
    </ul>
  </div>
  <div class="review_part">
    <div>
      <span>Reviews</span>
    </div>
    <div class="reviews">
      <div class="review">
        <span>닉네임입니다</span><br />
        <span>★★★★★</span>
        <p>
          레시피에 대한 리뷰입니다. 직접 만들어 먹었다면 그에 대한 후기를 써주세요.<br />
        </p>
      </div>
      <div class="review">
        <span>닉네임입니다</span><br />
        <span>★★★★★</span>
        <p>레시피에 대한 리뷰입니다. 직접 만들어 먹었다면 그에 대한 후기를 써주세요.</p>
      </div>
      <div class="review">
        <span>닉네임입니다</span><br />
        <span>★★★★★</span>
        <p>레시피에 대한 리뷰입니다. 직접 만들어 먹었다면 그에 대한 후기를 써주세요.</p>
      </div>
      <div class="review">
        <span>닉네임입니다</span><br />
        <span>★★★★★</span>
        <p>레시피에 대한 리뷰입니다. 직접 만들어 먹었다면 그에 대한 후기를 써주세요.</p>
      </div>
    </div>
    <input type="button" name="more_reviews" value="More Reviews">
  </div>
  <div class="review_write">
    <h3>Leave your review</h3>
    <form action="#" method="post">
		<textarea name="comment" rows="5"></textarea>
      <select class="rating" name="rating">
        <option value="5">★★★★★</option>
        <option value="4">★★★★</option>
        <option value="3">★★★</option>
        <option value="2">★★</option>
        <option value="1">★</option>
      </select>
	  <div class="btns">
        <input type="submit" name="submit" value="작성완료" />
		<input type="reset" name="cancel" value="취소" />
  	 </div>
 	</form>
  </div>
</section>
<%@ include file="../_tail.jsp" %>