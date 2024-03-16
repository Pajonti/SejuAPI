package fr.pajonti.sejuapi.dto.spectatortft;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.tft.TFTQueueID;
import lombok.Data;

import java.util.List;

@Data
public class CurrentGameInfoDTO implements RiotDTO {
    private Long gameId;
    private String gameType;
    private Long gameStartTime;
    private Long mapId;
    private Long gameLength;
    private String platformId;
    private String gameMode;
    private List<BannedChampionDTO> bannedChampions;
    private TFTQueueID gameQueueConfigId;
    private ObserverDTO observers;
    private List<CurrentGameParticipantDTO> participants;
}
