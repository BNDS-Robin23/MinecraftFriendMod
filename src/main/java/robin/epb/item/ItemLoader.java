package robin.epb.item;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import robin.epb.EpicBattle;
import robin.epb.item.ItemEpicPickaxe;
import robin.epb.item.ItemEpicSword;

/**
 * Created by lenovo on 2017/4/7.
 */
public class ItemLoader {
    public static ItemEpicSword epicSword =new ItemEpicSword();
    public static ItemEpicPickaxe epicPickaxe=new ItemEpicPickaxe();
    public ItemLoader(FMLPreInitializationEvent event){
        register(epicSword);
        register(epicPickaxe);
    }
    private static void register(Item item){

        GameRegistry.register(item);

    }

    @SideOnly(Side.CLIENT)
    public static void registerRenders()
    {

        registerRender(epicSword);
        registerRender(epicPickaxe);
    }

    @SideOnly(Side.CLIENT)
    private static void registerRender(Item item)
    {
        String name = GameData.getItemRegistry().getNameForObject(item).toString();
               ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(
                       name, "inventory"));
    }
}
