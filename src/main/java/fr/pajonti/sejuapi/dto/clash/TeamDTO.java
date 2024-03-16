package fr.pajonti.sejuapi.dto.clash;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class TeamDTO implements RiotDTO {
    private String id;
    private Integer tournamentId;
    private String name;
    private Integer iconId;
    private Integer tier;
    /**
     * Summoner ID of the team captain.
     */
    private String captain;
    private String abbreviation;
    /**
     * Team members.
     */
    private List<PlayerDTO> players;
}
