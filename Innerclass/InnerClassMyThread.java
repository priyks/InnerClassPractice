package Innerclass;


//Using Anonymous Inner class that extends a Class 

public class InnerClassMyThread {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread() {
			public void run() {
				
				System.out.println("Child Thread");
			}
			
		};
		t.start();
		System.out.println("Main Thread"); 

	}

}
