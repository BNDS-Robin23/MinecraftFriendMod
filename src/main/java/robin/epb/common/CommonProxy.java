package robin.epb.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import robin.epb.block.BlockLoader;
import robin.epb.crafting.CraftingLoader;
import robin.epb.creativetab.CreativeTabsLoader;
import robin.epb.item.ItemLoader;

/**
 * Created by lenovo on 2017/4/7.
 */
public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        new ConfigLoader(event);
        new CreativeTabsLoader(event);
        new ItemLoader(event);
        new BlockLoader(event);
        new CraftingLoader();

    }

    public void init(FMLInitializationEvent event)
    {
    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}