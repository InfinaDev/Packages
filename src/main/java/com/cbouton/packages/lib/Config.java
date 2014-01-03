package com.cbouton.packages.lib;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class Config {

	public static void init(File configFile) {
		Configuration config = new Configuration(configFile);
		
		//TODO: Add items to config here
		
		config.load();
		ItemStatics.PACKAGE = configuration.getItem(
                                        "Package", ItemStatics.ITEM_PACKAGE_DEFAULT)
                                        .getInt(ItemStatics.ITEM_PACKAGE_DEFAULT) - 256;
		config.save();
	}

}
