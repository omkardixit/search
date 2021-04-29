package com.example.search.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/search")
public class SearchController {

    @RequestMapping(value = "/mentor", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity searchMentor() {

        return ResponseEntity.ok("Found Mentors");
    }
}
