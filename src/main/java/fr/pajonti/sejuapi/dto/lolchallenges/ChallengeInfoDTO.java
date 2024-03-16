package fr.pajonti.sejuapi.dto.lolchallenges;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class ChallengeInfoDTO implements RiotDTO {
    private Integer challengeId;
    private Float percentile;
    private String level;
    private Integer value;
    private Long achievedTime;
}
