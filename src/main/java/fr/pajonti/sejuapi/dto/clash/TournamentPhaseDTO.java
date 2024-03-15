package fr.pajonti.sejuapi.dto.clash;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class TournamentPhaseDTO implements RiotDTO {
    private Integer id;
    private Long registrationTime;
    private Long startTime;
    private Boolean cancelled;
}
