package org.zerock.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MemberDAOTest {
	@Inject
	private MemberDAO dao;
	
	/*@Test
	public void testTime() throws Exception {
		System.out.println(dao.getTime());
	}
	
	@Test
	public void testInsertMember() throws Exception {
		MemberVO vo = new MemberVO();
		vo.setUserid("user05");
		vo.setUserpw("user05");
		vo.setUsername("USER05");
		vo.setEmail("user05@aaa.com");
		
		dao.insertMember(vo);
	}
	
	@Test
	public void testReadMember() throws Exception {
		MemberVO read = dao.readMember("user01");
		System.out.println("id = " + read.getUserid());
		System.out.println(read.getUserpw());
		System.out.println(read.getEmail());
	}*/
	
	@Test 
	public void testReadWithPw() throws Exception {
		MemberVO read = dao.readWithPW("user00", "user00");
		System.out.println(read.getUserid());
		System.out.println(read.getUserpw());
		System.out.println(read.getEmail());
		
		read = dao.readWithPW("user01", "user00");
		System.out.println(read.getUserid());
		System.out.println(read.getUserpw());
		System.out.println(read.getEmail());
	}
}
