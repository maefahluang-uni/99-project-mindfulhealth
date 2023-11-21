package th.mfu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import th.mfu.domain.Dashboard;

@Controller
public class DashboardController {

    private final DashboardRepository userRepository;

    @Autowired
    public DashboardController(DashboardRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        String username = "exampleUser"; // Replace with the actual username or retrieve it from the session
        Dashboard user = userRepository.findByUsername(username);

        if (user != null) {
            model.addAttribute("user", user);
        }

        return "dashboard";
    }
}