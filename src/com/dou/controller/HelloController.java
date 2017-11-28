package com.dou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;


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
//@Controller
//@RequestMapping("/greet")//class level annotation
//public class HelloController{
//    // front controller sees the request mapping and decide which method to execute
//    @RequestMapping("/hello") // response to /greet/hello
//    public ModelAndView helloWorld(){
//        //to prepare the view mapping
//        ModelAndView modelAndView = new ModelAndView("HelloPage");
//        modelAndView.addObject("welcomeMessage","Hello!!!! There");
//        return modelAndView;
//    }
//
//    @RequestMapping("/hi")// response to /greet/hi
//    public ModelAndView hiWorld(){
//        //to prepare the view mapping
//        ModelAndView modelAndView = new ModelAndView("HelloPage");
//        modelAndView.addObject("welcomeMessage","Hi!!!!!!!!!!! There");
//        return modelAndView;
//    }
//}


/*
 multiple address to call same jsp with different username shown
 A URI-Template concept
 */
//@Controller
//public class HelloController{
//    // use {} to replace address
//    @RequestMapping("/hello/{area}/{userName}") // response to /hello/{YOUR_AREA}/{YOUR_USERNAME}
//    // use @PathVariable to set userName
//    public ModelAndView helloWorld(@PathVariable("userName") String name,
//                                   @PathVariable("area") String area){
//        ModelAndView modelAndView = new ModelAndView("HelloPage");
//        modelAndView.addObject("welcomeMessage","Hello!!!!  " +area +" "+ name);
//        return modelAndView;
//    }
//}


//use map
@Controller
public class HelloController{
    // use {} to replace address
    @RequestMapping("/hello/{area}/{userName}") // response to /hello/{YOUR_AREA}/{YOUR_USERNAME}
    // use @PathVariable to set userName
    public ModelAndView helloWorld(@PathVariable Map<String,String> pathVars){
        String name = pathVars.get("userName");
        String area = pathVars.get("area");
        ModelAndView modelAndView = new ModelAndView("HelloPage");
        modelAndView.addObject("welcomeMessage","Hello!!!!  " +area +" "+ name);
        return modelAndView;
    }
}