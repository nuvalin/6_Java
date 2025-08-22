package com.pl.premier_zone.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository // indicates that the interface is a spring data repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    void deleteByName(String playerName); // finds player by name n deletes it


    Optional<Player> findByName(String name);// finds any player by name in repository
}
