package assignment;
import java.util.Scanner;
class Cab {
	  int fare;
	  int d;
	  
	   
	  public Cab() {
		  fare = 30;
	  }
	  
	  public Cab(int amt) {
		  fare = amt;
	  }
	    
	  void showFare() {
		  System.out.println("total Fare:" + fare);
	  }
}

class Ridercab {

	 public static void main(String args[]) { 
		 int cd;
		// Cab ob = new Cab();
		 Scanner sc = new Scanner(System.in);
		 System.out.println(" Enter the cab distance from user:");
		 cd = sc.nextInt();
		 if (cd > 5) {
			 Cab ob = new Cab(30 + 10 * (cd - 5));
		 System.out.print("enter the distance travelled:");
		 ob.d = sc.nextInt();
		 ob.fare = ob.fare + 10 * ob.d;
		 ob.showFare();
	 }

 else {
	Cab ob = new Cab();
	System.out.print("enter the distance travelled:");
	 ob.d = sc.nextInt();
	 ob.fare = ob.fare + 10 * ob.d;
	 ob.showFare();
}
}
}


