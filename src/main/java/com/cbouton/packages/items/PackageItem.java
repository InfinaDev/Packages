package com.cbouton.packages.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PackageItem extends Item {

	public PackageItem(int id) {
		super(id);
		setMaxStackSize(1);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("packageItem");
		setTextureName("packages:packageItem");
	}
	
}
