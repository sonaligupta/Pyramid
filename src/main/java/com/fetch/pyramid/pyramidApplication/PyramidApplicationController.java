package com.fetch.pyramid.pyramidApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.io.IOException;

@RestController
public class PyramidApplicationController {

    @Component
    public static class PostConstructExampleBean {

        @Autowired
        private Environment environment;

        @PostConstruct
        public void init() throws IOException {
            System.out.println("Starting Server for Pyramid checking Application.");
        }
    }

    // API Endpoint to return
    @RequestMapping(value="/checkPyramid/{word}", method = RequestMethod.GET)
    public @ResponseBody Word checkPyramidWord(@PathVariable String word) {
        return new Word(word.toLowerCase());
    }



}
