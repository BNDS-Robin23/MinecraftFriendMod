package robin.epb;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import robin.epb.common.CommonProxy;

@Mod(modid="epb", name="EpicBattle", version="1.0.0")



public class EpicBattle {
	
	public static final String MODID="epb";
	public static final String EPICBATTLE = "EpicBattle";
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	 
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.init(event);
	}
	 
	@EventHandler
	public void postLoad(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}

	@SidedProxy(clientSide = "robin.epb.client.ClientProxy",
			serverSide = "robin.epb.common.CommonProxy")
	public static CommonProxy proxy;

}
