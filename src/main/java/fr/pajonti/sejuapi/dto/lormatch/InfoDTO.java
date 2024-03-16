package fr.pajonti.sejuapi.dto.lormatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.lor.LorGameMode;
import fr.pajonti.sejuapi.enums.lor.LorGameType;
import lombok.Data;

import java.util.List;

@Data
public class InfoDTO implements RiotDTO {
    private LorGameMode game_mode;
    private LorGameType game_type;
    private String game_start_time_utc;
    private String game_version;
    private String game_format;
    private List<PlayerDTO> players;
    /**
     * Total turns taken by both players.
     */
    private Integer total_turn_count;
}
