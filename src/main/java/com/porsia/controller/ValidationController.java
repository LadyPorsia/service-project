package com.porsia.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.Years;

import com.porsia.db.dao.CelebritySoulmateDao;
import com.porsia.db.model.CelebritySoulmate;
import com.porsia.exception.DateException;






public class ValidationController {

	CelebritySoulmateDao celebritySoulmateDAO;

	public List<CelebritySoulmate> processDate(Date date) throws DateException {

		LocalDate birthdate = new LocalDate(1970, 1, 20);
		LocalDate now = new LocalDate();
		Years age = Years.yearsBetween(birthdate, now);
		int ageNumber = age.getYears();

		List<CelebritySoulmate> celebritySoulmates = new ArrayList<CelebritySoulmate>();

		System.out.print("The age is: " + age);
		if (ageNumber < 16) {
			throw new DateException();
		}

		//celebritySoulmates = getCelebritySoulmateDAO().getListCelebritySolumates(date);

		return celebritySoulmates;
	}
	
	public CelebritySoulmateDao getCelebritySoulmateDAO() {
		return celebritySoulmateDAO;
	}

	public void setCelebritySoulmateDAO(CelebritySoulmateDao celebritySoulmateDAO) {
		this.celebritySoulmateDAO = celebritySoulmateDAO;
	}

}
