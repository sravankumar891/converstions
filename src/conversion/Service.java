package conversion;

import java.util.Scanner;

public class Service {
	
	//Declare variable
    double pounds;
	double kilograms;
	double kelvin;
	double celsius;
	double miles;
	double kilometers;
	
	Scanner sc=new Scanner(System.in);
	
	
	//Converting Kelvin to celsius
	
	public void covertingKelvinToCelsius(){
		
		//taking the kelive value
		kelvin=sc.nextDouble();
		
		//one kelvin is -272.15 celsius
		
	       celsius=kelvin-272.15;
	       
	     //Diplay the Result
	       System.out.println(kelvin +" kelvins is "+ celsius + " celsius ");
		
		}
		
	//Converting pounds to kilograms
	
	public void covertingPoundsToKilograms(){
		
		//taking the  value
		 pounds=sc.nextDouble();
		
		//one pounds is 0.454 kilograms
		
		kilograms=pounds*0.454;
		
		//Diplay the Result
		System.out.println(pounds + " pounds is "+ kilograms + " kilograms ");
		
	}
	
	//Converting miles to kilometers
	
	public void covertingMilesToKilometers(){
		
		//taking the mile value
	     miles=sc.nextDouble();
		
		//one miles is 1.609 kilometers
		
		kilometers=miles*1.609;
		
		//Diplay the Result
		System.out.println(miles +" miles is "+ kilometers + " kilometers ");
		
	}
	
}