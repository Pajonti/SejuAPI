package fr.pajonti.sejuapi.dto.clash;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class TournamentDTO implements RiotDTO {
    private Integer id;
    private Integer themeId;
    private String nameKey;
    private String nameKeySecondary;
    /**
     * Tournament phase.
     */
    private List<TournamentPhaseDTO> schedule;
}
