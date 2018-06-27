package com.xzj.something;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class FinalTest {

	@Test
	public void test1() throws Exception {
		String[] a = { "name1", "name2" };
		valid(a);
		System.out.println(a[0]);
	}

	@Test
	public void test2() throws Exception {
		StringBuilder a = new StringBuilder("xx");
		valid2(a);
		System.out.println(a);
	}

	@Test
	public void test4() throws Exception {
		Student student = new Student();
		student.setName("xzj");
		verify(student);
		System.out.println(student.getName());
	}

	@Test
	public void test5() throws Exception {
		HashSet<Object> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(1);
		hashSet.add(1);
		System.out.println(hashSet);
	}

	@Test
	public void test6() throws Exception {
		String rule = "{EXP_LEVEL}NOT IN[总裁]";
		String value = StringUtils.substring(rule, StringUtils.lastIndexOf(rule, "[") + 1,
				StringUtils.lastIndexOf(rule, "]"));

		System.out.println(value);
	}

	private void valid(final String[] a) {
		// a=new String[]{"2","3"};
		a[0] = "43534";
	}

	private void valid2(StringBuilder a) {
		a.append("ss");
	}

	private void verify(Student st) {
		st.setName("laowang");

	}

	class Student {
		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

	}

	@Test
	public void dsfds() throws Exception {
		Set<String> set = new TreeSet<>();
		set.add("xdsf1");
		set.add("xdsf2");
		set.add("xdsf3");
		set.add("xdsf4");
		set.add("xdsf5");
		System.out.println(set);
	}

	@Test
	public void dsffdsfds() throws Exception {
		ArrayList<String> list = new ArrayList<>();
		list.add("sf");
		list.add("dsfds");
		list.add("dsfslkdl");
		System.out.println(list);
	}

	private Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		// 2.获取连接
		Connection connection = DriverManager.getConnection("jdbc:mysql:///test", "root", "123456");

		return connection;
	}

	@Test
	public void testJDBC() throws Exception {
		Connection connection = getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM processID;");
		if (resultSet.next()) {
			String string = resultSet.getString("hash_code");
			System.out.println(string);
		}
		connection.close();
	}

}
