package com.enjoy.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    /*@GetMapping("/dc")
    public String dc() {
        String services = "Servcies:" + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }*/

    @GetMapping("/dc")
    public String dc() {
        //Thread.sleep(5000L);
        String services = "Servcies:" + discoveryClient.getServices();
        System.out.println(services);
        return services;
    }
}
