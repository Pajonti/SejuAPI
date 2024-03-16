package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class ObjectivesDTO implements RiotDTO {
    private ObjectiveDTO baron;
    private ObjectiveDTO champion;
    private ObjectiveDTO dragon;
    private ObjectiveDTO inhibitor;
    private ObjectiveDTO riftHerald;
    private ObjectiveDTO tower;
}
