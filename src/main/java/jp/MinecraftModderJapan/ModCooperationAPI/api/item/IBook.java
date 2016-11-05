package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

import javax.annotation.Nonnull;

/**
 * 本のためのインターフェイス。
 * <br>
 * Interface for the book.
 *
 * @author Shift02
 * @version 1.0
 * @since 1.0
 */
public interface IBook{
    @CapabilityInject(IBook.class)
    Capability<IBook> CAPABILITY = null;

    /**
     * GUIを持っているか。
     * <br>
     * the book has gui.
     *
     * @param book
     *         Instance of the book stack.
     * @return 持っている場合はtrue If the book has, "true"
     * @since 1.0
     */
    boolean hasGUI(@Nonnull ItemStack book);

    /**
     * GUIを開けることができるか。
     * <br>
     * player can open gui.
     *
     * @param player
     *         the Player
     * @param book
     *         Instance of the book stack.
     * @return 開くことができるならtrue。 If player can open gui, true.
     * @since 1.0
     */
    boolean canOpenGUI(@Nonnull EntityPlayer player, @Nonnull ItemStack book);

    /**
     * GUIを開く。
     * <br>
     * Open the GUI.
     *
     * @param player
     *         the Player
     * @param book
     *         Instance of the book stack.
     * @return opened book stack
     * @since 1.0
     */
    @Nonnull
    ItemStack openGUI(@Nonnull EntityPlayer player, @Nonnull ItemStack book);

}
