package Innerclass;

//Anonymous Inner class that implements an interface
public class Anonymous_Interface_Imp {

	public static void main(String[] args) {
		
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
			
				System.out.println("Child Thread running....");
				
			}
			
		};
     Thread t=new Thread(r);
     t.start();
     System.out.println("main thread running.....");
	}

}
