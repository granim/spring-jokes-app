package grant.springframework.joke.jokeapp.Model;


import grant.springframework.joke.jokeapp.Services.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class ConstructJoke implements JokeService {

    ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String createRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
