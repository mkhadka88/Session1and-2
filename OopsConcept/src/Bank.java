import java.util.Scanner;

class Account{
	String accno;
	String name;
	float bal;
	public Account(String accno, String name, float bal) {
		super();
		this.accno = accno;
		this.name = name;
		this.bal = bal;
		System.out.println("A/C created");
	}
	void deposit(float amt) {
		this.bal = this.bal + amt;
		System.out.println("Rs "+amt+" Deposited || Balanced:"+this.bal);
		
	}
	void withdrawl(float amt) {
		if (this.bal >= amt) {
			this.bal -= amt;
			System.out.println("Rs "+amt+" Debited || Balanced: "+this.bal);
		}else {
			System.out.println("Insufficient balance");
		}
	}
	void getBalance() {
		System.out.println("Name: "+this.name+"|| A/C no: "+this.accno+"||  Balance: "+this.bal);
	}
	
}
public class Bank {

	public static void main(String[] args) {
		Account acc = null;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. Create A/C");
			System.out.println("2. Deposit");
			System.out.println("3. Withdrawl");
			System.out.println("4. Balance");
			System.out.println("5.Exit");
			
			System.out.println("Enter an option: ");
			int opt = sc.nextInt();
			
			switch (opt) {
			case 1:
				if(acc == null) {
					System.out.println("Enter A/C: ");
					String acno= sc.next();
					sc.nextLine();
					System.out.println("Enter name: ");
					String name = sc.nextLine();
					System.out.println("Enter the amount: ");
					float amt = sc.nextFloat();
					
					acc = new Account(acno, name, amt);
					
				}else {
					System.out.println("A/C already created.");
				}
			 break;
			 
			case 2:
				if(acc != null) {
					System.out.println("Enter amount to deposit");
					float amt = sc.nextFloat();
					acc.deposit(amt);
					
				}else {
					System.out.println("Create account first.");
				}
			 break;
			 
			case 3:
			 if(acc != null) {
				 System.out.println("Enter amount to withdraw.");
				 float amt = sc.nextFloat();
				 acc.withdrawl(amt);
					
				}else {
					System.out.println("Create account first.");
				}
			 break;
			case 4:
				 if(acc != null) {
						System.out.println("get the balance.");
						acc.getBalance();
					}else {
						System.out.println("Create account first.");
					}
				 break;
				 
			case 5:
				default:
					System.out.println("Bye Bye");
					
					sc.close();
					break;
				 
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
			}
		}

}
}
