package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.*;
import lombok.Data;

import java.util.List;

@Data
public class InfoDTO implements RiotDTO {
    /**
     * Unix timestamp for when the game is created on the game server (i.e., the loading screen).
     */
    private Long gameCreation;
    /**
     * Prior to patch 11.20, this field returns the game length in milliseconds calculated from gameEndTimestamp - gameStartTimestamp.
     * Post patch 11.20, this field returns the max timePlayed of any participant in the game in seconds,
     * which makes the behavior of this field consistent with that of match-v4.
     * The best way to handling the change in this field is to treat the value as milliseconds if the
     * gameEndTimestamp field isn't in the response and to treat the value as seconds if gameEndTimestamp is in the response.
     */
    private Long gameDuration;
    /**
     * Unix timestamp for when match ends on the game server.
     * This timestamp can occasionally be significantly longer than when the match "ends".
     * The most reliable way of determining the timestamp for the end of the match would be to add the max
     * time played of any participant to the gameStartTimestamp.
     * This field was added to match-v5 in patch 11.20 on Oct 5th, 2021.
     */
    private Long gameEndTimestamp;
    private Long gameId;
    /**
     * Refer to the Game Constants documentation.
     */
    private LeagueGameMode gameMode;
    private String gameName;
    /**
     * Unix timestamp for when match starts on the game server.
     */
    private Long gameStartTimestamp;
    /**
     * Refer to the Game Constants documentation.
     */
    private LeagueGameType gameType;
    /**
     * The first two parts can be used to determine the patch a game was played on.
     */
    private String gameVersion;
    /**
     * Refer to the Game Constants documentation.
     */
    private LeagueGameMap mapId;
    private List<ParticipantDTO> participants;
    private String platformId;
    private LeagueQueueID queueId;
    private List<TeamDTO> teams;
    private String tournamentCode;
}
