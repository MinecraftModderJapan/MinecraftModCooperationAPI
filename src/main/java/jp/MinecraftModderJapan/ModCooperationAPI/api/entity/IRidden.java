package jp.MinecraftModderJapan.ModCooperationAPI.api.entity;

import net.minecraft.entity.Entity;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

import javax.annotation.Nonnull;

/**
 * 乗れるEntityのインターフェース。
 * <p/>
 * Rideable entity interface.
 *
 * @author CrafterKina
 * @version 1.0
 * @since 1.0
 */
public interface IRidden{
    @CapabilityInject(IRidden.class)
    Capability<IRidden> CAPABILITY = null;

    /**
     * 乗る。
     * <br>
     * ride.
     *
     * @param entity
     *         to ride
     * @return success
     * @since 1.0
     */
    boolean ride(@Nonnull Entity entity);


    /**
     * 降ろす。
     * <br>
     * unload.
     *
     * @param entity
     *         to unload
     * @return success
     * @since 1.0
     */
    boolean unload(@Nonnull Entity entity);

    /**
     * 乗っているすべてのEntityを返す。
     * <br>
     * All the riding on this.
     *
     * @since 1.0
     */
    @Nonnull
    Entity[] getRiddenBy();
}