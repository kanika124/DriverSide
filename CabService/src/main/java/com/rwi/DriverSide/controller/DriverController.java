package com.rwi.DriverSide.controller;

import com.rwi.DriverSide.implementation.DriverImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {
    @Autowired
    DriverImpl driver;

    //addDriver


    //updateDriver

    //deleteDriver

    //getDriverById

    //getAllDriver
}
