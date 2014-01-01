package com.cbouton.packages;

import com.cbouton.packages.lib.Config;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = PackagesMod.MODID, version = PackagesMod.VERSION)
public class PackagesMod {
    public static final String MODID = "packages";
    public static final String VERSION = "0.1.0-SNAPSHOT";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	Config.init(event.getSuggestedConfigurationFile());
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
}
