// 0) 패키지 및 라이브러리 임포트
package com.hmis.dto;

// 1) class 선언
public class RecommandDTO {
	
	// 2) 변수 선언
		// 관리자 : 인재 추천
			// UserVO
			private int userNo;
			private String userName;
			// CarrierVO
			private String carName;
			// PortfolioVO
			private String phone;
			// UserPostingVO
			private float recommand;
			
		//  학생 : 채용공고 추천
			// PostingVO
			private int postingId;
			private String companyName;
			private String companySize;
			private String jobName;
			private String link;
			
			// 3) getter and setter 생성
			public int getUserNo() {
				return userNo;
			}
			public void setUserNo(int userNo) {
				this.userNo = userNo;
			}
			public String getUserName() {
				return userName;
			}
			public void setUserName(String userName) {
				this.userName = userName;
			}
			public String getCarName() {
				return carName;
			}
			public void setCarName(String carName) {
				this.carName = carName;
			}
			public String getPhone() {
				return phone;
			}
			public void setPhone(String phone) {
				this.phone = phone;
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
			public String getCompanyName() {
				return companyName;
			}
			public void setCompanyName(String companyName) {
				this.companyName = companyName;
			}
			public String getCompanySize() {
				return companySize;
			}
			public void setCompanySize(String companySize) {
				this.companySize = companySize;
			}
			public String getJobName() {
				return jobName;
			}
			public void setJobName(String jobName) {
				this.jobName = jobName;
			}
			public String getLink() {
				return link;
			}
			public void setLink(String link) {
				this.link = link;
			}
			
			// 4) toString() 재정의
			@Override
			public String toString() {
				return "RecommandDTO [userNo=" + userNo + ", userName=" + userName + ", carName=" + carName + ", phone="
						+ phone + ", recommand=" + recommand + ", postingId=" + postingId + ", companyName="
						+ companyName + ", companySize=" + companySize + ", jobName=" + jobName + ", link=" + link
						+ "]";
			}
	
}
