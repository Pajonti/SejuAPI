package fr.pajonti.sejuapi.dto.lormatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class MatchDTO implements RiotDTO {
    /**
     * Match metadata.
     */
    private MetadataDTO metadataDTO;
    /**
     * Match info.
     */
    private InfoDTO info;
}
