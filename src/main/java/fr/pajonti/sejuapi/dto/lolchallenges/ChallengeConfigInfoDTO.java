package fr.pajonti.sejuapi.dto.lolchallenges;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.Locale;
import java.util.Map;

@Data
public class ChallengeConfigInfoDTO implements RiotDTO {
    private Long id;
    private Map<Locale, Map<String, String>> localizedNames;
    private Long startTimestamp;
    private Long endTimestamp;
    private Boolean leaderboard;
    private Map<String, Double> threshold;
}
