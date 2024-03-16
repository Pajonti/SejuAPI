package fr.pajonti.sejuapi.dto.spectator;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.LeagueGameMode;
import fr.pajonti.sejuapi.enums.league.LeagueGameType;
import fr.pajonti.sejuapi.enums.league.LeagueQueueID;
import lombok.Data;

import java.util.List;

@Data
public class FeaturedGameInfoDTO implements RiotDTO {
    private LeagueGameMode gameMode;
    private Long gameLength;
    private Long mapId;
    private LeagueGameType gameType;
    private List<BannedChampionDTO> bannedChampions;
    private Long gameId;
    private ObserverDTO observers;
    private LeagueQueueID gameQueueConfigId;
    private List<ParticipantDTO> participants;
    private String platformId;
}

