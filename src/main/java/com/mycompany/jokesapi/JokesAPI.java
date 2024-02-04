package com.mycompany.jokesapi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;



/**
 *
 * @author saraabukhalaf
 */

@SpringBootApplication
public class JokesAPI {
    
    /**
     *
     * @param args
     */
    
    public static void main(String[] args) {
        SpringApplication.run(JokesAPI.class, args);
        getaRandomJoke();
    }

    public static void getaRandomJoke() {
        try {
            String apiUrl = "https://v2.jokeapi.dev/joke/Any";
            RestTemplate restTemplate = new RestTemplate();

            String jsonResponse = restTemplate.getForObject(apiUrl, String.class);

            System.out.println("Random Jokes API Response:\n" + jsonResponse);

        } catch (RestClientException e) {
            System.out.println("Error in getaRandomJoke");
        }
    }
}