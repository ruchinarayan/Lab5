package com;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class ConversionServlet
 */
@WebServlet("/ConversionServlet")
public class ConversionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConversionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	public double convertInchesToFeet(double value) {
		double feet;
		feet = value/12;
		return feet;
	}
	
	public double convertInchesToCentimeter(double value) {
		double centimeter;
		centimeter = value * 2.54;
		return centimeter;
	}
	
	public double convertFeetToMeter(double value) {
		double meter;
		meter = value/3.28084;
		return meter;
	}
	
	public double convertFeetToMiles(double value) {
		double miles;
		miles = value / 5280;
		return miles;
	}
	
	public double convertMilesToKilometers(double value) {
		double kilometers;
		kilometers = value * 1.60934;
		return kilometers;
	}
	
	public double convertDaysToMonths(double value) {
		double months;
		months = value/30;
		return months;
	}
	
	public double convertWeeksToYears(double value) {
		double years;
		years = value/52;
		return years;
	}
	
}
