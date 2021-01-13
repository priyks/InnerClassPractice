package Innerclass;

import java.util.Scanner;

interface Services{
	 
	 public void AddServices() ;
	 public String getServiceDetails();
	 public boolean discardService();
	 public int totalDept();
	 public void displayDept();
}

 class Dean{
	 public String dean_name;
	 public String qulification;
	 
	 public Dean(String dean_name,String qualification) {
		 this.dean_name=dean_name;
		 this.qulification=qualification;
	 }
	 
	 public void show_deanDetails() {
		 
		 System.out.println("Dean Name : "+dean_name);
		 System.out.println("Dean qualification : "+qulification);
	 }
	 
	 final void  manageUniversity() {
		 
		// code to manage University
	 }
 }
 
 class Work{
	 String task;
	 Work(String nameOfTask){
		 this.task=nameOfTask;
	 }
	 
	 public String getTaskName() {
		 
		 return task;
	 }
	 
 }

  class Department implements Services{
	public String name_Dept;
    public String headNameOfDept;
    public int noOfEmployees;
    private float dept_Fund;
    public String nameOfService;
    public int count=0;
   
    
    Department(String name_Dept,String headNameOfDept,int onOfEmployees,float dept_Fund ){
    
    this.name_Dept=name_Dept;
    this.headNameOfDept=headNameOfDept;
    this.noOfEmployees=noOfEmployees;
    this.dept_Fund=dept_Fund;
    count++;
    
    System.out.println("Department is Created Successfully...!");
    }
    @Override
    public void displayDept() {
    	
    	System.out.println("Department Name : "+name_Dept);
    	System.out.println("Head Of Department : "+headNameOfDept);
    	System.out.println("Number Of Employess Working In Department : "+noOfEmployees);
    	System.out.println("Fund Allocated To Department : "+dept_Fund);
    }
    
    @Override
    public void AddServices() {
    	
    	System.out.println("Which Type of Services you want to add in Department ...?");
    	
    	
    	Scanner sc=new Scanner(System.in);
        String  nameOfTest=sc.nextLine();
        Work w=new Work(nameOfTest);
    }
    
	@Override
    public String getServiceDetails() {
    	
    	return nameOfService;
    }

	@Override
	public boolean discardService() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int totalDept() {
		// TODO Auto-generated method stub
		return count;
	}
    
    
}

public class UniversityManagement {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		int e;
		
		Scanner scan=new Scanner(System.in);
		
		do {
		System.out.println("-------Wel-come to Pune University System-------");
		System.out.println("Press 1 to Create Academic Department : ");
		System.out.println("Press 2 to Create Sports Department : ");
		System.out.println("Press 3 to Display Department Details : ");
		System.out.println("Press 4 to Get Service Details : ");
		System.out.println("Press 5 to See total No Of Department University Has :");
		System.out.println("Press s to Exit :");
		
		
		System.out.println("Enter your choice...!");
		choice=scan.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("*******Academic Department****** ");
			System.out.println("Enter Department Head Name : ");
			String headOfDept=scan.nextLine();
			System.out.println("Enter No Of Employees are required in that Dept :");
			int noOfEmp=scan.nextInt();
			System.out.println("Enter initial fund alloted to Dept :");
			float fund=scan.nextFloat();
			Dean d1=new Dean("mr Rahul Sharma ","PhD,MS in Computer Science");
			Services academic=new Department("Academic Department ",headOfDept,noOfEmp,fund);
			academic.displayDept();
			
			academic.AddServices();
			academic.getServiceDetails();
			academic.AddServices();
			academic.getServiceDetails();
			
			
			
			/* int howmanyServices=scan.nextInt();
			
		    while(howmanyServices!=0) {
			     academic.AddServices();
			     howmanyServices--;
			}
		    */
		    
			
		    break;
		
		
			
		case 2:
			
			System.out.println("*******Sports Department******** ");
			System.out.println("Enter Department Head Name : ");
			String s_headOfDept=scan.nextLine();
			System.out.println("Enter No Of Employees are required in that Dept :");
			int s_noOfEmp=scan.nextInt();
			System.out.println("Enter initial fund alloted to Dept :");
			float s_fund=scan.nextFloat();
			Dean d2=new Dean("mrs Anjali Gayakwad ","PhD,MS in Computer Science");
			Services Sport=new Department("Sports Department ",s_headOfDept,s_noOfEmp,s_fund);
			
		    break;
		
			  
			
			
		case 3:
			
		case 4:
			
			
		case 5:
			
			
			default : System.out.println("You Entered Wrong Choice ...!");
		}
		
		
		}while(choice!='e');

	}
	

}
