package kr.co.fridgeideas.serviceImpl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.co.fridgeideas.dao.MainDAO;
import kr.co.fridgeideas.service.MainService;
import kr.co.fridgeideas.vo.RecipeVO;

@Service
public class MainServiceImpl implements MainService {
	
	@Inject
	private MainDAO dao;

	@Override
	public List<RecipeVO> mainRecipeList() {
		return dao.mainRecipeList();
	}

	
}
