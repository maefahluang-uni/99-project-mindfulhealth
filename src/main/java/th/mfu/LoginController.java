package th.mfu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {
    @Autowired
    LoginRepository LoginRepo;

    @Autowired
    DashboardRepository DashboardRepo;

    @GetMapping("/login")
    public String listConcerts(Model model) {
        model.addAttribute("concerts", LoginRepo.findAll());
        return "login";
    }
}