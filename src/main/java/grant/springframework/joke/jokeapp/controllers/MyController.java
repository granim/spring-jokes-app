package grant.springframework.joke.jokeapp.controllers;

import grant.springframework.joke.jokeapp.Services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    private JokeService jokeService;

    public MyController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping
    public String sayJoke() {
        return jokeService.createRandomQuote();
    }

    @RequestMapping("/jokes")
    public String sayJoke(Model model) {
        model.addAttribute("jokes", jokeService.createRandomQuote());
        return "jokes";
    }



}
