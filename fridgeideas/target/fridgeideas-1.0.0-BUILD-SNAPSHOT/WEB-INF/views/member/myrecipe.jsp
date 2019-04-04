<%@ include file="../_head.jsp" %>
<section id="sub">
  <div class="banner" id="upload_recipe_banner"><span>Share Your Recipe</span></div>
  <nav>
    <img src="../img/tag.png" alt="tag" />
    <span>Home > <strong>Share Your Recipe</strong></span>
  </nav>
  <section class="recipe_upload">
    <div>Share Your Recipe</div>
    <div class="form_data">
      <form class="recipe_form" action="${ctxPath }/member/myrecipe" method="post" enctype="multipart/form-data">
      <input type="hidden" name="uid" value="${memberVO.uid}" />
      <input type="hidden" name="nick" value="${memberVO.nick }" />
        <div>
          <span>Recipe's Name*:</span>
          <input type="text" name="recipe_name" required />
        </div>
        <div>
          <span>Recipe' Story*:</span>
          <textarea name="author_write" rows="4" cols="80" required></textarea>
        </div>
        <div>
          <span>Cooking Level*:</span>
          <select class="cooking_level" name="cooking_level">
            <option value="Beginner">Beginner</option>
            <option value="Intermediate">Intermediate</option>
            <option value="Advanced">Advanced</option>
          </select>
        </div>
        <div>
          <span>Recipe's Category*:</span>
          <select class="cate" name="cate">
            <option value="Breakfast&Brunch">Breakfast&Brunch</option>
            <option value="Dinner">Dinner</option>
            <option value="Holiday">Holiday</option>
            <option value="Vegan">Vegan</option>
            <option value="Dessert">Dessert</option>
          </select>
        </div>
        <div>
          <span>Recipe's Ingredients*:</span>
          <textarea name="ingredients" rows="4" cols="80" required></textarea>
        </div>
        <div>
          <span>Recipe's CookingTime*:</span>
          <select class="cooking_time_h" name="cooking_time_h">
            <option value="0">0</option>
            <option value="1">1</option>
            <option value="2">2</option>
            <option value="3">3</option>
            <option value="4">4</option>
            <option value="5">5</option>
          </select>
          <span>hours</span>
          <select class="cooking_time_m" name="cooking_time_m">
            <option value="0">0</option>
            <option value="10">10</option>
            <option value="20">20</option>
            <option value="30">30</option>
            <option value="40">40</option>
            <option value="50">50</option>
          </select>
          <span>minutes</span>
        </div>
        <div>
          <span>Recipe's Plates*:</span>
          <input type="text" name="serving" required />
        </div>
        <div>
          <span>Recipe's Direction1*:</span>
          <textarea name="direction1" rows="4" cols="80" required></textarea>
        </div>
        <div>
          <span>Recipe's Direction2*:</span>
          <textarea name="direction2" rows="4" cols="80"></textarea>
        </div>
        <div>
          <span>Recipe's Direction3*:</span>
          <textarea name="direction3" rows="4" cols="80"></textarea>
        </div>
        <div>
          <span>Recipe's Direction4*:</span>
          <textarea name="direction4" rows="4" cols="80"></textarea>
        </div>
        <div>
          <span>Recipe's Direction5*:</span>
          <textarea name="direction5" rows="4" cols="80"></textarea>
        </div>
        <div>
          <span>Recipe's Direction6*:</span>
          <textarea name="direction6" rows="4" cols="80"></textarea>
        </div>
        <div>
          <span>Recipe's Direction7*:</span>
          <textarea name="direction7" rows="4" cols="80"></textarea>
        </div>
        <div>
          <span>Recipe's Direction8*:</span>
          <textarea name="direction8" rows="4" cols="80"></textarea>
        </div>
        <div>
          <span>Recipe's Direction9*:</span>
          <textarea name="direction9" rows="4" cols="80"></textarea>
        </div>
        <div>
          <span>Image File*:</span>
          <input type="file" name="fname" />
          <input type="file" name="fname" />
          <input type="file" name="fname" />
          <input type="file" name="fname" />
          <input type="file" name="fname" />
        </div>
        <input type="submit" name="submit" value="Thank you!" />
      </form>
    </div>
  </section>
</section>
 <%@ include file="../_tail.jsp" %>