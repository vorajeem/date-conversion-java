package test_project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * Simple program to convert to/from a Date/string.
 *
 */
public class MyJavaProgram {

	public static void main(String[] args) throws ParseException {
//		Date startDate = simpleDateFormat.parse("20210419");
		
		// TODO Auto-generated method stub
		
		// the format you'd like to display your date as.
		String pattern ="yyyyMMdd";
		// this formats the date to look how you'd want it to look
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		

		//Get date for 2 day prior to currentDate.
		long SINGLE_DAY_IN_MS = 1000 * 60 * 60 *24;
		long nDaysToGoBack = 2;		
		//create 'startDate' variable from milliseconds as an input
		Date startDate = new Date(System.currentTimeMillis()- (nDaysToGoBack*SINGLE_DAY_IN_MS));
		
		//	Set 'endDate' as your current date.
		Date endDate = new Date(System.currentTimeMillis());
		System.out.println();
		System.out.println("Start Date: "+ simpleDateFormat.format(startDate));
		System.out.println("End Date: "+ simpleDateFormat.format(endDate));
	}

}
