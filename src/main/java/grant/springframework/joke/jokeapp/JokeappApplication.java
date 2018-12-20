package grant.springframework.joke.jokeapp;

import grant.springframework.joke.jokeapp.controllers.MyController;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JokeappApplication {

    public static void main(String[] args) {

        //SpringApplication.run(JokeappApplication.class, args);


        ApplicationContext ctx = SpringApplication.run(JokeappApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
    //    System.out.println(ctx.getBean(MyController.class).sayJoke());


    }

    

    
    
}

