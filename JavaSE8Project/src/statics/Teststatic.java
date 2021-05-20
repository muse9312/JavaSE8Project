package statics;

import counter.Counter;

public class Teststatic {

	public static void main(String[] args) {
		Counter counter = new Counter();
		System.out.println("인스턴스 변수" + counter.getInstanceVar());

		counter = null;
		System.out.println("클래스 변수" + counter.getClassVar());

		Counter counter2 = new Counter();
		System.out.println("인스턴스 변수" + counter2.getInstanceVar());

		
		System.out.println("클래스 변수" + counter2.getClassVar());

	}

}
