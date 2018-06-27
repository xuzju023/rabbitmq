package com.xzj.finalize;


/**
 * 检验finalize调用时机
 * @author XZJ	
 *
 */
public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIN();
		new Book(true);
		System.gc();//用于强制进行终结动作
		System.out.println("---");
	}
}
