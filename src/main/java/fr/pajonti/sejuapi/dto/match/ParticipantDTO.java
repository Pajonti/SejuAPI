package fr.pajonti.sejuapi.dto.match;

import fr.pajonti.sejuapi.dto.RiotDTO;
import fr.pajonti.sejuapi.enums.league.SummonerSpell;
import lombok.Data;

@Data
public class ParticipantDTO implements RiotDTO {
    private Integer assists;
    private Integer baronKills;
    private Integer bountyLevel;
    private Integer champExperience;
    private Integer champLevel;
    /**
     * Prior to patch 11.4, on Feb 18th, 2021, this field returned invalid championIds. We recommend determining the champion based on the championName field for matches played prior to patch 11.4.
     */
    private Integer championId;
    private String championName;
    /**
     * This field is currently only utilized for Kayn's transformations. (Legal values: 0 - None, 1 - Slayer, 2 - Assassin)
     */
    private Integer championTransform;
    private Integer consumablesPurchased;
    private Integer damageDealtToBuildings;
    private Integer damageDealtToObjectives;
    private Integer damageDealtToTurrets;
    private Integer damageSelfMitigated;
    private Integer deaths;
    private Integer detectorWardsPlaced;
    private Integer doubleKills;
    private Integer dragonKills;
    private Boolean firstBloodAssist;
    private Boolean firstBloodKill;
    private Boolean firstTowerAssist;
    private Boolean firstTowerKill;
    private Boolean gameEndedInEarlySurrender;
    private Boolean gameEndedInSurrender;
    private Integer goldEarned;
    private Integer goldSpent;
    /**
     * Both individualPosition and teamPosition are computed by the game server and are different versions
     * of the most likely position played by a player.
     * The individualPosition is the best guess for which position the player actually
     * played in isolation of anything else.
     * The teamPosition is the best guess for which position the player actually played if we add the constraint
     * that each team must have one top player, one jungle, one middle, etc.
     * Generally the recommendation is to use the teamPosition field over the individualPosition field.
     */
    private String individualPosition;
    private Integer inhibitorKills;
    private Integer inhibitorTakedowns;
    private Integer inhibitorsLost;
    private Integer item0;
    private Integer item1;
    private Integer item2;
    private Integer item3;
    private Integer item4;
    private Integer item5;
    private Integer item6;
    private Integer itemsPurchased;
    private Integer killingSprees;
    private Integer kills;
    private String lane;
    private Integer largestCriticalStrike;
    private Integer largestKillingSpree;
    private Integer largestMultiKill;
    private Integer longestTimeSpentLiving;
    private Integer magicDamageDealt;
    private Integer magicDamageDealtToChampions;
    private Integer magicDamageTaken;
    private Integer neutralMinionsKilled;
    private Integer nexusKills;
    private Integer nexusTakedowns;
    private Integer nexusLost;
    private Integer objectivesStolen;
    private Integer objectivesStolenAssists;
    private Integer participantId;
    private Integer pentaKills;
    private PerksDTO perks;
    private Integer physicalDamageDealt;
    private Integer physicalDamageDealtToChampions;
    private Integer physicalDamageTaken;
    private Integer profileIcon;
    private String puuid;
    private Integer quadraKills;
    private String riotIdName;
    private String riotIdTagline;
    private String role;
    private Integer sightWardsBoughtInGame;
    private Integer spell1Casts;
    private Integer spell2Casts;
    private Integer spell3Casts;
    private Integer spell4Casts;
    private Integer summoner1Casts;
    private SummonerSpell summoner1Id;
    private Integer summoner2Casts;
    private SummonerSpell summoner2Id;
    private String summonerId;
    private Integer summonerLevel;
    private String summonerName;
    private Boolean teamEarlySurrendered;
    private Integer teamId;
    /**
     * Both individualPosition and teamPosition are computed by the game server and are different versions
     * of the most likely position played by a player.
     * The individualPosition is the best guess for which position the player actually
     * played in isolation of anything else.
     * The teamPosition is the best guess for which position the player actually played if we add the constraint
     * that each team must have one top player, one jungle, one middle, etc.
     * Generally the recommendation is to use the teamPosition field over the individualPosition field.
     */
    private String teamPosition;
    private Integer timeCCingOthers;
    private Integer timePlayed;
    private Integer totalDamageDealt;
    private Integer totalDamageDealtToChampions;
    private Integer totalDamageShieldedOnTeammates;
    private Integer totalDamageTaken;
    private Integer totalHeal;
    private Integer totalHealsOnTeammates;
    private Integer totalMinionsKilled;
    private Integer totalTimeCCDealt;
    private Integer totalTimeSpentDead;
    private Integer totalUnitsHealed;
    private Integer tripleKills;
    private Integer trueDamageDealt;
    private Integer trueDamageDealtToChampions;
    private Integer trueDamageTaken;
    private Integer turretKills;
    private Integer turretTakedowns;
    private Integer turretsLost;
    private Integer unrealKills;
    private Integer visionScore;
    private Integer visionWardsBoughtInGame;
    private Integer wardsKilled;
    private Integer wardsPlaced;
    private Boolean win;
}
