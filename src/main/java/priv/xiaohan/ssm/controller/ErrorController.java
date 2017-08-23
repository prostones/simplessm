package priv.xiaohan.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {
    @RequestMapping("/error")
    public ModelAndView index(String msg) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg",msg);
        mv.setViewName("error");
        return mv;
    }
}
