package net.ruixin.oauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mxding
 * @date 2020-11-02 8:24
 */
@RestController
public class MainController {

    /**
     * dev11
     * @return
     */
    @RequestMapping({"/", "/hello"})
    public String hello() { return "hello world!!"; }
}
