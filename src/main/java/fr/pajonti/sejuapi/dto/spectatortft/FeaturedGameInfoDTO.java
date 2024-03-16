package fr.pajonti.sejuapi.dto.spectatortft;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.dto.shared.BannedChampionDTO;
import fr.pajonti.sejuapi.dto.shared.ObserverDTO;
import fr.pajonti.sejuapi.enums.tft.GameMode;
import fr.pajonti.sejuapi.enums.tft.GameType;
import fr.pajonti.sejuapi.enums.tft.QueueID;
import lombok.Data;

import java.util.List;

@Data
public class FeaturedGameInfoDTO implements RiotDTO {
    private GameMode gameMode;
    private Long gameLength;
    private Long mapId;
    private GameType gameType;
    private List<BannedChampionDTO> bannedChampions;
    private Long gameId;
    private ObserverDTO observers;
    private QueueID gameQueueConfigId;
    private List<ParticipantDTO> participants;
    private String platformId;
}

