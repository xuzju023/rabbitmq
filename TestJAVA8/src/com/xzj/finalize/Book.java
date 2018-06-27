package com.xzj.finalize;

class Book {
	boolean checkedOUt = false;
	public  Book(boolean checkedOUt) {
		 this.checkedOUt=checkedOUt;
	}
	void checkIN() {
		checkedOUt = false;
	}
	@Override
	protected void finalize() throws Throwable {
		if(this.checkedOUt) {
			System.out.println("ERROR:checked out");
		}
	}
}
