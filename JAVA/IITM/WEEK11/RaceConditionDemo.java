import java.util.*;
class Bank {
	private double[] accounts = new double[100];
  	public Bank() {
    		for (int i = 0; i < accounts.length; i++) {
      			accounts[i] = 1000.00; // Initial balance for each account
    		}
	}	

  	public synchronized boolean transfer(double amount, int source, int target) throws InterruptedException{
    		if (accounts[source] < amount) {
      			return false;
    		}
    		//Thread.sleep(10);
    		accounts[source] -= amount;
    		//Thread.sleep(10);
    		accounts[target] += amount;
    		//Thread.sleep(10);
    		return true;
  	}

  	public synchronized double audit() throws InterruptedException{
    		double balance = 0.00;
    		for (int i = 0; i < accounts.length; i++) {
      			Thread.sleep(10);
      			balance += accounts[i];
    		}
    		return balance;
  	}
}

class TransferThread extends Thread {
	private Bank bank;
  	private int source;
  	private int target;
  	private double amount;

  	public TransferThread(Bank bank, int source, int target, double amount) {
    		this.bank = bank;
    		this.source = source;
    		this.target = target;
    		this.amount = amount;
  	}

  	public void run() {
    		for (int i = 0; i < 1000; i++) {
      			try{
        			bank.transfer(amount, source, target);
      			}catch(InterruptedException e){}
    		}
  	}
}

public class RaceConditionDemo {
  	public static void main(String[] args) throws InterruptedException{
    		Random random = new Random();
    		Bank bank = new Bank();
    		for(int i = 0; i < 10; i++){
      			try{
        			int source = random.nextInt(100);
        			int target = random.nextInt(100);
        			int amount = random.nextInt(100);
        			Thread t1 = new TransferThread(bank, source, target, amount);
        			Thread t2 = new TransferThread(bank, target, source, amount);

        			t1.start();
        			t2.start();

        			try {
            				t1.join();
            				t2.join();
        			} catch (InterruptedException e) {
            				e.printStackTrace();
        			}

        			System.out.println("Final bank audit balance: " + bank.audit());
     			}catch(Exception e){}
   		}
	}
}
