package com.cbouton.packages.lib;

import com.cbouton.packages.PackagesMod;
import com.cbouton.packages.items.PackageItem;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

import net.minecraft.item.Item;

public class ModItems {
	public static Item pkg;
	
	public static void init() {
		pkg = new PackageItem(ItemStatics.PACKAGE_ITEM_ID);
		
		GameRegistry.registerItem(pkg, pkg.getUnlocalizedName()
				.replace("item.", ""), PackagesMod.MODID);
		
		LanguageRegistry.addName(pkg, "Package");
	}
	
}
