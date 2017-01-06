package jp.MinecraftModderJapan.ModCooperationAPI.api.entity;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

import javax.annotation.Nonnull;

/**
 * 繁殖可能なEntityのインターフェース
 * <br>
 * Breedable mobs interface.
 *
 * @author CrafterKina
 * @version 1.0
 * @since 1.0
 */
public interface IBreedable{
    @CapabilityInject(IBreedable.class)
    Capability<IBreedable> CAPABILITY = null;

    /**
     * @param stack
     *         the Item
     * @see net.minecraft.entity.passive.EntityAnimal#isBreedingItem(ItemStack) it is same.
     * @since 1.0
     */
    boolean canBreedBy(@Nonnull ItemStack stack);
}
