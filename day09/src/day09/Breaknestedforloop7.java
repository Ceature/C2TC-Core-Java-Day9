package day09;

public class Breaknestedforloop7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2&&j==2) {
					break;
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
//output is
//1 1
//1 2
//1 3
//2 1
//3 1
//3 2
//3 3


