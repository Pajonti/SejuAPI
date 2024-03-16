package fr.pajonti.sejuapi.dto.spectatortft;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class FeaturedGamesDTO implements RiotDTO {
    private List<FeaturedGameInfoDTO> gameList;
    private Long clientRefreshInterval;
}

