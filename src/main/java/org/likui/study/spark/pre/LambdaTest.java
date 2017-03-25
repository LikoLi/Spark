package org.likui.study.spark.pre;

import java.util.Arrays;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class LambdaTest {
	public static void main(String[] args) throws InterruptedException {
		String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "saturn", "Uranus",
				"Neptune" };

		System.out.println(Arrays.toString(planets));

		System.out.println("Sorted in dectionary order:");
		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));

		System.out.println("Sorted by length:");
		Arrays.sort(planets, (first, second) -> first.length() - second.length());
		System.out.println(Arrays.toString(planets));

//		javax.swing.Timer t = new javax.swing.Timer(1000, event -> System.out.println("The time is " + new Date()));
//		t.start();
		new Thread(() -> {
			System.out.println("Thread init.");
			Timer t1 = new Timer(5000, event -> {
				System.out.println(1);
				int showConfirmDialog = JOptionPane.showConfirmDialog(null, "Quit program?");
				System.out.println(showConfirmDialog);
//				if (showConfirmDialog == 1) {
//					System.exit(0);
//				}
			});
			t1.start();
		}).start();
		Thread.sleep(10000);
	}
}
