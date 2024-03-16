package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class MetadataDTO implements RiotDTO {
    private String dataVersion;
    private String matchId;
    private List<String> participants;
}
