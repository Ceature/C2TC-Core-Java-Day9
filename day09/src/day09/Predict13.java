package day09;

public class Predict13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int i,j;
		for(i=0,j=0;i<5&j<5;++i,j=i+1) {
			sum+=i;
			System.out.print(" "+sum);
		}
	}

}//output is= 0 1 3 6
