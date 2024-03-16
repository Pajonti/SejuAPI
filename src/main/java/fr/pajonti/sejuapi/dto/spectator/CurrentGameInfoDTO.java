package fr.pajonti.sejuapi.dto.spectator;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.LeagueGameMap;
import fr.pajonti.sejuapi.enums.league.LeagueGameMode;
import fr.pajonti.sejuapi.enums.league.LeagueGameType;
import fr.pajonti.sejuapi.enums.tft.TFTQueueID;
import lombok.Data;

import java.util.List;

@Data
public class CurrentGameInfoDTO implements RiotDTO {
    private Long gameId;
    private LeagueGameType gameType;
    private Long gameStartTime;
    private LeagueGameMap mapId;
    private Long gameLength;
    private String platformId;
    private LeagueGameMode gameMode;
    private List<BannedChampionDTO> bannedChampions;
    private TFTQueueID gameQueueConfigId;
    private ObserverDTO observers;
    private List<CurrentGameParticipantDTO> participants;
}
