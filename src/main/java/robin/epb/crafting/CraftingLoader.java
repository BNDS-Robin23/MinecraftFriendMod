package robin.epb.crafting;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import robin.epb.block.BlockLoader;
import robin.epb.common.ConfigLoader;
import robin.epb.item.ItemLoader;

/**
 * Created by lenovo on 2017/4/15.
 */
public class CraftingLoader {
    public CraftingLoader(){
        registerRecipe();
        registerSmelting();
        registerFuel();
    }
    private static void registerRecipe(){
        GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.epicSword),new Object[]{
            "###","#*#","###",'#', Item.getItemFromBlock(BlockLoader.epicStone),'*', Items.DIAMOND_SWORD
        });

    }
    private static void registerSmelting(){
        GameRegistry.addSmelting(BlockLoader.epicStone,new ItemStack(Items.DIAMOND),0.5F);

    }
    private static void registerFuel(){
        GameRegistry.registerFuelHandler(new IFuelHandler()
        {
            @Override
            public int getBurnTime(ItemStack fuel)
            {
                return Items.DIAMOND != fuel.getItem() ? 0 : Math.max(0, ConfigLoader.diamondBurnTime) * 20;
            }
        });

    }
}
