package MaiOptiks.routing;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AerzteController {

    private static final String TITLE = "Arzt";

    @RequestMapping("/arzt")
    public String home(Model model) {
        model.addAttribute("title", TITLE);
        return "Arzt/index";
    }
}