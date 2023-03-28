package top.uaian.consumer.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.uaian.dubbo.INumberService;

@RestController
public class NumberController {

    @Reference
    INumberService numberService;

    @GetMapping("/random")
    Integer getRandomNumber(){
        return numberService.getRandomNumber();
    }
}
