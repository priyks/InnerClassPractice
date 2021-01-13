package Innerclass;

interface face{
	public void giga();
}


public class Basic_InnerClassDemo {
	private int num;
	public class Inner{ // nested inner class
	   
		public void show() { 
			num=101;
			System.out.println("I am in Inner class method ..!  "+num);
		}
	}
	
	class MyDemo{ // nested inner class
		
		public final int count=89765; // we can't make it static in inner class 
		
		protected void fun() {
			System.out.println("final int value "+count);
		}
		protected void show() {
			final int basic=98;
			System.out.println("I am in show of MyDemo  "+basic);
		}
	}
	
	void myFun() {  // MethodLocalInner class
		int a=56;
	    class MethodLocalInner {
	    	
	    	
	    	public void innerMethod() {
	    		System.out.println("MethodLocalInner"+a);
	    	}	
		}
	    MethodLocalInner y=new MethodLocalInner();
    	y.innerMethod();
	}
	
	// static nested class
	
	static class  Outer{
		
		private static void outerMethod(){
			System.out.println("static Inner class ");
		
		}
	}
	
	class Foo { 
		
		class Inner { 
			
		     /* public static void inMethod(){  
		         System.out.println("inside inner class Method"); 
		      } 
		        we can’t have static method in a nested inner class because an inner class is implicitly
			associated with an object of its outer class  */
			
			
		   void outerMethod() { 
		      System.out.println("inside outerMethod"); 
		   } 
		   
		   } 
		}
	
	
	public static greek g=new greek() {
		
		void show() { 
			super.show();
		      System.out.println("i am in show method of anonymous class greek"); 
		   } 
	};
	

	static face f=new face() { //  As implementer of the specified interface
		public void giga() {
		
			System.out.println("As implementer of face anonymous class ");
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_InnerClassDemo.Inner base=new Basic_InnerClassDemo(). new Inner();
		base.show();
		
		Basic_InnerClassDemo.MyDemo md=new Basic_InnerClassDemo().new MyDemo();
		md.fun();
		md.show();
		
		Basic_InnerClassDemo don=new Basic_InnerClassDemo();
		don.myFun();
		
		Outer.outerMethod();
		
		mau m=new mau();
		m.work();
	   
		g.show(); // if static can access
	    f.giga(); 
		
	}

}

class mau{
	int zyx;
	public void work(){
		int abc=67;
		System.out.println("inside work method....");
		class Inner{
		  
		   public void print() {
			   System.out.println("i am inside print method of Inner class trying to access its outer class's methods var"+abc);
		   }
		}
		 Inner x=new Inner();
		 x.print();
	}
}

class greek{
	
	void show() { 
	      System.out.println("i am in show method of super class greek"); 
	   } 
}

