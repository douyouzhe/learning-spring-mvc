package com.dou.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

import java.util.Map;

@Controller
public class StudentAdmissionController {

//    @RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
//    public ModelAndView getAdmissionForm(){
//        ModelAndView model = new ModelAndView("AdmissionForm");
//        return model;
//    }

    @RequestMapping(value = "/submitAdmissionForm.html", method = RequestMethod.POST)
    public ModelAndView submitAdmissionForm(@RequestParam Map<String,String> reqPara){
        String name = reqPara.get("studentName");
        String hobby = reqPara.get("studentHobby");
        ModelAndView model = new ModelAndView("AdmissionSuccess");
        model.addObject("msg","Your details: name: "+ name
        + ", hobby: "+ hobby);
        return model;
    }

}
