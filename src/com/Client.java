package com;

import java.util.Scanner;
import files.ConversionServlet;
import files.ConversionServletService;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConversionServletService conServ = new ConversionServletService();
		ConversionServlet con = conServ.getConversionServlet();
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter conversion values:");
		String value = scn.nextLine();
		
		String[] values = value.split(" ");
		
		double val = Double.parseDouble(values[0]);
		String convertFrom = values[1];
		String convertTo = values[3];
		
		if(convertFrom.equals("in") && convertTo.equals("ft"))
		{
			System.out.println("in -- ft");
			System.out.println("Value: "+con.convertInchesToFeet(val));
		}
		else if(convertFrom.equals("in") && convertTo.equals("cm"))
		{
			System.out.println("in -- cm");
			System.out.println("Value: "+con.convertInchesToFeet(val));
		}
		else if(convertFrom.equals("ft") && convertTo.equals("m"))
		{
			System.out.println("ft -- m");
			System.out.println("Value: "+con.convertFeetToMeter(val));
		}
		else if(convertFrom.equals("ft") && convertTo.equals("mi"))
		{
			System.out.println("ft -- mi");
			System.out.println("Value: "+con.convertFeetToMiles(val));
		}
		else if(convertFrom.equals("mi") && convertTo.equals("km"))
		{
			System.out.println("mi -- km");
			System.out.println("Value: "+con.convertMilesToKilometers(val));
		}
		else if(convertFrom.equals("days") && convertTo.equals("months"))
		{
			System.out.println("days -- months");
			System.out.println("Value: "+con.convertDaysToMonths(val));
		}
		else if(convertFrom.equals("weeks") && convertTo.equals("years"))
		{
			System.out.println("weeks -- years");
			System.out.println("Value: "+con.convertWeeksToYears(val));
		}
		else 
		{
			System.out.println("Enter correct command!");
		}
	}
	
}
