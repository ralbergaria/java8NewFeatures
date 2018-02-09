package org.java8.exemples.Java8NewFeatures;

import org.java8.exemples.Java8NewFeatures.util.Validator;

/**
 * HelloFunctionalInterface
 * @author rafael.carmo
 *
 */
public class HelloFunctionalInterface {
	public static void main(String[] args) {
		//		Runnable r = new Runnable(){
		//			public void run(){
		//				for (int i = 0; i <= 1000; i++) {
		//					System.out.println(i);
		//				}
		//			}
		//		};
		//		new Thread(r).start();

		//We create a functional interface with Runnable interface and lambda expression
		new Thread(() -> {
			for (int i = 0; i <= 1000; i++) {
				System.out.println(i);
			}
		}).start();
		
		//You could use your own functional interface
		Validator<String> validatorZipCode = valor -> { return valor.matches("[0-9]{5}-[0-9]{3}"); 	};
		validatorZipCode.validator("31330-372");

	}
}
