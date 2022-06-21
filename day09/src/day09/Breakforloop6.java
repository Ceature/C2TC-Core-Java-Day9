package day09;

public class Breakforloop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		for(i=1;i<=10;i++) {
			System.out.println("before break statement");
			if(i==6) 
			break;
			System.out.println("after break statement");
	}
		System.out.println("for loop is terminated");

	}

}
//output is
//before break statement
//after break statement
//before break statement
//after break statement
//before break statement
//after break statement
//before break statement
//after break statement
//before break statement
//after break statement
//before break statement
//for loop is terminated
