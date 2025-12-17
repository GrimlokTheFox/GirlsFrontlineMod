/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.grimlokfox.girlsfrontline.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GflmodModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> SF_RINGLEADER_MODE = GameRules.register("sFRingleaderMode", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}