package com.pramukh.footballplayersinfo.Controller;

import com.pramukh.footballplayersinfo.Model.footballplayer;
import com.pramukh.footballplayersinfo.Repository.footballplayerrepo;
import com.pramukh.footballplayersinfo.Service.footballplayerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/footballplayers")
public class footballplayercontroller {

    @Autowired
    private footballplayerservice service;

    @GetMapping("/getallplayer")
    public List<footballplayer> getallplayer()
    {
        System.out.println("Entered");
        return service.getallplayer();
    }
}
