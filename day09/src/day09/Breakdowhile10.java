package day09;

public class Breakdowhile10 {
	public static void main(String[] args) {
		int i=1;
		do{
			if(i==5) {
				i++;
				break;
			}
			System.out.println(i);
			i++;
		}while(i<10);
		System.out.println(i);
	}

}
//output is
//1
//2
//3
//4
//6