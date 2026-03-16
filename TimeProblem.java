package ab61;

import java.util.Date;

public class TimeProblem
{
	public static void main(String[] args)
    {
		Date d1= new Date();
		System.out.println(d1.getTime());	
		
		Date d2= new Date (d1.getTime()+1000*60*60*24*1);
		System.out.println(d2);
		
		String format1=   d2.toString();
		String month= format1.substring(4, 7);
		System.out.println(month);
		
		String date= format1.substring(8, 10);
		System.out.println(date);
				
		String year= format1.substring(24, 28);
		System.out.println(year);

		String year1=format1.substring(format1.length()-4);
		System.out.println(year1);
		
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
	    System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		
	}
				
				
}
