package com.xzj;

import static org.junit.Assert.*;

import org.junit.Test;

public class SSSS {
	@Test
	public void test1() throws Exception {
		System.out.println(6 % 3);
	}

	@Test
	public void test2() throws Exception {
		int[] a= {1,2,3};
		params(1,2,3);
		params(a);//可以直接传入数组
	}
	
	@Test
	public void test3() throws Exception {
		sup();
		//exception();
	}
	
	void params(int... a) {
	}
	
	void sup() {
		try {
			exception();
		} catch (Exception e) {
			System.out.println("ok");
		}
	}
	
	void exception() {
		/*try {
			System.out.println(1/0);
		} catch (Exception e) {
			System.out.println("---");
		}*/
		System.out.println(1/0);
	}
	public static void main(String[] args) {
		System.out.println(args.length);
	}
}
