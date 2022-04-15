// Pattern of  X
class Q8_4
{
	public static void main (String args[]){
        for (int i=0; i<6; i++)   
        { 
			for (int k=0; k<i; k++)   
              {
                System.out.print(" ");   
              }
            for (int j=5; j>=i; j-- )   
              { 
                 System.out.print("* ");   
              }   
           System.out.println();   
        }   
		
        for (int i=0; i<6; i++)   
        { 
			for (int k=6-i; k>1; k--)   
            {
                System.out.print(" ");   
            }
            for (int j=0; j<=i; j++ )   
            { 
                System.out.print("* ");   
            }   
        System.out.println();   
        }   	  
	}
}