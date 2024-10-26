package com.pramukh.footballplayersinfo.Controller;

import com.pramukh.footballplayersinfo.Model.footballplayer;
import com.pramukh.footballplayersinfo.Service.footballplayerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class footballplayercontroller {

    @Autowired
    private footballplayerservice service;

    @GetMapping("/getallplayer")
    public List<footballplayer> getallplayer() {
        System.out.println("Entered");
        return service.getallplayer();
    }

    @GetMapping("/getplayerbyname")
    public List<footballplayer> getPlayerByName(String name) {
        return service.getplayerbyname(name);
    }

    @GetMapping("/getplayerbyteam")
    public List<footballplayer> getPlayerByTeam(String team) {
        return service.getplayerbyteam(team);
    }

    @GetMapping("/getplayerbynation")
    public List<footballplayer> getPlayerByNation(String nation) {
        return service.getplayerbynation(nation);
    }

    @GetMapping("/getplayersbyposition")
    public List<footballplayer> getPlayerByPosition(String position) {
        return service.getplayerbyposition(position);
    }

    @GetMapping("/getplayerbyage")
    public List<footballplayer> getplayerByAge(int age) {
        return service.getplayerbyage(age);
    }

    @GetMapping("/getplayerbygoals")
    public List<footballplayer> getplayerByGoals(int goals) {
        return service.getplayerbygoals(goals);
    }

    @PutMapping("/updateplayerinfo")
    public String updatePlayerInfo(@RequestBody footballplayer player) {
        service.updateplayer(player);
        return "Successfully updated";
    }

    @DeleteMapping("/deleteplayer")
    public String deleteplayer(@RequestBody footballplayer player)
    {
        service.deleteplayer(player);
        return "Deleted";
    }
}