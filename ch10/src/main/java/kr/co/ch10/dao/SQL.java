package kr.co.ch10.dao;

public class SQL {
	
	public static final String INSERT_USER = "INSERT INTO `USER` SET uid=?, name=?, hp=?, addr=?, pos=?, dep=?, rdate=NOW()";
	public static final String SELECT_USER_LIST = "SELECT * FROM `USER`";
}