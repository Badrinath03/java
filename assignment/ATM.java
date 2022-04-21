import java.util.Scanner;
class ATM {
public static void main(String[] args) {
int balance = 5000,withdraw,deposit;
Scanner s = new Scanner(System.in);
while (true) 
{
System.out.println("Welcome to SBI");
System.out.println("1: Withdraw");
System.out.println("2: Deposit");
System.out.println("3: Check Balance");
System.out.println("4: Exit");

int ch = s.nextInt();
switch (ch) {
case 1:
	System.out.println("Enter Amount for withdrawal :");
	withdraw = s.nextInt();
	if (balance>=withdraw) {
	balance = balance-withdraw;
	System.out.println("Collect your money");
	System.out.println("Remaining balance is :"+balance);
	} else {
    System.out.println("Insufficient Balance");
    System.out.println("");
	}
	break;
case 2:
	System.out.println("Enter money to deposit :");
	deposit = s.nextInt();
	balance = balance+deposit;
	System.out.println("Your money is sucessfully deposited into your account");
	System.out.println("Remaining balance is :"+balance);
	System.out.println("");
	break;
case 3:
	System.out.println("Balance: "+balance);
	System.out.println("");
	break;
case 4:
	System.out.println("Thank you come again");
	System.exit(0);
	break;
}
}
}
}