package kr.co.fridgeideas.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.fridgeideas.dao.RecipeDAO;
import kr.co.fridgeideas.service.RecipeService;
import kr.co.fridgeideas.vo.ImageVO;
import kr.co.fridgeideas.vo.RecipeVO;

@Service
public class RecipeServiceImpl implements RecipeService {
	
	@Inject
	private RecipeDAO dao;

	@Override
	public RecipeVO view(int seq) {
		return dao.view(seq);
	}

	@Override
	public List<ImageVO> recipeImageList(int seq) {
		return dao.recipeImageList(seq);
	}

	@Override
	public List<RecipeVO> recipeSearch(String[] ingredList) {
		return dao.recipeSearch(ingredList);
	}
	

}
