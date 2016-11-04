package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

/**
 * 食べ物のインターフェースです。
 * <br>
 * Food interface.
 *
 * @author CrafterKina
 * @version 1.0
 * @since 1.0
 */
public interface IFood{
    /**
     * この食べ物を食べることによって、どのくらい満腹度が回復するか取得します。
     * <br>
     * Get the Hunger Heal Amount of This Food.
     *
     * @param stack  eaten food stack
     * @param entity eaten by
     * @since 1.0
     */
    int getHungerHealAmount(@Nonnull ItemStack stack, @Nonnull EntityLivingBase entity);

    /**
     * この食べ物を食べることによって、どのくらい隠し満腹度が回復するか取得します。
     * <br>
     * Get the Hunger Saturation Heal Amount of This Food.
     *
     * @param stack  eaten food stack
     * @param entity eaten by
     * @since 1.0
     */
    float getHungerSaturationModifier(@Nonnull ItemStack stack, @Nonnull EntityLivingBase entity);

    /**
     * 指定されたEntityがこの食べ物を食べられるのか判定します。
     * <br>
     * Can entity eat this.
     *
     * @param entity try to eat
     * @param stack  try to be eaten
     * @since 1.0
     */
    boolean canBeAteBy(@Nonnull EntityLivingBase entity, @Nonnull ItemStack stack);
}
