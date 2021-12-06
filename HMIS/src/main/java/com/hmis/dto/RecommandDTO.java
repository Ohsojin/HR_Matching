// 0) 패키지 및 라이브러리 임포트
package com.hmis.dto;

// 1) class 선언
public class RecommandDTO {

	// 2) 변수 선언
	// 관리자 : 인재 추천
	// UserVO
	private int userNo;
	private float recommand;
	// 학생 : 채용공고 추천
	// PostingVO
	private int postingId;

	// 추천 후 결과 기본 0-추천, 1-면접, 2-채용
	private int seldding;

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public float getRecommand() {
		return recommand;
	}

	public void setRecommand(float recommand) {
		this.recommand = recommand;
	}

	public int getPostingId() {
		return postingId;
	}

	public void setPostingId(int postingId) {
		this.postingId = postingId;
	}

	public int getSeldding() {
		return seldding;
	}

	public void setSeldding(int seldding) {
		this.seldding = seldding;
	}

	@Override
	public String toString() {
		return "RecommandDTO [userNo=" + userNo + ", recommand=" + recommand + ", postingId=" + postingId
				+ ", seldding=" + seldding + "]";
	}

}
