package fr.pajonti.sejuapi.dto.spectator;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.dto.shared.BannedChampionDTO;
import fr.pajonti.sejuapi.dto.shared.ObserverDTO;
import fr.pajonti.sejuapi.enums.league.GameMode;
import fr.pajonti.sejuapi.enums.league.GameType;
import fr.pajonti.sejuapi.enums.league.QueueID;
import lombok.Data;

import java.util.List;

@Data
public class ParticipantDTO implements RiotDTO {
    private Boolean bot;
    private Long spell2Id;
    private Long profileIconId;
    private String summonerName;
    private String summonerId;
    private String puuid;
    private Long championId;
    private Long teamId;
    private Long spell1Id;
}

