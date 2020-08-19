package your.packagee.here;

import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Dependency;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
    id = "your_mod_id_here",
    name = "your_mod_name_here",
    dependencies = @Dependency(id = "gooeylibsponge"),
    authors = "some_author"
)
public class CleanSpongeForgeProject
{

    @Listener
    public void onServerStart(GameStartedServerEvent event)
    {
        System.out.println(":D");
    }

}
