package com.xzj.finalize;


/**
 * ����finalize����ʱ��
 * @author XZJ	
 *
 */
public class TerminationCondition {
	public static void main(String[] args) {
		Book novel = new Book(true);
		novel.checkIN();
		new Book(true);
		System.gc();//����ǿ�ƽ����սᶯ��
		System.out.println("---");
	}
}
