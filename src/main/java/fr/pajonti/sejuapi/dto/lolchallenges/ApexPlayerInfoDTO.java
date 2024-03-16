package fr.pajonti.sejuapi.dto.lolchallenges;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.Locale;
import java.util.Map;

@Data
public class ApexPlayerInfoDTO implements RiotDTO {
    private String puuid;
    private Double value;
    private Integer position;
}
