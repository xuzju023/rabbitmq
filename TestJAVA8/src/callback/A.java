package callback;

public class A implements CallBack {
	B b = new B();

	@Override
	public void slove() {
		System.out.println("the problem is solve!");
	}

	/*
	 * �Ǽǻص�����
	 */
	public void askQuestion() {
		System.out.println("ask b solve the problem!");
		/*
		 * �Լ�ȥ��������
		 */
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("A want to do another thing!");
			}
		}).start();
		/*
		 * ask b to solve this problem
		 */
		this.b.call(this);
	}

	/*
	 * test
	 */
	public static void main(String[] args) {
		A a = new A();
		a.askQuestion();
	}
}
class C implements CallBack{

	@Override
	public void slove() {
		System.out.println("------------");
	}
	
}
class B {
	/*
	 * �ص�����
	 */
	public void call(CallBack a) {
		/*
		 * b help a solve the priblem
		 */
		System.out.println("b help a solve the problem!");
		/*
		 * call back
		 */
		a.slove();

	}
}
