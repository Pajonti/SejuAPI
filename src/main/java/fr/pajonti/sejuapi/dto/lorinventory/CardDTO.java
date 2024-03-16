package fr.pajonti.sejuapi.dto.lorinventory;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class CardDTO implements RiotDTO {
    private String code;
    private String count;
}
