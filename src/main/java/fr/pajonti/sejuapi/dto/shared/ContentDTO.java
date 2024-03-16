package fr.pajonti.sejuapi.dto.shared;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.shared.Locale;
import lombok.Data;

@Data
public class ContentDTO implements RiotDTO {
    private Locale locale;
    private String content;
}

