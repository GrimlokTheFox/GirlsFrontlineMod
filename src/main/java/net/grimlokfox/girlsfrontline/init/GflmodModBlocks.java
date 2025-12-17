/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grimlokfox.girlsfrontline.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.grimlokfox.girlsfrontline.block.CollapseBlockBlock;
import net.grimlokfox.girlsfrontline.GflmodMod;

public class GflmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GflmodMod.MODID);
	public static final RegistryObject<Block> COLLAPSE_BLOCK = REGISTRY.register("collapse_block", () -> new CollapseBlockBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}