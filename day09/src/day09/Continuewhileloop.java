package day09;

public class Continuewhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
		}
				System.out.print(" "+i);
				i++;
			
		}
	}
}//output is
// 1 2 3 4 6 7 8 9 10
