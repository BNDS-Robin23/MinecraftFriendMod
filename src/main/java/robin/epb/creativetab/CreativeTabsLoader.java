package robin.epb.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by lenovo on 2017/4/15.
 */
public class CreativeTabsLoader {
    public static CreativeTabs tabEpb;

    public CreativeTabsLoader(FMLPreInitializationEvent event)

    {
        tabEpb = new CreativeTabsEpb();
    }
}
