package fr.pajonti.sejuapi.dto.lorranked;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class PlayerDTO implements RiotDTO {
    private String name;
    private Integer rank;
    private Integer lp;
}
