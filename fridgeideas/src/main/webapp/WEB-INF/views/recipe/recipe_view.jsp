<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_head.jsp" %>
<section id="sub">
  <div class="banner" id="recipe_banner"><span>Recipe</span></div>
  <nav>
    <img src="${ctxPath }/img/tag.png" alt="tag" />
    <span>Home > Recipe >  <strong>Beginner</strong></span>
  </nav>
  <div class="recipe_intro">
    <div class="recipe_info">
      <p>
        <span>음식이름</span><br />
        <span>★★★★★</span><br />
        <span>23 made it | 14 reviews | 12 clipped </span><br />
        <span>Recipe by : 닉네임</span>
      </p>
      <p>
        음식 설명입니다. 이 레시피에 관련된 간단한 일화나 설명을 소개해주세요
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
      <li><img src="${ctxPath }/img/cooking_time.png" alt="요리시간"><span>40 m</span></li>
      <li><img src="${ctxPath }/img/serving.png" alt="몇인분"><span>6 servings</span></li>
      </ul>
    </div>
      <div>
        <ul>
          <li><img src="${ctxPath }/img/mark.png" alt="mark" /><span>2 packages Oriental flavored ramen noodles</span></li>
          <li><img src="${ctxPath }/img/mark.png" alt="mark" /><span>3eggs, beaten</span></li>
          <li><img src="${ctxPath }/img/mark.png" alt="mark" /><span>vegetable oil</span></li>
          <li><img src="${ctxPath }/img/mark.png" alt="mark" /><span>4 green onions, thinly sliced</span></li>
          <li><img src="${ctxPath }/img/mark.png" alt="mark" /><span>1 small carrot, peeled and grated</span></li>
          <li><img src="${ctxPath }/img/mark.png" alt="mark" /><span>1/2 cup green peas</span></li>
          <li><img src="${ctxPath }/img/mark.png" alt="mark" /><span>1/4 cup red bell pepper minced</span></li>
        </ul>
    </div>
  </div>
  <div class="direction">
    <div>
      <span>Direction</span>
    </div>
    <ul>
      <li>
        <img src="${ctxPath }/img/1.png" alt="1" />
        Boil ramen noodles for 3 minutes, or until softened, without flavor packets. Reserve flavor packets. Drain noodles, and set aside.
      </li>
      <li>
        <img src="${ctxPath }/img/2.png" alt="2" />
        Heat 1 tablespoon oil in a small skillet. Scramble eggs in a bowl. Cook and stir in hot oil until firm. Set aside.
      </li>
      <li>
        <img src="${ctxPath }/img/3.png" alt="3" />
        In a separate skillet, heat 1 teaspoon of oil over medium heat. Cook and stir green onions in oil for 2 to 3 minutes, or until softened. Transfer to a separate dish, and set aside. Heat another teaspoon of cooking oil in the same skillet. Cook and stir the the carrots, peas, and bell peppers separately in the same manner, setting each aside when done.
      </li>
      <li><img src="${ctxPath }/img/4.png" alt="4" /><span></span></li>
      <li><img src="${ctxPath }/img/5.png" alt="5" /><span></span></li>
      <li><img src="${ctxPath }/img/6.png" alt="6" /><span></span></li>
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