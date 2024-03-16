package fr.pajonti.sejuapi.dto.spectatortft;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class GameCustomizationObjectDTO implements RiotDTO {
    private String category;
    private String content;
}

