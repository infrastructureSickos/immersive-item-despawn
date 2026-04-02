package com.infrastructuresickos.immersive_item_despawn;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ImmersiveItemDespawn.MOD_ID)
public class ImmersiveItemDespawn {
    public static final String MOD_ID = "immersive_item_despawn";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

    public ImmersiveItemDespawn() {
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("ImmersiveItemDespawn initialized");
    }
}
