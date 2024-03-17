package fr.pajonti.sejuapi.dto.tftmatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.tft.TFTQueueID;
import lombok.Data;

import java.util.List;

@Data
public class InfoDTO implements RiotDTO {
    private Long game_datetime;
    private Long game_length;
    private String game_variation;
    private String game_version;
    private List<ParticipantDTO> participants;
    private TFTQueueID queue_id;
    private Integer tft_set_number;
}
