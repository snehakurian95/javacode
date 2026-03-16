package ab61;

import java.util.Date;

public class TimeProblem2
{
	public static void main(String[] args)
    {
		Date d1= new Date();
		Date d2= new Date (d1.getTime());
		String format1=   d2.toString();
		String date= format1.substring(8, 10);
		String month= format1.substring(4, 7);
		String hour= format1.substring(11, 13);
		String min= format1.substring(14, 16);
		String sec= format1.substring(17, 19);
		String year= format1.substring(24, 28);
		String format = date.concat(month).concat(hour).concat(min).concat(sec).concat(year);
		System.out.println(date.concat("-").concat(month).concat("-").concat(hour).concat(":").concat(min).concat(":").concat(sec).concat("-").concat(year));
		/*
		
		String month= format1.substring(4, 7);
		System.out.println(month);
		
		
				
		String year= format1.substring(24, 28);
		System.out.println(year);

		String year1=format1.substring(format1.length()-4);
		System.out.println(year1);
		
		System.out.println(date.concat(month).concat(year));
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
	    System.out.println(date.concat("/").concat(month).concat("/").concat(year));
		*/
	}
				
				
}
