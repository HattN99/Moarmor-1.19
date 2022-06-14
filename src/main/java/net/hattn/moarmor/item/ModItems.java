package net.hattn.moarmor.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hattn.moarmor.Moarmor;
import net.hattn.moarmor.item.custom.ModArmorItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //TURTLE CHESTPLATE
    public static final Item TURTLE_CHESTPLATE = registerItem("turtle_chestplate",
            new ModArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //TURTLE LEGGINGS
    public static final Item TURTLE_LEGGINGS = registerItem("turtle_leggings",
            new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //TURTLE BOOTS
    public static final Item TURTLE_BOOTS = registerItem("turtle_boots",
            new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //GUARDIAN SPIKE
    public static final Item GUARDIAN_SPIKE = registerItem("guardian_spike",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    //PRISMARINE HELMET
    public static final Item PRISMARINE_HELMET = registerItem("prismarine_helmet",
            new ModArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //PRISMARINE CHESTPLATE
    public static final Item PRISMARINE_CHESTPLATE = registerItem("prismarine_chestplate",
            new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //PRISMARINE LEGGINGS
    public static final Item PRISMARINE_LEGGINGS = registerItem("prismarine_leggings",
            new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //PRISMARINE BOOTS
    public static final Item PRISMARINE_BOOTS = registerItem("prismarine_boots",
            new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //PRISMARINE NETHERITE HELMET
    public static final Item PRISMARINE_NETHERITE_HELMET = registerItem("prismarine_netherite_helmet",
            new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //PRISMARINE NETHERITE CHESTPLATE
    public static final Item PRISMARINE_NETHERITE_CHESTPLATE = registerItem("prismarine_netherite_chestplate",
            new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //PRISMARINE NETHERITE LEGGINGS
    public static final Item PRISMARINE_NETHERITE_LEGGINGS = registerItem("prismarine_netherite_leggings",
            new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));
    //PRISMARINE NETHERITE BOOTS
    public static final Item PRISMARINE_NETHERITE_BOOTS = registerItem("prismarine_netherite_boots",
            new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ItemGroup.COMBAT)));





    //REGISTRY
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Moarmor.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Moarmor.LOGGER.info("Registering mod items for " + Moarmor.MOD_ID);
    }
}
