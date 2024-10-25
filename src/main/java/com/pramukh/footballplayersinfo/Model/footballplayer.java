package com.pramukh.footballplayersinfo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Entity
@Component
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "football_players")
public class footballplayer {
    @Id
    private int id;
    private String name;
    private String fullname;
    private LocalDate dob;
    private String positions;
    private int rating;
    private int potential;
    private long value_euros;
    private String preffered_foot;
    private String nationality;
}
