package fr.pajonti.sejuapi.dto.tftmatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class MetadataDTO implements RiotDTO {
    private String data_version;
    private String match_id;
    private List<String> participants;
}
