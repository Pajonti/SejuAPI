package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class BanDTO implements RiotDTO {
    private Integer championId;
    private Integer pickTurn;
}
