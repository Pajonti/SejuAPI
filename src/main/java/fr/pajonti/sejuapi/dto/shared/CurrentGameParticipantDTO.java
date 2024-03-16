package fr.pajonti.sejuapi.dto.shared;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

import java.util.List;

@Data
public class CurrentGameParticipantDTO implements RiotDTO {
    /**
     * Key used to decrypt the spectator grid game data for playback
     */
    private Long championId;

    /**
     * Perks/Runes Reforged Information
     */
    private PerksDTO perks;

    /**
     * Flag indicating whether or not this participant is a bot
     */
    private Boolean bot;

    /**
     * The ID of the profile icon used by this participant
     */
    private Long profileIconId;

    /**
     * The team ID of this participant, indicating the participant's team
     */
    private Long teamId;

    /**
     * The summoner name of this participant
     */
    private String summonerName;

    /**
     * The encrypted summoner ID of this participant
     */
    private String summonerId;

    /**
     * The encrypted puuid of this participant
     */
    private String puuid;

    /**
     * The ID of the first summoner spell used by this participant
     */
    private Long spell1Id;

    /**
     * The ID of the second summoner spell used by this participant
     */
    private Long spell2Id;

    /**
     * List of Game Customizations
     */
    private List<GameCustomozationObjectDTO> gameCustomizationObjects;
}


