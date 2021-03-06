package com.diehardsteam.dimensionaltales.metadata.items;

import net.minecraft.util.*;
import com.diehardsteam.dimensionaltales.tabs.*;
import net.minecraft.client.renderer.texture.*;
import net.minecraft.creativetab.*;
import java.util.*;
import net.minecraft.item.*;

public class DimensionItem extends Item
{
    public IIcon[] icons;
    
    public DimensionItem(final String dimensionItem) {
        this.icons = new IIcon[2];
        this.setHasSubtypes(true);
        this.setUnlocalizedName(dimensionItem);
        this.setCreativeTab(ModTabs.tabItems);
    }
    
    public void DimensionItem1(final String string) {
    }
    
    public void registerIcons(final IIconRegister reg) {
        for (int i = 0; i < 2; ++i) {
            this.icons[i] = reg.registerIcon("dimensionaltales:dimensionitem_" + i);
        }
    }
    
    public IIcon getIconFromDamage(int meta) {
        if (meta > 1) {
            meta = 0;
        }
        return this.icons[meta];
    }
    
    public void getSubItems(final Item item, final CreativeTabs tab, final List list) {
        for (int i = 0; i < 2; ++i) {
            list.add(new ItemStack(item, 1, i));
        }
    }
    
    public String getUnlocalizedName(final ItemStack stack) {
        return this.getUnlocalizedName() + "_" + stack.getItemDamage();
    }
}
