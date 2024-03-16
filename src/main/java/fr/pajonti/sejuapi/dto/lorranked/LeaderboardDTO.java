package fr.pajonti.sejuapi.dto.lorranked;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;
import fr.pajonti.sejuapi.dto.lorranked.PlayerDTO;

import java.util.List;

@Data
public class LeaderboardDTO implements RiotDTO {
    /**
     * A list of players in Master tier.
     */
    private List<PlayerDTO> players;
}
