package th.mfu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import th.mfu.domain.Login;

@Controller
public class LoginController {

    private final Login loginService;

    @Autowired
    public LoginController(Login loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Validate the login credentials
        if (loginService.isValidLogin(username, password)) {
            // Successful login
            return "redirect:/home"; // Redirect to home page or any other desired page
        } else {
            // Failed login
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }
    }
}
