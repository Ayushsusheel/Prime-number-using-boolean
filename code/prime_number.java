
public class Main
{
	public static void main(String[] args)
	{
	   //YOU CAN PASS ANY NUMBER INSTEAD OF -1
	   int no=-1;
	   boolean isprime=true;
	   if(no==1 || no==0)
	   {
	       System.out.println("not prime");
	   }
	   for(int i=2;i<no;i++)
	   {
	     if(no%i==0)
	     {
	       isprime=false;
	       break;
	     }
	       
	   }
	    if(no<2) isprime=false;
	    System.out.println( no + " is prime------->" + isprime  );
	}
	
}
