package au.com.sportsbet.depthchart.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Player {

    @JsonProperty("player_id")
    private Long playerId;

    private String name;

    private String position;

    private Integer positionDepth;

}
