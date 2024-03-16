package fr.pajonti.sejuapi.dto.lolchallenges;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.StatTracking;
import fr.pajonti.sejuapi.enums.league.State;
import lombok.Data;

import java.util.Locale;
import java.util.Map;

@Data
public class ChallengeConfigInfoDTO implements RiotDTO {
    private Long id;
    private Map<Locale, Map<String, String>> localizedNames;
    private State state;
    private StatTracking tracking;
    private Long startTimestamp;
    private Long endTimestamp;
    private Boolean leaderboard;
    private Map<String, Double> threshold;
}
