package conversion;

import java.util.Scanner;

public class CovertingServies {
	
	
	//create the service object
	
	Service sa=new Service();
	
    Scanner sc=new Scanner(System.in);
    
 
	public void serchingConvertion(){
		
		
		System.out.println("Hello ");
		System.out.println("Please Enter any number for the Convertion ");
		System.out.println("1.Convertion");
		
		//Receiver input from keyborad for the  coveration 
		try{
		int a=sc.nextInt();
		int check=a;
		while(a!=4)
		{
			
		    System.out.println("Please Enter 1-3 \n1.Kelvin to celsius\n2.pounds to kilograms\n3.miles to kilometers");
			int a1=sc.nextInt();
			check=a1;
			switch(check){
			
			case 1:
				System.out.println("Enter a number in kelvin");
				sa.covertingKelvinToCelsius();
				break;
		
			case 2:
				System.out.println("Enter a number in pounds");
				sa.covertingPoundsToKilograms();
				break;
			
			case 3:
				
				System.out.println("Enter a number in miles");
				sa.covertingMilesToKilometers();
				break;
			
		    default :
		    	
		    	System.out.println("Invalid input Please try again");
			}
		}
		}catch(Exception e){
			System.out.println("Invalid input Please enter numbers");
		}
	}

	public static void main(String[] args) {
		
		CovertingServies cs=new CovertingServies();
	
		cs.serchingConvertion();

	}

}
