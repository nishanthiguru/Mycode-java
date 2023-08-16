package threading;
class Thread1 implements Runnable{

@Override
public void run() {
	System.out.println("My thread is in running state");
	
}
}
public class ThreadusingInterface {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
	}
}

