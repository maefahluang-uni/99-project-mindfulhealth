package th.mfu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

     @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes attributes) {
        if ("Admin".equals(username) && "1234".equals(password)) {
            return "redirect:/admin-dashboard";
        } else if ("Barista".equals(username) && "1234".equals(password)) {
            return "redirect:/barista-dashboard";
        }
        
        attributes.addFlashAttribute("error", "Invalid username or password");
        return "redirect:/login";
    }
    


    }