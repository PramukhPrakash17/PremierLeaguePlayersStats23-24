package com.pramukh.footballplayersinfo.Repository;

import com.pramukh.footballplayersinfo.Model.footballplayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface footballplayerrepo extends JpaRepository<footballplayer, Integer> {
}
