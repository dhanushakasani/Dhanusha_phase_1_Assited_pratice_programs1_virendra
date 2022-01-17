package assignmentsjava;

public class InnerClassAssisted1 {
private int data=30;  
	
	void display(){
		System.out.println("i am inside the outer class method");
	}
	 
	class Inner{  		
	 private int data=20;
	  
	  void msg()
	  {
		  InnerClassAssisted1.this.display();
		  System.out.println("data is "+data);
	  }  
	  
	  // calling the duplicate method of the outer class
	  void display(){
		  System.out.println("i am inside the inner class method");
	  }// inner class accessing the outside private variable
	  class Inner_2{
		  
		  void Inner()
		  {
			  InnerClassAssisted1.this.display();
			  System.out.println("data is "+data);
		  }
		  void Inner2()
		  {
			  System.out.println("2nd Inner class");
		  }
		  
	  }
	 }  
	
	public static void main(String args[]){  
	  
	  InnerClassAssisted1 obj=new InnerClassAssisted1();     // creating object of Outer class
	  
	  InnerClassAssisted1.Inner in=obj.new Inner(); 
	  Inner.Inner_2 i=in.new Inner_2();// creating object of Inner class
	  in.msg();  
	  in.display(); 
	  i.Inner();
	  i.Inner2();
	 }  

}

		 

	

