package fr.pajonti.sejuapi.dto.shared;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class GameCustomozationObjectDTO implements RiotDTO {
    /**
     * Category identifier for Game Customization
     */
    private String category;

    /**
     * Game Customization content
     */
    private String content;
}

