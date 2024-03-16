package fr.pajonti.sejuapi.dto.spectator;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class ObserverDTO implements RiotDTO {
    /**
     * Key used to decrypt the spectator grid game data for playback
     */
    private String encryptionKey;
}

