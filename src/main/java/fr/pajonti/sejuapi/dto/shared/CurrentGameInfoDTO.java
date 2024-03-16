package fr.pajonti.sejuapi.dto.shared;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class CurrentGameInfoDTO implements RiotDTO {
    /**
     * The ID of the game
     */
    private Long gameId;
    /**
     * The game type
     */
    private String gameType;
    /**
     * The game start time represented in epoch milliseconds
     */
    private Long gameStartTime;
    /**
     * The ID of the map
     */
    private Long mapId;
    /**
     * The amount of time in seconds that has passed since the game started
     */
    private Long gameLength;
    /**
     * The ID of the platform on which the game is being played
     */
    private String platformId;
    /**
     * The game mode
     */
    private String gameMode;
    /**
     * Banned champion information
     */
    private List<BannedChampionDTO> bannedChampions;
    /**
     * The queue type (queue types are documented on the Game Constants page)
     */
    private Long gameQueueConfigId;
    /**
     * The observer information
     */
    private ObserverDTO observers;
    /**
     * The participant information
     */
    private List<CurrentGameParticipantDTO> participants;
}

