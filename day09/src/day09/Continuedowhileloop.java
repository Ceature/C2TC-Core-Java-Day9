package day09;

public class Continuedowhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		do{
			if(i==5) {
				i++;
				continue;
			}
			System.out.print(" "+i);
			i++;
		}while(i<10);
		System.out.print(" "+i);
	}
	}//output is 
//1 2 3 4 6 7 8 9 10

