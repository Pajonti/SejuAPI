package fr.pajonti.sejuapi.dto.shared;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.shared.Locale;
import lombok.Data;

import java.util.List;

@Data
public class PlatformDataDTO implements RiotDTO {
    private String id;
    private String name;
    private List<Locale> locales;
    private List<StatusDTO> maintenances;
    private List<StatusDTO> incidents;
}
