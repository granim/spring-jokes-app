package grant.springframework.joke.jokeapp.controllers;

import grant.springframework.joke.jokeapp.Services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    //Spring will autowire the bean
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping("/jokes")
    public String sayJoke(Model model) {
        model.addAttribute("Jokes", jokeService.createRandomQuote());
        return "jokes";
    }



}
