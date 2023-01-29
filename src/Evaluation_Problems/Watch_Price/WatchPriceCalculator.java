package Evaluation_Problems.Watch_Price;

public class WatchPriceCalculator {
	double getWatchPrice(String watchType, int age, String gender){  
		   //code to computer and return the price of watch up to two decimal  places
		   double bill;
		   if(watchType.equals("Titan")){
		       double price = (7999.0+(7999.0*0.125)+(7999.0*0.075));
		       if(age>=60 && gender.equals("female")){
		           bill = price - (price*5)/100;
		       }else if(gender.equals("female"))bill = price - (price*2)/100;
		       else if(age>=60)bill = price - (price*3)/100;
		       else bill = price;
		       
		       bill = Math.round(bill*100)/100.0;
		       return bill;
		   }else {
		       double price = (10999.0+(10999.0*0.135)+(10999.0*0.125));
		       if(age>=60 && gender.equals("female")){
		           bill = price - (price*5)/100;
		       }else if(gender.equals("female"))bill = price - (price*2)/100;
		       else if(age>=60)bill = price - (price*3)/100;
		       else bill = price;
		       
		       bill = Math.round(bill*100)/100.0;
		       return bill;
		   }
		   
		 } 
}
