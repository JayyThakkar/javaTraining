package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		
		int a=20;
		int b=50;
		
		
		if(a>b) {
			
			System.out.println("a is greater than b");
		}
			else {
				System.out.println("b is greater than a");
			}
		
		double d=10.5;
		double d1=20.5;
		
		if (d>d1) {
			System.out.println("D is Greater value");
		}
		else {	
			System.out.println("D1 is Greater Value"); 
		}
		
		//Write a logic to find highest variable
		
		int a1=100;
		int b1=200;
        int c1=300;
        
        //nested if-else
        
        if(a1>b1 & a1>c1) {
        	System.out.println("A1 is the Greatest");
        }
        else if (b1>c1) {
        	System.out.println("B1 is the Greatest");
        }
        else {
        	System.out.println("C1 is the Greatest");
        }
        
        
        
        
        
        
        
        
	}

}
