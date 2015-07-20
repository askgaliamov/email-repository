package com.galiamov.mailrepository;

import java.io.IOException;

import static com.galiamov.mailrepository.EmailRepository.insert;
import static spark.Spark.post;

public class EmailService {

    public static void main(String[] args) throws IOException {

        post("/emails", (req, res) -> {

            String jsonStr = req.body();

            Email email = Email.build(jsonStr);

            int added = insert(email);

            return getResult(added);
        });
    }

    private static String getResult(int result) {
        return "{\"added\":" + result + "}";
    }

}
