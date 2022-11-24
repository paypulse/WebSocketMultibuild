package org.example.Controller;


import lombok.extern.slf4j.Slf4j;
import org.example.config.UdpConnect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class MainController {

    @RequestMapping("/chat")
    public ModelAndView chat(){


        new UdpConnect("localhost" , 9666);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("chat");

        return mv;

    }
}
