package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class TeamDTO implements RiotDTO {
    private List<BanDTO> bans;
    private ObjectivesDTO objectives;
    private Integer teamId;
    private Boolean win;
}
