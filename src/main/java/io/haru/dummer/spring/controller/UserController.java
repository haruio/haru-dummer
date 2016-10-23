package io.haru.dummer.spring.controller;

import io.haru.dummer.spring.domain.dto.UserDto;
import io.haru.dummer.spring.domain.master.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Justin Park (asterisk@makeus.com)
 * @since 2016-10-18
 */
@RestController
@RequestMapping(value = "/v1/users")
public class UserController {
    @RequestMapping(
        method = RequestMethod.PUT,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object join(@RequestBody UserDto userDto) {

        // TODO: implement
        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.GET)
    public Object getMe(@PathVariable String userId) {

        // TODO: implement
        User user = null;
        return user;
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.POST)
    public Object updateUser(@PathVariable String userId) {

        // TODO: implement
        User user = null;
        return user;
    }

    @RequestMapping(value = "/me", method = RequestMethod.GET)
    public Object getMe() {

        // TODO: implement
        User user = null;
        return user;
    }

    @RequestMapping(value = "/me", method = RequestMethod.POST)
    public Object updateMe() {
        // TODO: implement
        User user = null;
        return user;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login() {
        // TODO: implement
        User user = null;
        return user;
    }

    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public Object logout() {
        // TODO: implement
        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
    }
}
