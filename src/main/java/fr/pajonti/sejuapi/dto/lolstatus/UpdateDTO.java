package fr.pajonti.sejuapi.dto.lolstatus;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.shared.PublishLocation;
import lombok.Data;

import java.util.List;

@Data
public class UpdateDTO implements RiotDTO {
    private Integer id;
    private String author;
    private Boolean publish;
    private PublishLocation publish_location;
    private List<ContentDTO> translations;
    private String created_at;
    private String updated_at;
}

