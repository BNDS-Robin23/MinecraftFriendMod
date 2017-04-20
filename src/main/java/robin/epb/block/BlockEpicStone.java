package robin.epb.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import robin.epb.creativetab.CreativeTabsLoader;

/**
 * Created by lenovo on 2017/4/8.
 */
public class BlockEpicStone extends Block {
    public BlockEpicStone(){
        super(Material.ROCK);
        this.setRegistryName("epic_stone");
        this.setUnlocalizedName("epicStone");
        this.setCreativeTab(CreativeTabsLoader.tabEpb);
        this.setHardness(1.5f);
        this.setResistance(10.0f);
        this.setLightLevel(0.0f);
        this.setHarvestLevel("pickaxe", 0);
        this.setSoundType(SoundType.STONE);
    }
}
