package fr.pajonti.sejuapi.dto.tftmatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class CompanionDTO implements RiotDTO {
    private String content_ID;
    private Integer item_ID;
    private Integer skin_ID;
    private String species;
}
