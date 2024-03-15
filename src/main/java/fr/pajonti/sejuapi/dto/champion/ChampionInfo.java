package fr.pajonti.sejuapi.dto.champion;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class ChampionInfo implements RiotDTO {
    private Integer maxNewPlayerLevel;
    private List<Integer> freeChampionIdsForNewPlayers;
    private List<Integer> freeChampionIds;
}
