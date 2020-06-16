package com.javaex.author01;

import java.util.List;

public class AuthorApp {

	public static void main(String[] args) {
		
		AuthorDao authorDao = new AuthorDao();
		
		//authorDao.authorInsert("이문열", "경북 영양");
		//authorDao.authorInsert("박경리", "경상남도 통영");
		
		//리스트 가져오기
		List<AuthorVo> authorList =  authorDao.getAuthorList();
		System.out.println(authorList.get(1).getAuthorDesc()); //경상남도 통영
		
		//출력
		System.out.println("====================================");
		for(AuthorVo vo : authorList) {
			System.out.println(vo.getAuthorId() + ", " + vo.getAuthorName() + ", " +vo.getAuthorDesc());
		}
		System.out.println("====================================");

	}

}
