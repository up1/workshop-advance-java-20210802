package com.example.workshopdip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdController {

    @GetMapping("/id")
    public IdResponse generateId() {
        return new IdResponse("XYZ7");
    }

}


/*
API
Endpoint : GET /id
response 200
{
    "result": "XYZ7"
}
 */
