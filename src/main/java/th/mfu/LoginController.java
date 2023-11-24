package th.mfu;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import th.mfu.domain.Login;


@Controller
public class LoginController {
    @Autowired
    LoginRepository LoginRepo;

    @Autowired
    DashboardRepository DashboardRepo;

   @GetMapping("/login")
    public String goToLogin(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }

    public String login(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        // Validate against hardcoded values (Mook and Mook1234)
        if ("Mook".equals(username) && "Mook1234".equals(password)) {
            // Successful login, redirect to the dashboard page
            return "redirect:/dashboard";
        } else {
            // Failed login, add an error message to the model and return to the login page
            redirectAttributes.addFlashAttribute("error", "Invalid username or password");
            return "redirect:/login";
        }
    }

    @GetMapping("/dashboard")
    public String goToDashboard(Model model) {
        model.addAttribute("dashboards", DashboardRepo.findAll());
        return "dashboard";
    }    

}
