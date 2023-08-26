package com.inderjeet.SpringGrafanaDemoApplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrafanaTest {

    @PostMapping(value = "/postGrafana")
    public String grafanaTestPost() {
        return "GrafanaTest POST working Fine";
    }

    @GetMapping(value = "/getGrafana")
    public String grafanaTestGet() {
        return "GrafanaTest GET working Fine";
    }
}
