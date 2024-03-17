package fr.pajonti.sejuapi.dto.tftmatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.tft.TFTQueueID;
import lombok.Data;

import java.util.List;

@Data
public class ParticipantDTO implements RiotDTO {
    private CompanionDTO companion;
    private Integer gold_left;
    private Integer last_round;
    private Integer level;
    private Integer placement;
    private Integer players_eliminated;
    private String puuid;
    private Float time_eliminated;
    private Integer total_damage_to_players;
    private List<TraitsDTO> traits;
    private List<UnitDTO> units;
}
