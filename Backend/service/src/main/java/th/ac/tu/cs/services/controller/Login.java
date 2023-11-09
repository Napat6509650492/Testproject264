package th.ac.tu.cs.services.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import th.ac.tu.cs.services.model.Login.UserPassword;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/auth")
public class Login {
    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    @Autowired
    public Login(RestTemplate restTemplate, ObjectMapper objectMapper) {
        this.restTemplate = restTemplate;

        this.objectMapper = objectMapper;
    }

    @PostMapping("/")
    public ResponseEntity<Object> login(@RequestBody UserPassword userPass){
            String url = "https://restapi.tu.ac.th/api/v1/auth/Ad/verify";
            String token = "TUa026226293c65b5b8cae84477231b93c83368a7d7e1aebdc2bc885fe4f1209fca3fb9af0d9dfe4710dbc7fcdc0c6ffe4";

            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Application-Key", token);
            HttpEntity<UserPassword> entity = new HttpEntity<>(userPass,headers);
            try{
                ResponseEntity<Object> res = restTemplate.postForEntity(url,entity, Object.class);
                return ResponseEntity
                        .status(res.getStatusCode())
                        .body(res.getBody());
            }catch (HttpClientErrorException e) {
                String errorResponse = e.getResponseBodyAsString();
                return ResponseEntity
                        .status(e.getStatusCode())
                        .body(errorResponse);
            } catch (RestClientException e) {
                System.out.println(e.getMessage());
                return ResponseEntity
                        .status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body("An error occurred while trying to login.");
            }
    }
}
