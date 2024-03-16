package fr.pajonti.sejuapi.dto.shared;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class PerksDTO implements RiotDTO {
    /**
     * IDs of the perks/runes assigned.
     */
    private List<Long> perkIds;

    /**
     * Primary runes path
     */
    private Long perkStyle;

    /**
     * Secondary runes path
     */
    private Long perkSubStyle;
}

