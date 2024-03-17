package fr.pajonti.sejuapi.dto.tftmatch;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.tft.TFTTraitStyle;
import lombok.Data;

import java.util.List;

@Data
public class TraitsDTO implements RiotDTO {
    private String name;
    private Integer num_units;
    private TFTTraitStyle style;
    private Integer tier_current;
    private Integer tier_total;
}
