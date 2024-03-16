package fr.pajonti.sejuapi.dto.lormatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class MetadataDTO implements RiotDTO {
    /**
     * Match data version.
     */
    private String data_version;
    /**
     * Match id.
     */
    private String match_id;
    /**
     * A list of participant PUUIDs.
     */
    private List<String> participants;
}
