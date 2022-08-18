package com.iu.start.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.start.bankbook.BankBookDAO";
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"setDelete", bankBookDTO);
	}
	

	public int setUpdate(BankBookDTO banBookDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setUpdate", banBookDTO);
	}
	
	
	public List<BankBookDTO> getList() throws Exception {
		return sqlSession.selectList(NAMESPACE+"getList");
	}
	
	
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"getDetail", bankBookDTO);
	}
	
	
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"setBankBook", bankBookDTO);
	}
	
	
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"setChangeSale", bankBookDTO);
	}

}
