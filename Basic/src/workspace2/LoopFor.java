package workspace2;

public class LoopFor {

	public static void main(String[] args) {
		/*int num;
		for (int i = 1;i<=5;i++) {
			System.out.println("value of i" +i);
			for(int j=1;j<=i;j++) {
				System.out.println("value of j"+j);
			}
		}
	}

}*/
		/*for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
/*  *
    * *
    * * *
*/
	

		for (int i= 0; i<= 3; i++)  
		{  
		for (int j=0; j<=i; j++)   
		{  
		System.out.print("* ");  
		}   
		System.out.println("");   
		}   
		for (int i=3; i>=0; i--)  
		{  
		for(int j=0; j <= i-1;j++)  
		{  
		System.out.print("*"+ " ");  
		}  
		System.out.println("");  
		}	
}
}

/*  
*
**
***
****
***
**
*
*/