package fr.pajonti.sejuapi.dto.lolchallenges;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.ChallengeCategory;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class PlayerInfoDTO implements RiotDTO {
    private ChallengePointsDTO totalPoints;
    private Map<ChallengeCategory, ChallengePointsDTO> categoryPoints;
    private List<ChallengeInfoDTO> challenges;
    private PlayerClientPreferencesDTO preferences;
}
