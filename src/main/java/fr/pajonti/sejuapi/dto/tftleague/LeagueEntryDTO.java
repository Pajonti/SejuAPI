package fr.pajonti.sejuapi.dto.tftleague;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.tft.TFTQueue;
import fr.pajonti.sejuapi.enums.tft.TFTRatedTier;
import lombok.Data;

@Data
public class LeagueEntryDTO implements RiotDTO {
    private String puuid;
    private String leagueId;
    private String summonerId;
    private String summonerName;
    private TFTQueue queueType;
    private TFTRatedTier ratedTier;
    private Integer ratedRating;
    private String tier;
    private String rank;
    private Integer leaguePoints;
    private Integer wins;
    private Integer losses;
    private Boolean hotStreak;
    private Boolean veteran;
    private Boolean freshBlood;
    private Boolean inactive;
    private MiniSeriesDTO miniSeries;
}
