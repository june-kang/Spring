package kr.co.fridgeideas.controller;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.fridgeideas.service.RecipeService;
import kr.co.fridgeideas.vo.ReviewVO;
import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.MemberVO;
import kr.co.fridgeideas.vo.RecipeVO;

@Controller
public class RecipeController {
	
	@Inject
	private RecipeService service;
	
	@RequestMapping(value="/search")
	public String search(Model model, RecipeVO recipeVO) {
		String ingredients = recipeVO.getIngredients();
		
		if(ingredients!=null) {
			recipeVO.setIngredList(ingredients.split("\\s+")); // 한칸 이상의 공백 잘라서 배열로 저장
			List<RecipeVO> list = service.recipeSearch(recipeVO);
			for(RecipeVO vo : list) {
				System.out.println(vo.getRecipe_name());
			}
			model.addAttribute("list", list);
			return "/search/search";
		} else {
			return "/search/search";
		}
		
	}
	
	@RequestMapping(value="/recipe")
	public String recipeList(Model model, String cate) {
		
		List<RecipeVO> list = new ArrayList<RecipeVO>();
		
		if(cate.equals("Recipe of the Month")) {
			list = service.cateBestRecipe(cate);
		} else {
			list = service.cateRecipeList(cate);
		}

		model.addAttribute("list", list);
		model.addAttribute("cate", cate);
		return "/recipe/recipe_list";
	}
	
	@RequestMapping(value="/recipe/recipe_view")
	public String recipeView(Model model, HttpSession sess, int seq) {
		
		MemberVO memberVO = (MemberVO) sess.getAttribute("memberVO");
		
		if(memberVO == null) {
			return "redirect:/index?loginStatus=no";
		} else {
			String uid = memberVO.getUid();
			
			RecipeVO recipeVO = service.view(seq);
			List<ImageVO> imageList = service.recipeImageList(seq);
			
			if(recipeVO.getUid() != uid) {
				service.updateRecipeHit(seq);
			}
			
			String source = recipeVO.getIngredients();
			String[] ingredList = source.split(",");
					
			model.addAttribute("recipeVO", recipeVO);
			model.addAttribute("imageList", imageList);
			model.addAttribute("ingredList", ingredList);
			
			return "/recipe/recipe_view";
		}
		
	}
	
	@RequestMapping(value="/recipe/reviewWrite")
	public String reviewWrite(HttpSession sess, HttpServletRequest req, ReviewVO rvo) {
		MemberVO memberVO = (MemberVO) sess.getAttribute("memberVO");
		
		rvo.setUid(memberVO.getUid());
		rvo.setNick(memberVO.getNick());
		rvo.setRegip(req.getRemoteAddr());
		
		int seq = service.reviewWrite(rvo);
		
		RecipeVO recipeVO = new RecipeVO();
		recipeVO.setSeq(seq);
		recipeVO.setRating(rvo.getRating());
		service.updateRatingReviewCount(recipeVO); // 별점 수정
		return "redirect:/recipe/recipe_view?seq="+seq;
	}
}
