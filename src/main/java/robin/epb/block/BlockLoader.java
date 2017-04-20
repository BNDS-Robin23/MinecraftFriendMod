package robin.epb.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by lenovo on 2017/4/15.
 */
public class BlockLoader {
    public static BlockEpicStone epicStone=new BlockEpicStone();
    public BlockLoader(FMLPreInitializationEvent event){

        register(epicStone);
    }
    private static void register(Block block){

        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
    @SideOnly(Side.CLIENT)
    public static void registerRenders(){
        registerRender(epicStone);
    }
    @SideOnly(Side.CLIENT)
    public static void registerRender(Block block){
        Item item=Item.getItemFromBlock(block);
        String name= GameData.getBlockRegistry().getNameForObject(block).toString();
        ModelLoader.setCustomModelResourceLocation(item,0,new ModelResourceLocation(name,"inventory"));
    }
}
