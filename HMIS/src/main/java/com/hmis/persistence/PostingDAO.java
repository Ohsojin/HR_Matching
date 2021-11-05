// 0) 패키지 및 라이브러리 임포트
package com.hmis.persistence;

import java.util.List;

import com.hmis.domain.PostingVO;
import com.hmis.domain.SearchCriteria;
import com.hmis.dto.RecommandDTO;


/**
 * 
 * @author beomsoo
 *
 */
//1) interface 선언
public interface PostingDAO {
	
	// 1) 관리자 : 채용공고 등록
	public void insertPosting(PostingVO postingVO);
	
	// 2) 관리자 : 채용공고 상세보기
	public PostingVO readPosting(int postingId);
	
	// 3) 관리자 : 채용공고 수정
	public void updatePosting(PostingVO postingVO);

	// 4) 관리자 : 채용공고 삭제
	public void deletePosting(int postingId);
	
	// 5) 관리자 : 검색 가능한 채용공고 목록 페이징 처리
	public List<PostingVO> listSearchCriteria(SearchCriteria cri);

	// 6) 관리자 : 검색 가능한 채용공고 목록 페이징 처리
	public int listCountSearchCriteria(SearchCriteria cri);
	
	// 7) 관리자 : 인재 추천
	public List<RecommandDTO> recommandStudent(RecommandDTO recommandDTO);
	
	// 8) 학생 : 채용공고 추천
	public List<RecommandDTO> recommandPosting(RecommandDTO recommandDTO);
}
