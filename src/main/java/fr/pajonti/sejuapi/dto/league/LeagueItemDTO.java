package fr.pajonti.sejuapi.dto.league;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.dto.shared.MiniSeriesDTO;
import fr.pajonti.sejuapi.enums.league.LeagueTier;
import lombok.Data;

@Data
public class LeagueItemDTO implements RiotDTO {
    private Boolean freshBlood;
    /**
     * Winning team on Summoners Rift.
     */
    private Integer wins;
    private String summonerName;
    private MiniSeriesDTO miniSeries;
    private Boolean inactive;
    private Boolean veteran;
    private LeagueTier rank;
    private Integer leaguePoints;
    /**
     * Losing team on Summoners Rift.
     */
    private Integer losses;
    /**
     * Player's encrypted summonerId.
     */
    private String summonerId;
}
