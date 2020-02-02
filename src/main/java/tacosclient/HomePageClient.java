package tacosclient;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class HomePageClient {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080", String.class);
        System.out.println(response);
    }
}
