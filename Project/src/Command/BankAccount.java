package Command;

class BankAccount {
private int balance;
	
	public BankAccount(int balance) {
		this.balance = balance;
	}
	
	public int check(){
		System.out.println("Ur balance is " + balance);
        return balance;
	}
	
	public int put(int money){
		this.balance = balance+money;
		return balance;
	}
	
	public int take(int money){
		this.balance = balance - money;
		return balance;
	}	
		
	public void reject(){
		System.out.println("Opration is canceled");
		}
	
	public void setBalance(int balance){
		this.balance=balance;
	}
	
	public int getBalance(){
		return balance;
}
}
