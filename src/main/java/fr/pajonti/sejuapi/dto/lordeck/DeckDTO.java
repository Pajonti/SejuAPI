package fr.pajonti.sejuapi.dto.lordeck;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class DeckDTO implements RiotDTO {
    private String id;
    private String name;
    private String code;
}
