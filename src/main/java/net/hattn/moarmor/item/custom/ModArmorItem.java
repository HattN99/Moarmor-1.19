package net.hattn.moarmor.item.custom;

import net.hattn.moarmor.item.ModArmorMaterials;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class ModArmorItem extends ArmorItem {
    
    public ModArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient()) {
            PlayerEntity player = (PlayerEntity)entity;

            //TURTLE FULL SET
            if (hasFullSuitOfArmorOn(player) && isCorrectMaterial(player, ArmorMaterials.TURTLE)) {
                addStatusEffect(player, ArmorMaterials.TURTLE);
            }

            //PRISMARINE FULL SET
            if (hasFullSuitOfArmorOn(player) && isCorrectMaterial(player, ModArmorMaterials.PRISMARINE)) {
                addStatusEffect(player, ModArmorMaterials.PRISMARINE);
            }
        }
        super.inventoryTick(stack, world, entity, slot, selected);
    }

    private boolean hasFullSuitOfArmorOn(PlayerEntity player) {
        ItemStack boots = player.getInventory().getArmorStack(0);
        ItemStack leggings = player.getInventory().getArmorStack(1);
        ItemStack chestplate = player.getInventory().getArmorStack(2);
        ItemStack helmet = player.getInventory().getArmorStack(3);

        return  !helmet.isEmpty() && !chestplate.isEmpty() &&!leggings.isEmpty() && !boots.isEmpty();
    }

    private void addStatusEffect(PlayerEntity player, ArmorMaterial material) {
        //PRISMARINE EFFECTS
        if (material == ModArmorMaterials.PRISMARINE) {
            if (!player.hasStatusEffect(StatusEffects.WATER_BREATHING) || player.getStatusEffect(StatusEffects.WATER_BREATHING).getDuration() <= 20)
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0, false, false, true));

            if (!player.hasStatusEffect(StatusEffects.RESISTANCE) || (player.getStatusEffect(StatusEffects.RESISTANCE).getDuration() <= 20) && player.getStatusEffect(StatusEffects.RESISTANCE).getAmplifier() == 0)
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 200, 0, false, false, true));

        }
        //TURTLE EFFECTS
        if (material == ArmorMaterials.TURTLE) {
            if (!player.hasStatusEffect(StatusEffects.WATER_BREATHING) || player.getStatusEffect(StatusEffects.WATER_BREATHING).getDuration() <= 20)
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.WATER_BREATHING, 200, 0, false, false, true));

        }
    }

    private void stacks(PlayerEntity player) {

    }

    private boolean isCorrectMaterial (PlayerEntity player, ArmorMaterial material) {
        ArmorItem boots = (ArmorItem)player.getInventory().getArmorStack(0).getItem();
        ArmorItem leggings = (ArmorItem)player.getInventory().getArmorStack(1).getItem();
        ArmorItem chestplate = (ArmorItem)player.getInventory().getArmorStack(2).getItem();
        ArmorItem helmet = (ArmorItem)player.getInventory().getArmorStack(3).getItem();

        return helmet.getMaterial() == material && chestplate.getMaterial() == material && leggings.getMaterial() == material && boots.getMaterial() == material;
    }
}
