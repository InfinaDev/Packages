package com.cbouton.packages;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = PackagesMod.MODID, version = PackagesMod.VERSION)
public class PackagesMod {
    public static final String MODID = "packages";
    public static final String VERSION = "0.1.0-SNAPSHOT";
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
