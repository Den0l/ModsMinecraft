package net.denol.loxmod.item;

import net.denol.loxmod.ModCreativeTab;
import net.denol.loxmod.armor.ModMaterial;
import net.denol.loxmod.loxmod;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;

import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class moditems
{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, loxmod.MOD_ID);

    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            ()->new Item(new Item.Properties().tab(ModCreativeTab.MOD_TAB)));

    public static final RegistryObject<ArmorItem> AMBER_HELMET = ITEMS.register("amber_helmet",
            () -> new ArmorItem(ArmorTier.EXAMPLE, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeTab.MOD_TAB)));

    public static final RegistryObject<ArmorItem> AMBER_CHESTPLATE = ITEMS.register("amber_chestplate",
            () -> new ArmorItem(ArmorTier.EXAMPLE, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeTab.MOD_TAB)));

    public static final RegistryObject<ArmorItem> AMBER_LEGGINGS = ITEMS.register("amber_leggings",
            () -> new ArmorItem(ArmorTier.EXAMPLE, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeTab.MOD_TAB)));

    public static final RegistryObject<ArmorItem> AMBER_BOOTS = ITEMS.register("amber_boots",
            () -> new ArmorItem(ArmorTier.EXAMPLE, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeTab.MOD_TAB)));

    public static final RegistryObject<Item> AMBER_RAW = ITEMS.register("amber_raw",
            ()->new Item(new Item.Properties().tab(ModCreativeTab.MOD_TAB)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }

    public static class ArmorTier {
        public static final ArmorMaterial EXAMPLE = new ModMaterial(
                "amber",
                439,
                new int[] {3,2,5,2},
                300,
                SoundEvents.ARMOR_EQUIP_GOLD,
                0.0f,
                0.0f,
                () -> Ingredient.EMPTY
        );
    }

}
