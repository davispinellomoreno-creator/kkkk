package kkkkkkk.kkkkkk.kkkk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {
    @GetMapping("/KKKK")
    public String boasVindas(){
        return "SEJA BEM-VINDO AO SITE KKKKKKKK TESTE";
    }
}
