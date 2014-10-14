package com.porsia.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.porsia.db.dao.CelebritySoulmateDao;
import com.porsia.db.model.CelebritySoulmate;
import com.porsia.exception.DateException;



@Controller
@RequestMapping("/")
public class CelebritySoulmateController {
	
	CelebritySoulmateDao celebritySoulmateDAO;
	
	public List<CelebritySoulmate> getCelebritySoulmateList(String filter) throws DateException {
		//return getCelebritySoulmateDAO().selectListCelebritySoulmate(filter);
		return null;
	}

	public CelebritySoulmate getCelebritySoulmateInformation(int id) {
		return getCelebritySoulmateDAO().selectCelebritySoulmate(id);
	}
	
	@RequestMapping(value="/celebritysoulmate/add/{name}/{file}/{gender}", method = RequestMethod.GET)	
	public void addCelebritySoulmateInformation(@PathVariable String name, @PathVariable String file, @PathVariable char gender) {
		getCelebritySoulmateDAO().insert(new CelebritySoulmate(name, file, gender));
	}
	
	public void addCelebritySoulmateInformation(CelebritySoulmate celebritySoulmate) {
		getCelebritySoulmateDAO().insert(celebritySoulmate);
	}

	public CelebritySoulmateDao getCelebritySoulmateDAO() {
		return celebritySoulmateDAO;
	}

	public void setCelebritySoulmateDAO(CelebritySoulmateDao celebritySoulmateDAO) {
		this.celebritySoulmateDAO = celebritySoulmateDAO;
	}
}
