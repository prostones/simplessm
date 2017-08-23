package priv.xiaohan.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/job")
public class JobController {

    @RequestMapping("/index")
    public ModelAndView index() {
        return new ModelAndView("job");
    }
}
