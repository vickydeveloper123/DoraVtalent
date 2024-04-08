package com.inheritance;

public class Runner {

	public static void main(String[] args) {
		Aeroplane reference1 = new Aeroplane();
		System.out.println(reference1.name);
		System.out.println(reference1.ifCode);
		System.out.println("====================");
		reference1.hashCode();
		reference1.ReservationCatageries();
		reference1.ExpectedEmployers();
        reference1.ExpectedPassengers();	
        reference1.weight();
        
        System.out.println("========================");
        System.out.println("Creating Sub class Spice Jet Information and retrieving Inheritance using OOPS concept");
        
        
        SpiceJet reference2=new SpiceJet();
        System.out.println(reference2.name);
		System.out.println(reference2.ifCode);
		System.out.println("====================");
		reference2.hashCode();
		reference2.ReservationCatageries();
		reference2.ExpectedEmployers();
        reference2.ExpectedPassengers();	
        reference2.weight();
        
        System.out.println("=========Acessing details from child class SpiceJet=====");
        System.out.println(reference2.name);
        System.out.println(reference2.manufacturingLocation);
        System.out.println(reference2.price);
        
        

	}

}
