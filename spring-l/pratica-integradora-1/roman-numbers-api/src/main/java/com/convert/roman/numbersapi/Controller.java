package com.convert.roman.numbersapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/decimals")
    @ResponseBody
    public String decimals(@RequestParam Integer number) {
        return Service.forRoman(number);
    }
}
