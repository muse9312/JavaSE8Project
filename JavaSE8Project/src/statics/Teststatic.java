package statics;

import counter.Counter;

public class Teststatic {

	public static void main(String[] args) {
		Counter counter = new Counter();
		System.out.println("�ν��Ͻ� ����" + counter.getInstanceVar());

		counter = null;
		System.out.println("Ŭ���� ����" + counter.getClassVar());

		Counter counter2 = new Counter();
		System.out.println("�ν��Ͻ� ����" + counter2.getInstanceVar());

		
		System.out.println("Ŭ���� ����" + counter2.getClassVar());

	}

}
