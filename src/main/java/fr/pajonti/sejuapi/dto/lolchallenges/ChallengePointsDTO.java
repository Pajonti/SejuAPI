package fr.pajonti.sejuapi.dto.lolchallenges;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class ChallengePointsDTO implements RiotDTO {
    private String level;
    private Integer current;
    private Integer max;
    private Float percentile;
}
