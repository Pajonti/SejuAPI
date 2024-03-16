package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class PerksDTO implements RiotDTO {
    private PerkStatsDTO statPerks;
    private List<PerkStyleDTO> style;
}
