package jp.MinecraftModderJapan.ModCooperationAPI.api.item;

import net.minecraft.item.ItemStack;

/**
 * 本のためのインターフェイス Interface for the book
 *
 * @author Shift02
 * @version 1.0.0
 * @since 1.0.0
 */
public interface IBook {

	/**
	 * GUIを持っているか have the book
	 * @return 持っている場合はtrue  If the book has "true"
	 * @version 1.0.0
     * @since 1.0.0
	 */
	boolean hasGUI(ItemStack book);

	/**
	 * GUIを開く Open the GUI
	 * @version 1.0.0
     * @since 1.0.0
	 */
	void openGUI(ItemStack book);

}
