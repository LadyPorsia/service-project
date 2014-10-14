package com.porsia.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.Validate;

//import org.thymeleaf.util.Validate;

import com.porsia.exception.PorsiaException;


public class DateController {
	
	public Date convertToDate(String year, String month, String day) throws ParseException, PorsiaException {
		Date date;
		try {
			Validate.notEmpty(day, "Error in the day format. ");
			Validate.notEmpty(month, "Error in the month format. ");
			Validate.notEmpty(year, "Error in the year format. ");
			
			String str_date = day + "-" + month + "-" + year;
			DateFormat formatter;

			formatter = new SimpleDateFormat("dd-MM-yy");
			date = formatter.parse(str_date);

		} catch (Exception e) {
			throw new PorsiaException("Exception generated converting the date to string. ", e);
		}
		return date;
	}
}
