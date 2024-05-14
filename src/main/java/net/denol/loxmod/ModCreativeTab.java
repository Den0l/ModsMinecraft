package net.denol.loxmod;
import net.denol.loxmod.item.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
    public static CreativeModeTab MOD_TAB = new CreativeModeTab("mod_tab"){
       @Override
       public ItemStack makeIcon()
       {
           return new ItemStack(moditems.AMBER.get());

       }

    };

}
