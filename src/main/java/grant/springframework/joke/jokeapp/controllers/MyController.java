package grant.springframework.joke.jokeapp.controllers;

import grant.springframework.joke.jokeapp.Services.JokeService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private JokeService jokeService;

    public MyController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    public String sayJoke(){
        return jokeService.createRandomQuote();
    }


}
