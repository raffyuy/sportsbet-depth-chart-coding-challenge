package au.com.sportsbet.depthchart.model;

import au.com.sportsbet.depthchart.TestHelper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PlayerTest {

    ObjectMapper mapper = new ObjectMapper();

    @Test
    public void playerJsonStringCanBeDeserialised() throws IOException {
        String playerJson = TestHelper.loadTestCase("test.json");
        Player player = mapper.readValue(playerJson, Player.class);
        assertEquals(1L, player.getPlayerId());
        assertEquals("Bob", player.getName());
        assertEquals("WR", player.getPosition());
        assertNull(player.getPositionDepth());
    }
}
