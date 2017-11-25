package com.dou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


/*
 Without annotation
 */
//public class HelloController extends AbstractController {
//    @Override
//    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest req,
//                                                 javax.servlet.http.HttpServletResponse resp)
//            throws Exception {
//        ModelAndView modelAndView = new ModelAndView("HelloPage");
//        modelAndView.addObject("welcomeMessage","Hi There");
//
//        return modelAndView;
//    }
//}


/*
 With annotation
 */
@Controller
@RequestMapping("/greet")//class level annotation
public class HelloController{
    // front controller sees the request mapping and decide which method to execute
    @RequestMapping("/hello") // response to /greet/hello
    public ModelAndView helloWorld(){
        //to prepare the view mapping
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage","Hello!!!! There");
        return modelAndView;
    }

    @RequestMapping("/hi")// response to /greet/hi
    public ModelAndView hiWorld(){
        //to prepare the view mapping
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage","Hi!!!!!!!!!!! There");
        return modelAndView;
    }
}
