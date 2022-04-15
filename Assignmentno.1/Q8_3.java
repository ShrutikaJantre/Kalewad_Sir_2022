// Pattern of K
class Q8_3
{
	public static void main (String args[])
	{
        for (int i=0; i<6; i++){  
             
			for (int j=5; j>=i; j-- ){   
              System.out.print("* ");   
            }   
            System.out.println();   
        }  
		
        for (int i=0; i<6; i++){ 
		
            for (int j=0; j<=i; j++ ){                 
				System.out.print("* ");   
            }   
            System.out.println();   
        }  	  
	}
}