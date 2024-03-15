package fr.pajonti.sejuapi.dto.account;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class ActiveShardDTO implements RiotDTO {
    private String puuid;
    private String game;
    private String activeShard;
}
