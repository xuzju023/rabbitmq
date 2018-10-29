package test;

import static org.junit.Assert.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xzj.domain.FwAFIUser;
import com.xzj.domain.WfRoleUser;
import com.xzj.mapper.FwAFIUserMapper;
import com.xzj.service.FwAFIUserService;
import com.xzj.service.WfRoleUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class AFIUserTest {
	@Resource
	private FwAFIUserMapper mapper;
	@Autowired
	private FwAFIUserService service;
	@Resource
	private WfRoleUserService wfRoleUserService;// 流程角色人员service

	@Test
	public void test1() throws Exception {
		FwAFIUser afiUser = new FwAFIUser();
	//	mapper.insert(afiUser);
		System.out.println(afiUser.getId());
	}

	@Test
	public void test2() throws Exception {
		FwAFIUser afiUser = new FwAFIUser(521l, 111l, "email", "true");
		long time = new Date().getTime();
		Timestamp timestamp = new Timestamp(time);
		afiUser.setCreationDate(timestamp);
		long l = service.insert(afiUser);
		System.out.println(l);
	}

	@Test
	public void tes6() throws Exception {
		long time1 = System.currentTimeMillis();
		long time2 = new Date().getTime();
		System.out.println(time1 == time2);
	}
	
	@Test
	public void test4() throws Exception {
		List<WfRoleUser> list = wfRoleUserService.getWfRoleUserByRoleId(1);
		for (WfRoleUser wfRoleUser : list) {
			System.out.println(wfRoleUser.getUserId());
		}
	}
	@Test
	public void test6() throws Exception {
		List<FwAFIUser> list = mapper.queryByafiId(521l);
		System.out.println(list);
	}
	@Test
	public void test7() throws Exception {
		FwAFIUser fwAFIUser = mapper.getbyUserAndAFI(1727l, 521l);
		System.out.println(fwAFIUser);
	}
}
