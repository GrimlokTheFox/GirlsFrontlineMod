package net.grimlokfox.girlsfrontline.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.grimlokfox.girlsfrontline.world.inventory.PickSideMenu;
import net.grimlokfox.girlsfrontline.network.GflmodModVariables;

public class PlayerChooseGnKProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _plr0 && _plr0.containerMenu instanceof PickSideMenu) {
			{
				double _setval = 1;
				entity.getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.team = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}