
public class Bankaccount {
	
	private int accountno;
	private String name;
	private String  accounttype;
	private double balance;
	private static int totaldeposit, totalwithdrawls;
	
	
	


//constructor for initializing account details
	public Bankaccount(int accountno, String name,String accounttype, double balance) {
		super();
		this.accountno = accountno;
		this.name = name;
		this.accounttype = accounttype;
		this.balance = balance;
	}

	public Bankaccount()
	{
		//default constructor
	}
	
	// Display account details
	public static void showAccountdetails(Bankaccount temp){
		System.out.println(temp.accountno+","+temp.name+","+temp.accounttype+","+temp.balance);
	}
	
public void deposit(double amount) //Method for depositing 
{
  if(amount>=0.00) {
	  balance= balance + amount;
	  System.out.println(" Your accout was credited, reamaining  balance is "+balance);
	  totaldeposit++;
       }
   
}

public void withdraw(double amount)//Method for Withdrawing
{
  if(amount>=0.00 && amount<=balance) {
	  balance= balance - amount;
	  System.out.println(" Your accout was debited, reamaining  balance is "+balance);
	  totalwithdrawls++;
       }
  else
  {
	  System.out.println(" Not enough balance in your account "); 
  }
   
}

    //Displaying average balance of accounts
	public static void displayAveragebalance(Bankaccount...temp){
	
		double total=0;
		
		for(Bankaccount b:temp){
			total=total+b.balance;
		}
		System.out.println("Average balance is  : "+(total/temp.length));
	}
	
	
	
	public static void displaytotaltransactions(){
		
		
		System.out.println("TOTAL NO OF WITHDRAWLS : "+totalwithdrawls);//displaying total withdraw
		System.out.println("TOTAL NO OF Deposits : "+totaldeposit);//displaying total deposits
		
	}
	
	
	
	
	public void initializeaccount(int accno, String namee,String actype, double bal)
	{
		accountno=accno; 
		name=namee;
		accounttype=actype;
		balance=bal;
	}
	
	public static void main(String args[]){
		Bankaccount b1=new Bankaccount();
		Bankaccount b2=new Bankaccount();
		Bankaccount b3=new Bankaccount();
		Bankaccount b4=new Bankaccount();
		
		
		
		b1.initializeaccount(1001, "A","saving account", 5000);
		b2.initializeaccount(2001, "B","personal account", 10000);
		b3.initializeaccount(3001, "A","user account", 25000);
		b4.initializeaccount(4001, "A","deposit account", 55000);
		
		
		Bankaccount.showAccountdetails(b1);
		Bankaccount.showAccountdetails(b2);
		Bankaccount.showAccountdetails(b3);
		Bankaccount.showAccountdetails(b4);
		

		b1.withdraw(1000);
		b1.deposit(2000);
	
		Bankaccount.displaytotaltransactions();
		
		
	Bankaccount.displayAveragebalance(b1,b2,b3,b4);
				
		
			
	}
}
