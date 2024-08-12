package JavaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
	
		
		int i=1; //intialization
		//Disadvantage of while loop. goes into infinite loop if you dont give incremental and decremental part
		
	while(i<=10) { //conditional
		System.out.println(+i);
		i=i+1; //incremental and decremental 
	}

	for(int j=1;j<=10;j++) {
		System.out.println(j);
	}
	
	System.out.println("----------------"); // to print 2 to 100
	
	for(int k=2;k<=100;k++) {
		System.out.println(k);
	}
	System.out.println("----------------");

	for(int l=101;l>=-10;l--) {  //to print 101 to -10
		System.out.println(l);
		
	
	}
	System.out.println("----------------");
		
	for(int g=9;g<=10;g++) {
		System.out.println(g);
	}

}
}
