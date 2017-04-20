package robin.epb.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import robin.epb.creativetab.CreativeTabsLoader;

/**
 * Created by lenovo on 2017/4/7.
 */
public class ItemEpicSword extends Item {
    public ItemEpicSword(){
        super();
        this.setUnlocalizedName("epicSword");
        this.setCreativeTab(CreativeTabsLoader.tabEpb);
        this.setRegistryName("epic_sword");
    }
}
