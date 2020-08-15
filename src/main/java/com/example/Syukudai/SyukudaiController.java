package com.example.Syukudai;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
@Controller

public class SyukudaiController {
    @RequestMapping("/")
    public ModelAndView index() {
       ModelAndView model = new ModelAndView();
       model.setViewName("GotoHell");
       return model;
   }
}