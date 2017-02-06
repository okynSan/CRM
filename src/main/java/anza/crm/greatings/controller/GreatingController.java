/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anza.crm.greatings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author andrey_zatvornitskiy
 */
@Controller
public class GreatingController {

    @RequestMapping(value = "/greating", method = RequestMethod.GET)
    public String getGreatingMessage(ModelMap model) {

        model.addAttribute("message", "We done this sheet");

        return "greating";
    }

    @RequestMapping(value = "/greating/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("message");
        model.addObject("msg", name);

        return model;

    }

}
