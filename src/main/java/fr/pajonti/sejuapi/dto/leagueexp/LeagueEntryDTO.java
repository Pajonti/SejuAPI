package fr.pajonti.sejuapi.dto.leagueexp;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.LeagueDivision;
import fr.pajonti.sejuapi.enums.league.LeagueTier;
import fr.pajonti.sejuapi.enums.league.Position;
import fr.pajonti.sejuapi.enums.league.LeagueQueue;
import lombok.Data;

@Data
public class LeagueEntryDTO implements RiotDTO {
    private String leagueId;
    /**
     * Player's summonerId (Encrypted)
     */
    private String summonerId;
    private Position summonerName;
    private LeagueQueue queueType;
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
