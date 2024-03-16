package fr.pajonti.sejuapi.dto.spectatortft;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.tft.TFTGameMode;
import fr.pajonti.sejuapi.enums.tft.TFTGameType;
import fr.pajonti.sejuapi.enums.tft.TFTQueueID;
import lombok.Data;

import java.util.List;

@Data
public class FeaturedGameInfoDTO implements RiotDTO {
    private TFTGameMode gameMode;
    private Long gameLength;
    private Long mapId;
    private TFTGameType gameType;
    private List<BannedChampionDTO> bannedChampions;
    private Long gameId;
    private ObserverDTO observers;
    private TFTQueueID gameQueueConfigId;
    private List<ParticipantDTO> participants;
    private String platformId;
}

