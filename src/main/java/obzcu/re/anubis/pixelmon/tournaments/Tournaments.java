package obzcu.re.anubis.pixelmon.tournaments;

import com.google.inject.Inject;
import com.pixelmonmod.pixelmon.Pixelmon;
import org.spongepowered.api.config.DefaultConfig;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;

import java.nio.file.Path;
import java.util.logging.Logger;

@Plugin(
    id = "anubispixelmontournaments",
    name = "AnubisPixelmonTournaments",
    version = "1.0.0",
    description = "Custom platform for Pixelmon tournaments",
    authors = { "HoverCatz" },
    dependencies = {
        @Dependency(id = "pixelmon"),
        @Dependency(id = "placeholderapi", optional = true)
    }
)
public class Tournaments
{

    @Inject
    public Logger logger;

    @Inject
    @DefaultConfig(sharedRoot = true)
    private Path defaultConfig;

    @Listener
    public void onServerStart(GameStartedServerEvent event)
    {

        System.out.println("!!!");
        System.out.println("!!! GAME STARTED");
        System.out.println("!!!");

    }

}
