package com.constructors;

public class Constructorss {
	
	
	String name="Dora Sri Vignesh";
	int age=27;
	float salary=1000000.0f;
	static String nativePlace="Nellore" ;
	// javap program. command prompt.
	public Constructorss() {

	System.out.println("Default constructor from Constructor class");
	
	}
	
	Constructorss(String name,int age,String nativePlaceee){
		this.name=name;
		this.age=age;
		this.nativePlace=nativePlaceee;
	}
	
	public void details(String familyName,String location) {
		System.out.println(familyName="Rachamalli");
		System.out.println(location="Nellore");
		
	}

}
