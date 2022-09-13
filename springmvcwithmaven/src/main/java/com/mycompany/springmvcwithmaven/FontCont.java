package com.mycompany.springmvcwithmaven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FontCont {

    @RequestMapping("")
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/home", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView m = new ModelAndView();
        m.addObject("name", "zahid hasan");
        setSomething(m);
        m.setViewName("home");
        return m;
    }

    public void setSomething(ModelAndView m) {
        m.addObject("age", 20);

    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

}
