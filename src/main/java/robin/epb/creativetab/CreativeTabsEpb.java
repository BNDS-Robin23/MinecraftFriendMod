package robin.epb.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import robin.epb.item.ItemLoader;

/**
 * Created by lenovo on 2017/4/15.
 */
public class CreativeTabsEpb extends CreativeTabs{
    public CreativeTabsEpb()
    {
        super("epb");
        this.setBackgroundImageName("epb.png");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemLoader.epicSword);
    }
    @Override
    public boolean hasSearchBar()
    {
        return true;
    }

}
