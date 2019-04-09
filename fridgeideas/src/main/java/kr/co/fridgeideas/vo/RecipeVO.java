package kr.co.fridgeideas.vo;

import org.springframework.web.multipart.MultipartFile;

public class RecipeVO {
	
	private int seq;
	private String uid;
	private String nick;
	private String cate;
	private String author_write;
	private String cooking_level;
	private String recipe_name;
	private String cooking_time;
	private int cooking_time_h;
	private int cooking_time_m;
	private String ingredients;
	private int serving;
	private String direction1;
	private String direction2;
	private String direction3;
	private String direction4;
	private String direction5;
	private String direction6;
	private String direction7;
	private String direction8;
	private String direction9;
	private int made;
	private int review;
	private int clipped;
	private int hit;
	private int rating;
	private String regip;
	private String rdate;
	private int file;
	private MultipartFile fname;
	
	private String[] ingredList;
	
	private String fileName;
	
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public String getAuthor_write() {
		return author_write;
	}
	public void setAuthor_write(String author_write) {
		this.author_write = author_write;
	}
	public String getCooking_level() {
		return cooking_level;
	}
	public void setCooking_level(String cooking_level) {
		this.cooking_level = cooking_level;
	}
	public String getRecipe_name() {
		return recipe_name;
	}
	public void setRecipe_name(String recipe_name) {
		this.recipe_name = recipe_name;
	}
	
	
	public String getCooking_time() {
		return cooking_time;
	}
	public void setCooking_time(String cooking_time) {
		this.cooking_time = cooking_time;
	}
	public int getCooking_time_h() {
		return cooking_time_h;
	}
	public void setCooking_time_h(int cooking_time_h) {
		this.cooking_time_h = cooking_time_h;
	}
	public int getCooking_time_m() {
		return cooking_time_m;
	}
	public void setCooking_time_m(int cooking_time_m) {
		this.cooking_time_m = cooking_time_m;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public int getServing() {
		return serving;
	}
	public void setServing(int serving) {
		this.serving = serving;
	}
	public String getDirection1() {
		return direction1;
	}
	public void setDirection1(String direction1) {
		this.direction1 = direction1;
	}
	public String getDirection2() {
		return direction2;
	}
	public void setDirection2(String direction2) {
		this.direction2 = direction2;
	}
	public String getDirection3() {
		return direction3;
	}
	public void setDirection3(String direction3) {
		this.direction3 = direction3;
	}
	public String getDirection4() {
		return direction4;
	}
	public void setDirection4(String direction4) {
		this.direction4 = direction4;
	}
	public String getDirection5() {
		return direction5;
	}
	public void setDirection5(String direction5) {
		this.direction5 = direction5;
	}
	public String getDirection6() {
		return direction6;
	}
	public void setDirection6(String direction6) {
		this.direction6 = direction6;
	}
	public String getDirection7() {
		return direction7;
	}
	public void setDirection7(String direction7) {
		this.direction7 = direction7;
	}
	public String getDirection8() {
		return direction8;
	}
	public void setDirection8(String direction8) {
		this.direction8 = direction8;
	}
	public String getDirection9() {
		return direction9;
	}
	public void setDirection9(String direction9) {
		this.direction9 = direction9;
	}
	public int getMade() {
		return made;
	}
	public void setMade(int made) {
		this.made = made;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public int getClipped() {
		return clipped;
	}
	public void setClipped(int clipped) {
		this.clipped = clipped;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getRegip() {
		return regip;
	}
	public void setRegip(String regip) {
		this.regip = regip;
	}
	public String getRdate() {
		return rdate;
	}
	public void setRdate(String rdate) {
		this.rdate = rdate;
	}
	public int getFile() {
		return file;
	}
	public void setFile(int file) {
		this.file = file;
	}
	
	
	
	
	public MultipartFile getFname() {
		return fname;
	}
	public void setFname(MultipartFile fname) {
		this.fname = fname;
	}
	
	
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	
	public String[] getIngredList() {
		return ingredList;
	}
	public void setIngredList(String[] ingredList) {
		this.ingredList = ingredList;
	}

}
