package com.gl.springDataJpaDemo.restTemplate;

import com.gl.springDataJpaDemo.dto.User;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

public class ForExchangeMethodOfRestTemplateDemo {

    static RestTemplate restTemplate = new RestTemplate();
    static String baseUrl = "http://localhost:8083/springDataJpaDemo/";

    public void useExchangeMethodsOfRestTemplate() {

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> requestEntity = new HttpEntity<>(headers);

        System.out.println("*********** forExchange() method demo ***********");
        getListUserByExchangeMethod(requestEntity);
        //	getSingleUserByExchangeMethod(requestEntity);
        //	addUserByExchangeMethod(requestEntity);
        //	updateUserByExchangeMethod(requestEntity);
        //	deleteUserByExchangeMethod(requestEntity);
    }
    private  void getListUserByExchangeMethod(HttpEntity<Object> requestEntity) {
        ResponseEntity<List> responseEntity = restTemplate.exchange(baseUrl + "users",
                HttpMethod.GET,
                requestEntity,
                List.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        List user = responseEntity.getBody();
        System.out.println("response body - " + user);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }
    private  void getSingleUserByExchangeMethod(HttpEntity<Object> requestEntity) {
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl + "user/3",
                HttpMethod.GET,
                requestEntity,
                String.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        String user = responseEntity.getBody();
        System.out.println("response body - " + user);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);

        ResponseEntity<User> responseUser = restTemplate.exchange(baseUrl + "user/3",
                HttpMethod.GET,
                requestEntity,
                User.class);
        User userBody = responseUser.getBody();
        System.out.println("user object - " + userBody);
    }
    private  void addUserByExchangeMethod(HttpEntity<User> requestEntity) {
        ResponseEntity<User> responseEntity = restTemplate.exchange(baseUrl + "user",
                HttpMethod.POST,
                requestEntity,
                User.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        User userDetails = responseEntity.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }
    private  void updateUserByExchangeMethod(HttpEntity<Object> requestEntity) {
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl + "updateAddress/2/Delhi",
                HttpMethod.PUT,
                requestEntity,
                String.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        String userDetails = responseEntity.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }
    private  void deleteUserByExchangeMethod(HttpEntity<Object> requestEntity) {
        ResponseEntity<String> responseEntity = restTemplate.exchange(baseUrl + "user/6",
                HttpMethod.DELETE,
                requestEntity,
                String.class);
        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        String userDetails = responseEntity.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }
}
