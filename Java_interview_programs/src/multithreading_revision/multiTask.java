package multithreading_revision;

public class multiTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Runnable r = () -> {
			
			for (int i = 0; i < 50; i++)
				System.out.println("Hello " + i);
		};
		Thread t = new Thread(r);
		t.start();

		Thread t1 = new Thread(r);
		t1.start();
		t.join();
		t1.join(5000);

		for (int i = 0; i < 10; i++) {
			System.out.println("Hi " + i);
		}
	}

}
