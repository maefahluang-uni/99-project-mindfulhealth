package th.mfu;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {
        
            @GetMapping("/welcome")
            public String welcome() {
                return "welcome.html";
            }
        
            @GetMapping("/activity")
            public String activity() {
                return "activity.html";
            }
        
            @GetMapping("/dashboard")
            public String dashboard() {
                return "dashboard.html";
            }
        
            @GetMapping("/focus")
            public String focus() {
                return "focus.html";
            }
        
            @GetMapping("/medications")
            public String medications() {
                return "medications.html";
            }
        
            @GetMapping("/menstrual")
            public String menstrual() {
                return "menstrual.html";
            }
        }


