package craftableglowstone;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod(craftablegGlowstone.MODID)
public class craftablegGlowstone {
    public static final String MODID = "craftableglowstone";

    public craftablegGlowstone() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        bus.addListener(this::doClientStuff);
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Some setup code
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // Some client setup code
    }

    @EventBusSubscriber(modid = MODID, bus = EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        // Some registry events
    }
}
