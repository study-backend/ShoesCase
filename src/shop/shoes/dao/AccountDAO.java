package shop.shoes.dao;

import java.sql.SQLException;
import java.util.List;

import shop.shoes.common.GlobalException;
import shop.shoes.model.AccountDTO;

public interface AccountDAO {
	/**
	 * 테이블 전체 select
	 * 보여줄 속성(테이블의 필드)
	 * 번호(id)
	 */
	List<AccountDTO> selectAll() throws Exception;
	
	/**
	 * 계정 추가
	 * 
	 * 
	 */
	int insert(AccountDTO account) throws Exception;
	
	
	/**
	 * 수정
	 * 제목, 내용 수정
	 */
	int update(AccountDTO account) throws Exception;
	
	
	/**
	 * 삭제
	 */
	int delete(long accountId) throws Exception;
	
	// 로그인 확인
	AccountDTO selectById(String loginId) throws Exception;
	
	/**
	 * 아이디 찾기
	 * */
	String idFind(String name, String email) throws Exception;
	
	/**
	 * 비밀번호 찾기
	 * */
	String pwdFind(String name, String loginId, String email) throws Exception;

	/**
	 * 아이디 중복체크
	 */
	public boolean idDuplicate(String id) throws GlobalException, SQLException;
}
