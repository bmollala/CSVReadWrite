package co.za.assesment.csvreadwrite;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		
		String dateStr = "Mon Jun 18 00:00:00 IST 2012";
		DateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date date = (Date)formatter.parse(dateStr);
		System.out.println(date);   
	}

}
