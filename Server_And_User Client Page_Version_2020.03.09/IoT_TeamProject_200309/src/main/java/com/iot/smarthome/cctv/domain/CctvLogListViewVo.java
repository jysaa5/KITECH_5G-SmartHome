package com.iot.smarthome.cctv.domain;

import java.util.List;

//CctvLogListViewVo: cctv 로그 리스트에 관련된 데이터를 표현하는 도메인 클래스
public class CctvLogListViewVo {

	//로그 리스트
	private List<CctvLogEditVo> list;

	//전체 로그 개수
	private int totalArticleCount;

	//전체 페이지의 개수
	private int totalPageCount;

	//현재 페이지
	private int currentPageNo;

	//시작 게시물의 번호
	private int startRow;

	//페이지 표현할 게시물의 개수
	private int countPerPage;

	//<생성자>//
	//totalPageCount 필드만 제외하고 전부를 받는 생성자
	public CctvLogListViewVo(List<CctvLogEditVo> list, int totalArticleCount, int currentPageNo, int startRow, int countPerPage) {
		super();
		this.list = list;
		this.totalArticleCount = totalArticleCount;
		this.currentPageNo = currentPageNo;
		this.startRow = startRow;
		this.countPerPage = countPerPage;

		makeTotalpageCount();
	}
	
	//get메서드
	//getter만 생성하였다.
	public List<CctvLogEditVo> getList() {
		return list;
	}

	public int getTotalArticleCount() {
		return totalArticleCount;
	}

	public int getTotalPageCount() {
		return totalPageCount;
	}

	public int getCurrentPageNo() {
		return currentPageNo;
	}

	public int getStartRow() {
		return startRow;
	}

	public int getCountPerPage() {
		return countPerPage;
	}

	//toString 메서드
	@Override
	public String toString() {
		
		return "CctvLogListView [list=" + list + ", totalArticleCount=" + totalArticleCount + ", totalPageCount=" + totalPageCount + ", currentPageNo=" + currentPageNo + ", startRow=" + startRow + ", countPerPage=" + countPerPage + "]";
	
	}//toString메서드 끝

	// makeTotalpageCount: 페이지의 개수를 구하는 메서드
	// 객체 생성 후 생성자 호출되는 메서드
	private void makeTotalpageCount() {

		// 페이지 개수
		int cnt = 0;

		// 페이지 개수 = 전체 게시글 개수 / 페이지 1장에 넣을 게시글의 개수
		cnt = totalArticleCount / countPerPage;

		totalPageCount = totalArticleCount % countPerPage > 0 ? ++cnt : cnt;

	}//makeTotalpageCount 메서드 끝

}//CctvLogListViewVo 클래스 끝
