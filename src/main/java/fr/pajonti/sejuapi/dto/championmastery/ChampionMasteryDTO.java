package fr.pajonti.sejuapi.dto.championmastery;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class ChampionMasteryDTO implements RiotDTO {

    /**
     * Player Universal Unique Identifier. Exact length of 78 characters. (Encrypted)
     */
    private String puuid;

    /**
     * Number of points needed to achieve next level. Zero if player reached maximum champion level for this champion.
     */
    private Long championsPointsUntilNextLevel;

    /**
     * Is chest granted for this champion or not in current season.
     */
    private Boolean chestGranted;

    /**
     * Champion ID for this entry.
     */
    private Long championId;

    /**
     * Last time this champion was played by this player - in Unix milliseconds time format.
     */
    private Long lastPlayTime;

    /**
     * Champion level for specified player and champion combination.
     */
    private Integer championLevel;

    /**
     * Summoner ID for this entry. (Encrypted)
     */
    private String summonerId;

    /**
     * Total number of champion points for this player and champion combination - they are used to determine championLevel.
     */
    private Integer championPoints;

    /**
     * Number of points earned since current level has been achieved.
     */
    private Long championPointsSinceLastLevel;

    /**
     * The token earned for this champion at the current championLevel. When the championLevel is advanced the tokensEarned resets to 0.
     */
    private Integer tokensEarned;

}
