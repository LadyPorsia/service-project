package com.porsia.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.porsia.db.model.CelebritySoulmate;

@Controller
public class SpringController {
    
    @RequestMapping(value="/angularjs.web",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "angularJS";
    }
    
    
    //@RequestMapping(value="/springAngularJS.web", method=RequestMethod.GET, produces={"application/xml", "application/json"})
    @RequestMapping(value="/springAngularJS.web", method=RequestMethod.GET)
    public @ResponseBody CelebritySoulmate  getPerson() {      
    	CelebritySoulmate celebrity = new CelebritySoulmate();
    	celebrity.setName("Java");
    	//celebrity.setDescription("Honk");
    	//celebrity.setFilename("Hola");
        return celebrity;
    }
}
