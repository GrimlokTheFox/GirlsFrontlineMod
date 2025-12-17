package net.grimlokfox.girlsfrontline.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.grimlokfox.girlsfrontline.world.inventory.PickSideMenu;
import net.grimlokfox.girlsfrontline.network.GflmodModVariables;
import net.grimlokfox.girlsfrontline.init.GflmodModItems;

public class PlayerChooseMercProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof PickSideMenu) {
			{
				double _setval = 3;
				entity.getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.team = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GflmodModItems.PISTOL.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GflmodModItems.AMMO.get()).copy();
				_setstack.setCount(46);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GflmodModItems.RATION.get()).copy();
				_setstack.setCount(10);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}