package org.example.Controller;


import lombok.extern.slf4j.Slf4j;
import org.example.config.UdpConnect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.reflect.annotation.ExceptionProxy;


@Slf4j
@Controller
public class clientRun {



    @RequestMapping(value ="/client")
    public ModelAndView socketClient(){

       try{
            UdpConnect udp = new UdpConnect();
            udp.start();

        }catch (Exception e){
            e.printStackTrace();
        }




        ModelAndView mv = new ModelAndView();
        mv.setViewName("connect");

        return mv;


    }



}
