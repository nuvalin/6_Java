package com.pl.premier_zone;

import com.pl.premier_zone.player.Player;
import com.pl.premier_zone.player.PlayerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    // Retrieve all players from DB
    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    // Helper to safely check if a field contains search text (case-insensitive)
    private boolean containsIgnoreCase(String field, String searchText) {
        return field != null && searchText != null &&
                field.toLowerCase().contains(searchText.toLowerCase());
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> teamName != null && teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByPos(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> containsIgnoreCase(player.getPos(), searchText))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByNation(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> containsIgnoreCase(player.getNation(), searchText))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position) {
        return playerRepository.findAll().stream()
                .filter(player -> team != null && position != null &&
                        team.equals(player.getTeam()) &&
                        position.equals(player.getPos()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByName(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> containsIgnoreCase(player.getName(), searchText))
                .collect(Collectors.toList());
    }

    // Add a player to DB
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    // Update player
    public Player updatePlayer(Player updatedPlayer) {
        Optional<Player> existingPlayer = playerRepository.findByName(updatedPlayer.getName());

        if (existingPlayer.isPresent()) {
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setName(updatedPlayer.getName());
            playerToUpdate.setTeam(updatedPlayer.getTeam());
            playerToUpdate.setPos(updatedPlayer.getPos());
            playerToUpdate.setNation(updatedPlayer.getNation());

            return playerRepository.save(playerToUpdate);
        }

        return null;
    }

    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.deleteByName(playerName);
    }
}