package cl.usach.simple.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerSimpleWeb {

    @RequestMapping("/Web")  
    public String mostrarMensaje(){
        return "Web simple";
    }
    
}
