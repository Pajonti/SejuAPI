package fr.pajonti.sejuapi.dto.league;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.LeagueTier;
import fr.pajonti.sejuapi.enums.league.Queue;
import lombok.Data;

import java.util.List;

@Data
public class LeagueListDTO implements RiotDTO {
    private String leagueId;
    private List<LeagueItemDTO> entries;
    private LeagueTier tier;
    private String name;
    private Queue queue;
}
