package com.constructors;

public class ConstructorsRunner {

	public static void main(String[] args) {

		ConstructorsRunner reference = new ConstructorsRunner();

		reference.hashCode();

		Constructorss reference1 = new Constructorss();
		reference1.hashCode();
		System.out.println("Place =>" + reference1.nativePlace);

		System.out.println("-----------------------1 st method of costructors--------------------------------");

		Constructorss reference2 = new Constructorss();
		System.out.println("name   =>" + reference2.name);
		System.out.println("Age    =>" + reference2.age);
		System.out.println("Salary =>" + reference2.salary);
		System.out.println("Native Place->" + reference2.nativePlace);// Here we can observe static variable also can be
																		// acessed through reference.
		System.out.println("Calling through class name=>" + Constructorss.nativePlace);// This static variable we are
																						// calling with the class name.

		System.out.println("------------------------2 nd method of constructors------------------------------");

		Constructorss reference3 = new Constructorss("VijayaDurga", 16, "Nellore");
		System.out.println("name=>" + reference3.name);
		System.out.println("Age =>" + reference3.age);
		System.out.println("Native Place=>" + reference3.nativePlace);

		System.out.println("------------------------3 nd method of constructors------------------------------");

		Constructorss reference4 = new Constructorss("VijayaDurga", 16, "Nellore");

		System.out.println("Salary=>" + reference3.salary);// Here as salary is a instance variable even though we
															// haven't initialised in as a parameter in constructor we
															// can get it though help of reference.

		System.out.println("------------------------4 nd method of constructors------------------------------");
		Constructorss reference5 = new Constructorss();
		System.out.println("Native calling from instance==>" + Constructorss.nativePlace);// Before changing static
																							// value.

		reference5.name = "Amma";
		reference5.age = 55;
		reference5.salary = 20000;
		reference5.nativePlace = "Hyderabad";// static variable.
		System.out.println("name =>" + reference5.name);
		System.out.println("Age  =>" + reference5.age);
		System.out.println("Salary =>" + reference5.salary);
		System.out.println("Native Place =>" + reference5.nativePlace);
		System.out.println("Native calling from instance==>" + Constructorss.nativePlace);
		// Here in the constructors once we change the value to the instance or static
		// variable it will automatically change.

		System.out.println("---------Calling normal Method---------------");

		Constructorss reference6 = new Constructorss();
		reference6.details("Rachamlli", "Nellore");

	}

}
