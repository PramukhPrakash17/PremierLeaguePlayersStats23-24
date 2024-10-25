package com.pramukh.footballplayersinfo.Service;

import com.pramukh.footballplayersinfo.Model.footballplayer;
import com.pramukh.footballplayersinfo.Repository.footballplayerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class footballplayerservice {

    @Autowired
    private footballplayerrepo repo;

    public List<footballplayer> getallplayer() {
        System.out.println("Entered Service");
        return repo.findAll();
    }
}
