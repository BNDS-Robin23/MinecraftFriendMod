package robin.epb.common;


import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

/**
 * Created by lenovo on 2017/4/15.
 */
public class ConfigLoader {
    private static Configuration config;
    private static Logger logger;
    public static int diamondBurnTime;

    public ConfigLoader(FMLPreInitializationEvent event){
        logger=event.getModLog();
        config=new Configuration(event.getSuggestedConfigurationFile());

        config.load();
        load();
    }
    public static void load(){
        logger.info("正在加载配置文件");
        String comment;
        comment = "How many seconds can a diamond burn in a furnace. ";
        diamondBurnTime = config.get(Configuration.CATEGORY_GENERAL, "diamondBurnTime", 640, comment).getInt();

        config.save();
        logger.info("配置文件加载完毕");
    }
    public static Logger logger()
    {
        return logger;
    }
}
