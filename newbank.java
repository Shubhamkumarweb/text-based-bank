import java.util.*;
public class newbank 
{ 
	public static void main(String []args)
	{ Scanner s=new Scanner(System.in);
	int size=0;
	double[] accountbalances= new double[250];
	String[] accountnames= new String[250];
	while(true) {
	System.out.println("Bank Admin Menu:");
	System.out.println("Please Enter a Menu Option: \n(1): Add Customer to Bank \n(2): Change Customer Name \n(3): Check Account Balance \n(4): Modify Account Balance \n(5): Summary of All Accounts \n(-1): Quit");
	
	int a=s.nextInt();
	if(a==1)
	{
		System.out.println("Bank Add Customer Menu: \nPlease enter an Account balance");
		double balance=s.nextDouble();
		accountbalances[size]=balance;
		System.out.println("Please enter the account holder name:");
		String name=s.next();
		accountnames[size]=name;
		System.out.println("customer ID is: "+size);
		size+=1;
	}
	else if(a==2) {
	
		System.out.println("Bank Change Name Menu: ");
		System.out.println("Please enter a customer ID to change their name");
		int index=s.nextInt();
		System.out.println("What is the customer's new name");
		String n=s.next();
		accountnames[index]=n;
	}
	else if(a==3) {
		System.out.println("Bank Check Balance Menu: ");
		System.out.println("Please enter a customer ID to check the balance");
		int index=s.nextInt();
		double balance=accountbalances[index];
		System.out.println("This customer has $"+ balance+" in their account");
		
	}
	else if(a==4) {
		System.out.println("Bank Modify Balance Menu: ");
		System.out.println("Please enter a customer ID to Modify the balance");
		int index=s.nextInt();
		
		System.out.println("Please input your account balance");
		double x=s.nextDouble();
		accountbalances[index]=x;
		
	}
	else if(a==5) {
		System.out.println("Bank All Customer Summary Menu:");
		double total=0;
		for(int i=0;i<size;i++) {
			total+=accountbalances[i];
		System.out.println(accountnames[i]+"  has $ "+accountbalances[i]+" in their account");
	}
		System.out.println("In total, there is $ "+total+" in the bank");
	}
	else if(a==-1) {
		System.out.println(a);
		System.exit(-1);
		
	}
	
	else
	{
		System.out.println("ERROR Invalid Input");
	}
		}
	}
}
