package robin.epb.client;

import robin.epb.block.BlockLoader;
import robin.epb.item.ItemLoader;

/**
 * Created by lenovo on 2017/4/7.
 */
public class ItemRenderLoader {
    public ItemRenderLoader()
    {
        ItemLoader.registerRenders();
        BlockLoader.registerRenders();
    }
}
