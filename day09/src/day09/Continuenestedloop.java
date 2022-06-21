package day09;

public class Continuenestedloop {
	public static void main(String[] args) {
		for(int i=0;i<=3;i++) {
			for(int j=i;j<=3;j++) {
				if(i==2&&j==2) {
					continue;
				}
				System.out.print(i+""+j+" ");
			}System.out.println(" ");
		}
	}

}//output is 
//00 01 02 03  
//11 12 13  
//23  
//33  

