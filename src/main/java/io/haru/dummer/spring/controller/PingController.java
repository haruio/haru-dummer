package io.haru.dummer.spring.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Justin Park (aka.asterisk@gmail.com)
 * @since 2016-09-02
 */
@RestController
public class PingController {

    @ResponseStatus(code = HttpStatus.OK)
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() {
        return "pong";
    }

}
