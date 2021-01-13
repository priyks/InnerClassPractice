package Innerclass;

//Anonymous inner class that that defined inside constructor/method
public class AnonymousInnerInsideConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("child Thread is.... running!");
			}
			
		});
		
		t.start();
		System.out.println("main Thread is..... running!");

	}

}
