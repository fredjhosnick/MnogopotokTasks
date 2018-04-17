package lesson6InheritanceTasks;

import java.math.BigInteger;

public class Factorial100 implements Runnable {

	private int threadNumber = 0;

	public Factorial100(int threadNumber) {
		super();
		this.threadNumber = threadNumber;
	}

	public BigInteger factorialCalculate(int number) {

		BigInteger factorial = new BigInteger("1");

		for (int i = 1; i <= number; i++) {

			factorial = factorial.multiply(new BigInteger("" + i));
		}
		return factorial;

	}

	@Override
	public void run() {
		Thread thisThread = Thread.currentThread();

		System.out.println(thisThread.getName() + " " + this.threadNumber + "!=" + factorialCalculate(threadNumber));

	}

}
