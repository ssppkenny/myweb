package webproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.Map;
import java.util.HashMap;

@Controller
public class MainController {

    @RequestMapping("/hello")
    public ModelAndView hello(Model model) {
        Map<String,Object> params = new HashMap<>();
        params.put("project", "MyProject");

        return new ModelAndView("hello", params);
    }
    
}
