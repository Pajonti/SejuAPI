package fr.pajonti.sejuapi.dto.clash;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.Position;
import fr.pajonti.sejuapi.enums.league.Role;
import lombok.Data;

@Data
public class PlayerDTO implements RiotDTO {
    private String summonerId;
    private String teamId;
    private Position position;
    private Role role;
}
