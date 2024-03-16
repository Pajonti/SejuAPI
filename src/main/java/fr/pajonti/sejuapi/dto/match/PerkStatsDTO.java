package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class PerkStatsDTO implements RiotDTO {
    private Integer defense;
    private Integer flex;
    private Integer offense;
}
