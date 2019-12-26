package com.czetsuyatech.lesson6;

/**
 * To define a class use the keyword class + the name of the class.
 * 
 * @author Edward P. Legaspi | czetsuya@gmail.com
 */
public class Account {

	static boolean locked = true;

	// Normally the variables are defined at the top level of the class

	/**
	 * Unique identifier of this class that is use when comparing an instance to
	 * another.
	 */
	int id = 1;

	/**
	 * Here we define a class instance variable. This variable is associated to the
	 * object that is created when we instantiate a class.
	 */
	String name;

	/**
	 * <p>
	 * This is the entry point in running this class. We don't normally have this
	 * static method. Static means this method is owned by the class itself not by
	 * its instance.
	 * </p>
	 * <p>
	 * To run this class in console type: java -jar <nameOfJar.jar> param1 param2
	 * ...
	 * </p>
	 * <p>
	 * Remember this method.
	 * </p>
	 * 
	 * @param args the list of arguments given when you run an instance of the
	 *             class.
	 */
	public static void main(String args[]) {

		if (args.length > 1) {
			new Account(args[0]).printHello();

		} else {
			new Account().printHello();
		}

		// we can also create multiple objects from this class
		Account a1 = new Account("Account1");
		Account a2 = new Account("Account2");
		Account a3 = new Account("Account3");
		Account a4 = new Account("Account4");

		a1.printHello();
		a2.printHello();
		a3.printHello();
		a4.printHello();
	}

	/**
	 * This is the constructor that is use to create an instance of a class.
	 */
	public Account() {

		this.name = "Kerri Li";
	}

	/**
	 * This constructor accepts a parameter name.
	 * 
	 * @param name input name
	 */
	public Account(String name) {

		this.name = name;
	}

	/**
	 * Method of the instance of the class that prints hello world.
	 */
	void printHello() {
		System.out.println("Hello " + getName());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
