package ch.mubo.bkmonitor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

        public String home() {
            return "/resources/static/index.html";
        }
}
