package com.gl.springDataJpaDemo.restTemplate;

import com.gl.springDataJpaDemo.dto.User;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

public class ForEntityMethodOfRestTemplateDemo {

    RestTemplate restTemplate= new RestTemplate();
    private String baseUrl = "http://localhost:8083/springDataJpaDemo/";

    public void driverMethod(){
        System.out.println("*********** forEntity() methods demo ***********");
        getListObject();
    //    getSingleObject();
    //    addUser();
    //    deleteUser();
    //    updateUser();
    }
    private void getListObject() {
        String url = baseUrl + "/users";
        ResponseEntity<List> user = restTemplate.getForEntity(url, List.class);
        HttpStatus statusCode = user.getStatusCode();
        System.out.println("status code - " + statusCode);
        List<Object> userDetails = user.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = user.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }
    private void getSingleObject() {
        String url = baseUrl + "/user/3";
        ResponseEntity<String> user = restTemplate.getForEntity(url, String.class);
        HttpStatus statusCode = user.getStatusCode();
        System.out.println("status code - " + statusCode);
        String userDetails = user.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = user.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
    }

    private void addUser() {
        String url = baseUrl + "/user";
        User user = new User();
        user.setFirstName("G");
        user.setLastName("L");
        user.setGender("M");
        user.setAddress("Mumbai");
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, user, String.class);

        HttpStatus statusCode = responseEntity.getStatusCode();
        System.out.println("status code - " + statusCode);
        String userDetails = responseEntity.getBody();
        System.out.println("response body - " + userDetails);
        HttpHeaders responseHeaders = responseEntity.getHeaders();
        System.out.println("response Headers - " + responseHeaders);
        URI uri = restTemplate.postForLocation(url, user, String.class);
        System.out.println("uri - " + uri);
    }

    private void deleteUser(){
        String url = baseUrl + "/user/13";
        restTemplate.delete(url);
        System.out.println("User deleted");
    }
    private void updateUser(){
        String url = baseUrl + "/updateAddress/14/USA";
        restTemplate.put(url, null);
        System.out.println("User updates");
    }
}
