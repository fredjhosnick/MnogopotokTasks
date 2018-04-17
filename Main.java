package lesson6InheritanceTasks;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		Thread[] threadarray = new Thread[n];

		for (int i = 0; i < n; i++) {

			threadarray[i] = new Thread(new Factorial100(i));

			threadarray[i].start();

		}

	}

}
