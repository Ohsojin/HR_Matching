package com.hmis.service;

import java.util.List;

import com.hmis.domain.PostingVO;
import com.hmis.domain.SearchCriteria;
import com.hmis.dto.RecommandDTO;

/**
 * @author beomsoo
 */
public interface PostingService {
	
	// 1) 관리자 : 채용공고 등록
	public void registerPosting(PostingVO postingVO);
	
	// 2) 관리자 : 채용공고 상세보기
	public PostingVO readPosting(int postingId);
	
	// 3) 관리자 : 채용공고 수정
	public void modifyPosting(PostingVO postingVO);

	// 4) 관리자 : 채용공고 삭제
	public void removePosting(int postingId);
	
	// 5) 관리자 : 검색 가능한 채용공고 목록 페이징 처리
	public List<PostingVO> listSearchCriteria(SearchCriteria cri);

	// 6) 관리자 : 검색 가능한 채용공고 목록 페이징 처리
	public int listCountSearchCriteria(SearchCriteria cri);
	
	// 7) 관리자 : 인재 추천
	public List<RecommandDTO> recommandStudent(RecommandDTO recommandDTO);
	
	// 8) 학생 : 채용공고 추천
	public List<RecommandDTO> recommandPosting(RecommandDTO recommandDTO);

}
