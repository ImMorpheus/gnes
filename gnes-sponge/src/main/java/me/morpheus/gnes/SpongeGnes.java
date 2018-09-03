package me.morpheus.gnes;

import com.google.inject.Inject;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(
        id = "gnes",
        name = "Gnes"
)
public class SpongeGnes {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) {
    }
}
