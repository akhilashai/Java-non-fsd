package com.cg.lambda.anonymousclass;

public class Anonymous {

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("child class using anonymous class");
			}

		});
		t.start();
		// we can simply do the above one by using lambda expression

		Thread t1 = new Thread(() -> {
			for (int i = 0; i <= 9; i++) {
				System.out.println("child class using lambda expression");
			}

		});
		t1.start();

	}

}
