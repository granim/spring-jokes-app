package grant.springframework.joke.jokeapp.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ConstructJoke implements JokeService {

    

    @Override
    public String createRandomQuote() {
        return "we will figure this out";
    }

}
