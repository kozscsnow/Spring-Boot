package jpa_hibernate.jpa_hibernate.MVC.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Authenticate authenticate;

    public LoginController(Authenticate authenticate) {

        this.authenticate = authenticate;
    }

    @RequestMapping(value="login", method=RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String welcome(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if(authenticate.authenticate(username, password)) {
            model.put("username", username);
            model.put("password", password);
            return "welcome";
        }
        model.put("errorMessage", "Wrong username or password");
        return "login";
    }
}
