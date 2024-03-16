package fr.pajonti.sejuapi.dto.spectator;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class PerksDTO implements RiotDTO {
    private List<Long> perkIds;
    private Long perkStyle;
    private Long perkSubStyle;
}

