package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class PerkStyleDTO implements RiotDTO {
    private String description;
    private List<PerkStyleSelectionDTO> selections;
    private Integer style;
}
