package shop.shoes.dao;


import java.util.List;


import shop.shoes.model.RollingBannerDTO;

public interface RollingBannerDAO {
	/**
	 * 테이블 전체 select
	 */
	List<RollingBannerDTO> selectAll(long versionId) throws Exception;

	
//	/**
//	 * 계정 추가
//	 * 
//	 * 
//	 */
//	int insert(AccountDTO account) throws Exception;
//	
//	
//	/**
//	 * 수정
//	 * 제목, 내용 수정
//	 */
//	int update(AccountDTO account) throws Exception;
//	
//	
//	/**
//	 * 삭제
//	 */
//	int delete(long accountId) throws Exception;
//	
//	// 로그인 확인
//	AccountDTO selectById(String loginId) throws Exception;
//	
//	/**
//	 * 아이디 찾기
//	 * */
//	String idFind(String name, String email) throws Exception;
//	
//	/**
//	 * 비밀번호 찾기
//	 * */
//	String pwdFind(String name, String loginId, String email) throws Exception;
}
