package robin.epb.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import robin.epb.creativetab.CreativeTabsLoader;

/**
 * Created by lenovo on 2017/4/8.
 */
public class ItemEpicPickaxe extends Item {
    public ItemEpicPickaxe(){
        super();
        this.setUnlocalizedName("epicPickaxe");
        this.setCreativeTab(CreativeTabsLoader.tabEpb);
        this.setRegistryName("epic_pickaxe");
    }
}
