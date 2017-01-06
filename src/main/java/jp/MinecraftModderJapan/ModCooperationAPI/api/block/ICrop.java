package jp.MinecraftModderJapan.ModCooperationAPI.api.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import java.util.Random;

/**
 * 作物のインターフェースです。
 * <br>
 * Crop interface.
 *
 * @author CrafterKina
 * @version 1.1
 * @since 1.0
 */
public interface ICrop{
    /**
     * 作物が完熟している場合、trueを返します。 他の成長段階で収穫が異なっても、完熟した段階でのみtrueを返します。
     * <br>
     * When the crop has grew completely, return true. Even If harvest-result changes by growth stage, only true in
     * final stage.
     *
     * @param world
     *         the World
     * @param pos
     *         position
     * @since 1.0
     */
    boolean isMature(@Nonnull World world, @Nonnull BlockPos pos);

    /**
     * 作物から何らかの収穫が得られるときは、trueを返します。
     * <br>
     * Whenever this crop drops any harvest-results, return true.
     *
     * @param world
     *         the World
     * @param pos
     *         position
     * @since 1.0
     */
    boolean isHarvestable(@Nonnull World world, @Nonnull BlockPos pos);

    /**
     * 収穫者がこの作物を収穫できるか判定します。
     * <br>
     * The harvester can harvest.
     *
     * @param player
     *         the Harvester
     * @param world
     *         the World
     * @param pos
     *         position
     * @since 1.0
     */
    boolean canHarvestCrop(@Nonnull EntityPlayer player, @Nonnull World world, @Nonnull BlockPos pos);

    /**
     * 成長段階を一つ進めます。 それ以上成長できない場合、falseを返し何も行いません。
     * <br>
     * Force raise up the growth-stage. If this crop can't grow more, return false and do not anything.
     *
     * @param world
     *         the World
     * @param pos
     *         position
     * @since 1.0
     */
    boolean grow(@Nonnull World world, @Nonnull BlockPos pos);

    /**
     * 作物の種を返します。
     * <br>
     * Seed of Crop.
     *
     * @param world
     *         the World
     * @param pos
     *         position
     * @since 1.0
     */
    ItemStack getSeed(@Nonnull World world, @Nonnull BlockPos pos);

    /**
     * 期待されるすべての収穫物を返します。
     * <br>
     * All excepted harvest-results.
     *
     * @param world
     *         the World
     * @param pos
     *         position
     * @since 1.0
     */
    @Nonnull
    ItemStack[] getAllExceptedResult(@Nonnull World world, @Nonnull BlockPos pos);

    /**
     * 収穫結果を返します。ドロップ処理等は行いません。
     * <br>
     * Return harvest-result items and do not any more.
     *
     * @param player
     *         the Harvester
     * @param random
     *         Randomize
     * @param world
     *         the World
     * @param pos
     *         position
     * @since 1.0
     */
    @Nonnull
    ItemStack[] harvest(@Nonnull EntityPlayer player, @Nonnull Random random, @Nonnull World world, @Nonnull BlockPos pos);

}
