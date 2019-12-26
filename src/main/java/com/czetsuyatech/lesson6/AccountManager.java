package com.czetsuyatech.lesson6;

/**
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class AccountManager {

	public static void main(String args[]) {

		new AccountManager();
	}

	public AccountManager() {

		Account a1 = new Account("Jim Raynor");
		Account a2 = new Account("Sarrah Kerrigan");
		Account a3 = new Account("Sarrah Kerrigan");

		System.out.println(a1);

		a1.printHello();
		a2.printHello();

		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());

		System.out.println("== " + (a2 == a3));
		System.out.println("equals " + a2.equals(a3));
		System.out.println(a1.equals(a2));
		System.out.println(a2.equals(a3));
		System.out.println(a1.equals(a3));

		int x = 1;
		System.out.println(x);
		passByValue(x);
		System.out.println(x);

		// when we pass the value of an object we are passing the reference to it
		Account a4 = new Account("Jim");
		passByReference(a4);
		System.out.println(a4);

		passByReference2(a4);
		System.out.println(a4);
		
		a4.name = "Zerg";
		
		System.out.println(a4);

		// static test
		System.out.println("Account.locked=" + Account.locked);
		Account.locked = false;
		System.out.println("Account.locked=" + Account.locked);
		
		Account2 account2 = new Account2();
		account2.printLocked();
	}

	public void passByValue(int x) {
		x = 10;
		System.out.println(x);
	}

	public void passByReference(Account account) {
		account.setName("Zeratul");
	}

	public void passByReference2(Account account) {

		account = new Account();
		account.setName("Tassadar");
	}

	public static void staticMethod(Account account) {
		System.out.println(account.getName());
	}

	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
}
