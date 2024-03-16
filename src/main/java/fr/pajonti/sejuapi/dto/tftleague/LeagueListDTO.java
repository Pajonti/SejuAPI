package fr.pajonti.sejuapi.dto.tftleague;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.LeagueQueue;
import fr.pajonti.sejuapi.enums.tft.TFTTier;
import lombok.Data;

import java.util.List;

@Data
public class LeagueListDTO implements RiotDTO {
    private String leagueId;
    private List<LeagueItemDTO> entries;
    private TFTTier tier;
    private String name;
    private LeagueQueue queue;
}
