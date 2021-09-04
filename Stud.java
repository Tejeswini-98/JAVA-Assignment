import java.util.Scanner;
public class Stud {
	
	    public static void main(String[] args) {
	        int marks [] = new int[5] ;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter name of Student");
	        String name = sc.next();
	        System.out.println("Enter ROll no of Student");
	        int roll = sc.nextInt();
	        System.out.println("Enter Age of Student");
	        int age = sc.nextInt();
	        System.out.println("Enter marks of Student");
	        for (int i=0;i<marks.length;i++){
	            marks[i] =sc.nextInt();
	        }
	        System.out.println("Student Details are:  ");
	        System.out.println("Name:  "+name+ "\nRoll No:  "+roll+"\nAge:  "+age+"\nMarks are: ");
	        for (int i=0;i<marks.length;i++){
	            System.out.println(" "+marks[i]);
	        }
	    }
	}


