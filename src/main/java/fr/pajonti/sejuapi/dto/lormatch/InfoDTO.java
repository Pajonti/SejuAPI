package fr.pajonti.sejuapi.dto.lormatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.lor.GameMode;
import fr.pajonti.sejuapi.enums.lor.GameType;
import lombok.Data;

import java.util.List;

@Data
public class InfoDTO implements RiotDTO {
    private GameMode game_mode;
    private GameType game_type;
    private String game_start_time_utc;
    private String game_version;
    private String game_format;
    private List<PlayerDTO> players;
    /**
     * Total turns taken by both players.
     */
    private Integer total_turn_count;
}
