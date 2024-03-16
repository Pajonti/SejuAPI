package fr.pajonti.sejuapi.dto.tftleague;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.tft.TFTQueue;
import fr.pajonti.sejuapi.enums.tft.TFTRatedTier;
import lombok.Data;

@Data
public class TopRatedLadderEntryDTO implements RiotDTO {
    private String summonerId;
    private String summonerName;
    private TFTRatedTier ratedTier;
    private Integer ratedRating;
    private Integer wins;
    private Integer previousUpdateLadderPosition;
}
