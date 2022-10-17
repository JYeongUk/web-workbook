package org.zerouk.boot.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello(Model m) {
        log.info("hello............");
        m.addAttribute("msg", "HELLO WORLD");
    }

    @GetMapping("/ex/ex1")
    public void ex1(Model m) {
        List<String> list = Arrays.asList("AAA", "BBB", "CCC", "DDD");
        m.addAttribute("list", list);
    }

}
