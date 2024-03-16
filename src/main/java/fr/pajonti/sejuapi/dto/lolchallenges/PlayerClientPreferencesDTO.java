package fr.pajonti.sejuapi.dto.lolchallenges;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class PlayerClientPreferencesDTO implements RiotDTO {
    private String bannerAccent;
    private String title;
    private List<Integer> challengeIds;
    private String crestBorder;
    private Integer prestigeCrestBorderLevel;
}
