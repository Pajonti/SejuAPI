package fr.pajonti.sejuapi.dto.shared;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class MiniSeriesDTO implements RiotDTO {
    private Integer losses;
    private String progress;
    private Integer target;
    private Integer wins;
}
