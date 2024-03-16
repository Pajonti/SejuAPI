package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class BanDTO implements RiotDTO {
    private Integer championId;
    private Integer pickTurn;
}
