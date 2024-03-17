package fr.pajonti.sejuapi.dto.tftmatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.tft.TFTTraitStyle;
import lombok.Data;

import java.util.List;

@Data
public class UnitDTO implements RiotDTO {
    private List<Integer> items;
    private String character_id;
    private String chosen;
    private String name;
    private Integer rarity;
    private Integer tier;
}
