package day09;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) {
			for(int j=i;j<=5;j++) {
				if(j==4) {
					continue;
				}
				System.out.print(j);
			}System.out.println(" ");
		}

	}

}//output is 
//01235 
//1235 
//235 
