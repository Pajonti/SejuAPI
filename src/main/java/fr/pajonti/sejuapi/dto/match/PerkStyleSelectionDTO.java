package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class PerkStyleSelectionDTO implements RiotDTO {
    private Integer perk;
    private Integer var1;
    private Integer var2;
    private Integer var3;
}
