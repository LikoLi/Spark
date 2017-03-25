package org.likui.study.spark.pre;

import org.junit.Test;

public class Lambda {
	@Test
	public void runThread() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Run!");
			}
		}).start();;
	}
	
	@Test
	public void runThreadUseLambda() {
		new Thread(() -> {
			System.out.println("Run!");
		}).start();
	}
	
}
