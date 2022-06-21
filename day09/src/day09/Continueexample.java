package day09;

public class Continueexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int first=5;
	int second=20;	
	do{
		if(first++ > --second){
		continue;
	}
	}while(first<15);
	System.out.println("first is: "+first+" and second is: "+second);
}
}//output is 
//first is: 15 and second is: 10