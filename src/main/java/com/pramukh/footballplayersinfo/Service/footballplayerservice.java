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


    public List<footballplayer> getplayerbyname(String name) {
        return repo.findAll().stream().filter((player->player.getPlayer_name().trim().toLowerCase().contains(name.toLowerCase()))).toList();
    }

    public List<footballplayer> getplayerbyteam(String team) {
        return repo.findAll().stream().filter((player->player.getTeam().trim().toLowerCase().contains(team.toLowerCase()))).toList();
    }

//    public List<footballplayer> getplayerbynation(String nation)
//    {
//        return repo.findAll().stream().filter(player->player.getNation().trim().toLowerCase().contains(nation.toLowerCase())).toList();
//    }

    public List<footballplayer> getplayerbynation(String nation) {
        return repo.findAll().stream()
                .peek(player -> System.out.println("Nation: " + player.getNation()))  // Log each player's nation
                .filter(player -> player.getNation() != null && player.getNation().trim().toLowerCase().contains(nation.toLowerCase()))
                .toList();
    }


    public List<footballplayer> getplayerbyposition(String position)
    {
        return repo.findAll().stream().filter(player->player.getPos().trim().toLowerCase().contains(position.toLowerCase())).toList();
    }

    public List<footballplayer> getplayerbyage(int age) {
        return repo.findAll().stream().filter(player->player.getAge()<age).toList();
    }

    public List<footballplayer> getplayerbygoals(int goals) {
        return repo.findAll().stream().filter(player->player.getGls()==goals).toList();
    }

    public void updateplayer(footballplayer player) {
        repo.save(player);
    }
    public void deleteplayer(footballplayer player){
        repo.delete(player);
    }
}
