package openmodularturrets.blocks.misc;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import openmodularturrets.ModularTurrets;
import openmodularturrets.blocks.Blocks;
import openmodularturrets.blocks.util.BlockAbstractMiscPane;
import openmodularturrets.reference.ModInfo;
import openmodularturrets.reference.Names;

public class BlockFenceTierFour extends BlockAbstractMiscPane {

    public BlockFenceTierFour() {
        super("stone", "cobblestone", Material.rock, false);
        this.setCreativeTab(ModularTurrets.modularTurretsTab);
        this.setResistance(50.0F);
        this.setHardness(50.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(Block.soundTypeStone);
        this.setBlockName(Names.Blocks.unlocalisedFenceTierFour);
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        super.registerBlockIcons(reg);
        blockIcon = reg.registerIcon(ModInfo.ID.toLowerCase() + ":fenceTierFour");
    }

    @Override
    public void onEntityCollidedWithBlock(World worldIn, int x, int y, int z, Entity entityIn) {
        if (!(entityIn instanceof EntityItem)) entityIn.attackEntityFrom(DamageSource.cactus, 4);
    }

    @Override
    public Item getItemDropped(int meta, Random random, int fortune) {
        return Item.getItemFromBlock(Blocks.fenceTierFour);
    }
}
