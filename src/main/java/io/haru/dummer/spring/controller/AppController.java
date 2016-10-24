package io.haru.dummer.spring.controller;

import io.haru.dummer.spring.domain.dto.AppDto;
import io.haru.dummer.spring.domain.master.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Justin Park (asterisk@makeus.com)
 * @since 2016-10-22
 */
@RestController
@RequestMapping(value = "/v1/apps")
public class AppController {
    @RequestMapping(
        method = RequestMethod.PUT,
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Object add(@RequestBody AppDto appDto) {

        // TODO: implement
        return new ResponseEntity<String>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/{appId}", method = RequestMethod.GET)
    public Object getApp(@PathVariable String appId) {

        // TODO: implement
        Client client = null;
        return client;
    }

    @RequestMapping(value = "/{appId}", method = RequestMethod.POST)
    public Object updateApp(@PathVariable String appId) {

        // TODO: implement
        Client client = null;
        return client;
    }

    @RequestMapping(value = "/{appId}/statistics", method = RequestMethod.GET)
    public Object getAppStatistics() {
        // TODO: implement
        return null;
    }

    @RequestMapping(value = "/{appId}/users", method = RequestMethod.GET)
    public Object getAppUsers() {
        // TODO: implement
        return null;
    }
}
