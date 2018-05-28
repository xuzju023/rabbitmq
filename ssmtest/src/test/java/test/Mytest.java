package test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xzj.domain.FwAlertingFormInst;
import com.xzj.domain.Student;
import com.xzj.mapper.FwAlertingFormInstMapper;
import com.xzj.page.PageSet;
import com.xzj.service.impl.FwAlertingFormInstServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class) // ��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class Mytest {
	@Autowired
	private FwAlertingFormInstServiceImpl service;
	@Autowired
	private FwAlertingFormInstMapper mapper;

	@Test
	public void test1() throws Exception {
		FwAlertingFormInst inst = new FwAlertingFormInst();
		PageSet<FwAlertingFormInst> pageSet = service.find(inst, 0, 10);
		List<FwAlertingFormInst> list = pageSet.getPageData();
		for (FwAlertingFormInst fwAlertingFormInst : list) {
			System.out.println(fwAlertingFormInst.getDeptName()+"----申请人："+fwAlertingFormInst.getApplicantName());
			System.out.println("---");
		}
	}
	@Test
	public void test2() throws Exception {
		List<String> list = service.getJsonValue("{\"time\":\"2018-5-24\",\"money\":\"300\"}");
		System.out.println(list);
	}
	
	@Test
	public void test6() throws Exception {
		HashSet<Student> set = new HashSet<>();
		Student student1 = new Student(3);
		Student student2 = new Student(3);
		set.add(student1);
		set.add(student2);
		System.out.println(set);
	}
}
