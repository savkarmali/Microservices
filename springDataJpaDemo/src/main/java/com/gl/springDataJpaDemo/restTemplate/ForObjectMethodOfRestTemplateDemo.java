package com.gl.springDataJpaDemo.restTemplate;

import com.gl.springDataJpaDemo.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ForObjectMethodOfRestTemplateDemo {

    private Logger logger = LoggerFactory.getLogger(ForObjectMethodOfRestTemplateDemo.class);
    private RestTemplate restTemplate = new RestTemplate();
    private String baseUrl = "http://localhost:8083/springDataJpaDemo/";

    public void driverMethod(){
        System.out.println("*********** forObject() method demo ***********");
        getListObject();
    //    getSingleObject();
    //    addUser();
    }
    private void getListObject() {
        String url = baseUrl + "/users";
        List userDetails = restTemplate.getForObject(url, List.class);
        logger.info("response body - " + userDetails);
    }
    private void getSingleObject() {
        String url = baseUrl + "/user/2";
        String user = restTemplate.getForObject(url, String.class);
        logger.info("User - " + user);
    }
    private void addUser() {
        String url = baseUrl + "/user";
        User user = new User();
        user.setFirstName("Green");
        user.setLastName("Learner");
        user.setGender("M");
        user.setAddress("Pune");
        String response = restTemplate.postForObject(url, user, String.class);

        logger.info("response - " + response);
    }
}
