package fr.pajonti.sejuapi.dto.shared;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.*;
import lombok.Data;

@Data
public class LeagueEntryDTO implements RiotDTO {
    private String leagueId;
    /**
     * Player's summonerId (Encrypted)
     */
    private String summonerId;
    private Position summonerName;
    private Queue queueType;
    private LeagueTier tier;
    /**
     * The player's division within a tier.
     */
    private LeagueDivision rank;
    private Integer leaguePoints;
    /**
     * Winning team on Summoners Rift. First placement in Teamfight Tactics.
     */
    private Integer wins;
    /**
     * Losing team on Summoners Rift. Second through eighth placement in Teamfight Tactics.
     */
    private Integer losses;
    private Boolean hotStreak;
    private Boolean veteran;
    private Boolean freshBlood;
    private Boolean inactive;
    private MiniSeriesDTO miniSeries;
}
