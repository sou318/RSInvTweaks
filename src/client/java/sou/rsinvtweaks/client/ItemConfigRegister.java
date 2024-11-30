package sou.rsinvtweaks.client;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemConfigRegister
{
    private final List<Item> itemList = new ArrayList<>();


    /**
     * アイテムをリストに追加します。
     * @param bool trueの場合追加されます。
     * @param item 追加するアイテム
     */
    public void add(boolean bool, Item item)
    {
        if (bool) itemList.add(item);
    }


    /**
     * 追加されたアイテムを全て登録します。
     * @param entries 追加先のエントリ
     */
    public void register(FabricItemGroupEntries entries)
    {
        itemList.forEach(entries::add);
    }
}
