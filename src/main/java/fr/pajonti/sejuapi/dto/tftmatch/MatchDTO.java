package fr.pajonti.sejuapi.dto.tftmatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class MatchDTO implements RiotDTO {
    private MetadataDTO metadata;
    private InfoDTO info;
}
