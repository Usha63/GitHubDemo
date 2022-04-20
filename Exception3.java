import java.util.Scanner;

class InvalidCredentialsException extends Exception
{
	private String name;
	private String password;
	public InvalidCredentialsException(String name, String password ) 
	{
		this.name=name;
		this.password=password;
	}
	public String toString() {
		return name+password;
	}}
public class Exception3 
{
	static void validation(String name, String password) throws  InvalidCredentialsException 
       {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name1=sc.nextLine();
		System.out.println("Enter Password:");
		String password1=sc.nextLine();
		
     if(name1.equals("infosys") || password1.equals("infosys123"))
    	
        throw new InvalidCredentialsException(name1, password1);//MyException1 obj
     else
      System.out.println("Invalid Credentials");
            }  
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
       }
   public static void main(String args[]) throws  InvalidCredentialsException 
      {
	   
	   
	   Exception3.validation("infosys", "infosys123");
      System.out.println("rest of the code...");
      }
   }

