package com.morsecodeapi.Controller;

import com.morsecodeapi.service.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @PostMapping("/convert")
    public String convertMorse(@RequestBody String text) {
        return Service.morseToAlpha(text);
    }

    @PostMapping("/convertalpha")
    public String convertAlpha(@RequestBody String text) {
        return Service.alphaToMorse(text);
    }
}
