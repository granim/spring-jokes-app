package grant.springframework.joke.jokeapp.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class ConstructJoke implements JokeService {

     private final ChuckNorrisQuotes chuckNorrisQuotes;

     public ConstructJoke(){
         this.chuckNorrisQuotes = new ChuckNorrisQuotes();
     }

    @Override
    public String createRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
