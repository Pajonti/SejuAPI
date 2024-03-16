package fr.pajonti.sejuapi.dto.summoner;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class SummonerDTO implements RiotDTO {
    private String accountId;
    private Integer profileIconId;
    private Long revisionDate;
    private String name;
    private String id;
    private String puuid;
    private Long summonerLevel;
}

