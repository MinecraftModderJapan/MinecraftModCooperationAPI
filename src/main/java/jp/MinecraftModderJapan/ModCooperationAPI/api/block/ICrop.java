package jp.MinecraftModderJapan.ModCooperationAPI.api.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * 作物のインターフェースです。
 * <p/>
 * Crop interface.
 *
 * @author CrafterKina
 * @version 1.1
 * @since 1.0
 */
public interface ICrop{
    /**
     * 作物が完熟している場合、trueを返します。 他の成長段階で収穫が異なっても、完熟した段階でのみtrueを返します。
     * <p/>
     * When the crop has grew completely, return true. Even If harvest-result changes by growth stage, only true in
     * final stage.
     *
     * @param world
     *         Nonnull
     *         <p/>
     *         the World
     * @param pos
     *         Nonnull
     *         <p/>
     *         position
     * @since 1.0
     */
    boolean isMature(World world, BlockPos pos);

    /**
     * 作物から何らかの収穫が得られるときは、trueを返します。
     * <p/>
     * Whenever this crop drops any harvest-results, return true.
     *
     * @param world
     *         Nonnull
     *         <p/>
     *         the World
     * @param pos
     *         Nonnull
     *         <p/>
     *         position
     * @since 1.0
     */
    boolean isHarvestable(World world, BlockPos pos);

    /**
     * 収穫者がこの作物を収穫できるか判定します。
     * <p/>
     * The harvester can harvest.
     *
     * @param player
     *         Nonnull
     *         <p/>
     *         the Harvester
     * @param world
     *         Nonnull
     *         <p/>
     *         the World
     * @param pos
     *         Nonnull
     *         <p/>
     *         position
     * @since 1.0
     */
    boolean canHarvestCrop(EntityPlayer player, World world, BlockPos pos);

    /**
     * 成長段階を一つ進めます。 それ以上成長できない場合、falseを返し何も行いません。
     * <p/>
     * Force raise up the growth-stage. If this crop can't grow more, return false and do not anything.
     *
     * @param world
     *         Nonnull
     *         <p/>
     *         the World
     * @param pos
     *         Nonnull
     *         <p/>
     *         position
     * @since 1.0
     */
    boolean grow(World world, BlockPos pos);

    /**
     * 作物の種を返します。
     * <p/>
     * Seed of Crop.
     *
     * @param world
     *         Nonnull
     *         <p/>
     *         the World
     * @param pos
     *         Nonnull
     *         <p/>
     *         position
     * @since 1.0
     */
    ItemStack getSeed(World world, BlockPos pos);

    /**
     * 期待されるすべての収穫物を返します。
     * <p/>
     * All excepted harvest-results.
     *
     * @param world
     *         Nonnull
     *         <p/>
     *         the World
     * @param pos
     *         Nonnull
     *         <p/>
     *         position
     * @since 1.0
     */
    ItemStack[] getAllExceptedResult(World world, BlockPos pos);

    /**
     * 収穫結果を返します。ドロップ処理等は行いません。
     * <p/>
     * Return harvest-result items and do not any more.
     *
     * @param player
     *         Nonnull
     *         <p/>
     *         the Harvester
     * @param random
     *         Nonnull
     *         <p/>
     *         Randomize
     * @param world
     *         Nonnull
     *         <p/>
     *         the World
     * @param pos
     *         Nonnull
     *         <p/>
     *         position
     * @since 1.0
     */
    ItemStack[] harvest(EntityPlayer player, Random random, World world, BlockPos pos);

}
