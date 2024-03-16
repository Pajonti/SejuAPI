package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class ObjectiveDTO implements RiotDTO {
    private Boolean first;
    private Integer kills;
}
