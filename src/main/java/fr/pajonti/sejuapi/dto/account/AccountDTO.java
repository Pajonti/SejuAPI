package fr.pajonti.sejuapi.dto.account;

import fr.pajonti.sejuapi.dto.RiotDTO;
import lombok.Data;

@Data
public class AccountDTO implements RiotDTO {
    /**
     *
     */
    private String puuid;

    /**
     * This field may be excluded from the response if the account doesn't have a gameName.
     */
    private String gameName;

    /**
     * This field may be excluded from the response if the account doesn't have a gameName.
     */
    private String tagLine;
}
