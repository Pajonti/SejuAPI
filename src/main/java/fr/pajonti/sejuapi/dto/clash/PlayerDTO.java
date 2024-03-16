package fr.pajonti.sejuapi.dto.clash;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.LanePosition;
import fr.pajonti.sejuapi.enums.league.TeamRole;
import lombok.Data;

@Data
public class PlayerDTO implements RiotDTO {
    private String summonerId;
    private String teamId;
    private LanePosition position;
    private TeamRole role;
}
