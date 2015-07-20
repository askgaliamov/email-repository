package com.galiamov.mailrepository;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Email {

    private static final ObjectMapper mapper = new ObjectMapper();

    private String email;
    private String repository;

    public Email() {
    }

    public String getEmail() {
        return email;
    }

    public String getRepository() {
        return repository;
    }

    static Email build(String body) throws IOException {
        return mapper.readValue(body, Email.class);
    }

}
