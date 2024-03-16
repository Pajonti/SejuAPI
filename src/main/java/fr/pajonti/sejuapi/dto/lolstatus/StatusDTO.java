package fr.pajonti.sejuapi.dto.lolstatus;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.shared.IncidentSeverity;
import fr.pajonti.sejuapi.enums.shared.MaintenanceStatus;
import fr.pajonti.sejuapi.enums.shared.Platform;
import lombok.Data;

import java.util.List;

@Data
public class StatusDTO implements RiotDTO {
    private Integer id;
    private MaintenanceStatus maintenance_status;
    private IncidentSeverity incident_severity;
    private List<ContentDTO> titles;
    private List<UpdateDTO> updates;
    private String created_at;
    private String archive_at;
    private String updated_at;
    private List<Platform> platforms;
}

