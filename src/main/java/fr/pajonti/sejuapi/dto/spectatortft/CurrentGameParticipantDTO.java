package fr.pajonti.sejuapi.dto.spectatortft;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class CurrentGameParticipantDTO implements RiotDTO {
    private Long championId;
    private PerksDTO perks;
    private Long profileIconId;
    private Long teamId;
    private String summonerName;
    private String summonerId;
    private String puuid;
    private Long spell1Id;
    private Long spell2Id;
    private List<GameCustomizationObjectDTO> gameCustomizationObjects;
}

