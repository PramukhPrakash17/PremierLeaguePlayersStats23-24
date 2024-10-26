package com.pramukh.footballplayersinfo.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;



@Entity
@Table(name = "Premier-League-Players-Stats-23/24")
public class footballplayer {
    @Id
    private int id;
    @Column(name = "Player")
    private String player_name;
    private String nation;
    private String pos;
    private int age;
    private int matches_played;
    private int starts;
    private int minutes_played;
    private double minutes90s;
    private int gls;
    private int ast;
    private int gPlusA;
    private int gMinusPenalty;
    private int penaltyKick;
    private int penaltyAttempted;
    private int yellowCard;
    private int redCard;
    private String team;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlayer_name() {

        return player_name;
    }

    public void setPlayer_name(String player_name) {
        this.player_name = player_name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMatches_played() {
        return matches_played;
    }

    public void setMatches_played(int matches_played) {
        this.matches_played = matches_played;
    }

    public int getStarts() {
        return starts;
    }

    public void setStarts(int starts) {
        this.starts = starts;
    }

    public int getMinutes_played() {
        return minutes_played;
    }

    public void setMinutes_played(int minutes_played) {
        this.minutes_played = minutes_played;
    }

    public double getMinutes90s() {
        return minutes90s;
    }

    public void setMinutes90s(double minutes90s) {
        this.minutes90s = minutes90s;
    }

    public int getGls() {
        return gls;
    }

    public void setGls(int gls) {
        this.gls = gls;
    }

    public int getAst() {
        return ast;
    }

    public void setAst(int ast) {
        this.ast = ast;
    }

    public int getgPlusA() {
        return gPlusA;
    }

    public void setgPlusA(int gPlusA) {
        this.gPlusA = gPlusA;
    }

    public int getgMinusPenalty() {
        return gMinusPenalty;
    }

    public void setgMinusPenalty(int gMinusPenalty) {
        this.gMinusPenalty = gMinusPenalty;
    }

    public int getPenaltyKick() {
        return penaltyKick;
    }

    public void setPenaltyKick(int penaltyKick) {
        this.penaltyKick = penaltyKick;
    }

    public int getPenaltyAttempted() {
        return penaltyAttempted;
    }

    public void setPenaltyAttempted(int penaltyAttempted) {
        this.penaltyAttempted = penaltyAttempted;
    }

    public int getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }

    public int getRedCard() {
        return redCard;
    }

    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
