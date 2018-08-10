package guru.springframework.joke.controller;

import guru.springframework.joke.services.JokesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private JokesService jokes;

    public JokesController(JokesService jokes) {
        this.jokes = jokes;
    }

    @RequestMapping("/")
    public String showJoke(Model model){

        model.addAttribute("joke", jokes.getJoke());

        return "chucknorris";
    }
}
