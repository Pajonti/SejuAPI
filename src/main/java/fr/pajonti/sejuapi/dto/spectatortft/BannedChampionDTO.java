package fr.pajonti.sejuapi.dto.spectatortft;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class BannedChampionDTO implements RiotDTO {
    /**
     * The turn during which the champion was banned
     */
    private Integer pickTurn;
    /**
     * The ID of the banned champion
     */
    private Long championId;
    /**
     * The ID of the team that banned the champion
     */
    private Long teamId;
}

