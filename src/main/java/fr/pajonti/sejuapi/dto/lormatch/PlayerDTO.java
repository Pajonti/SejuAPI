package fr.pajonti.sejuapi.dto.lormatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class PlayerDTO implements RiotDTO {
    private String puuid;
    private String deck_id;
    private String deck_code;
    private List<String> factions;
    private String game_outcome;
    private Integer order_of_play;
}
