package net.grimlokfox.girlsfrontline.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.GameType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.grimlokfox.girlsfrontline.network.GflmodModVariables;
import net.grimlokfox.girlsfrontline.init.GflmodModItems;

public class SwapDinergatesDependingOnTeamProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity))) {
			if ((entity.getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GflmodModVariables.PlayerVariables())).team == 1) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(GflmodModItems.CUSTOM_DINERGATE_SPAWNER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(GflmodModItems.GN_K_DINERGATE_SPAWNER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((entity.getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GflmodModVariables.PlayerVariables())).team == 1) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(GflmodModItems.MERC_DINERGATE_SPAWNER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(GflmodModItems.GN_K_DINERGATE_SPAWNER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((entity.getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GflmodModVariables.PlayerVariables())).team == 2) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(GflmodModItems.GN_K_DINERGATE_SPAWNER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(GflmodModItems.CUSTOM_DINERGATE_SPAWNER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((entity.getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GflmodModVariables.PlayerVariables())).team == 2) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(GflmodModItems.MERC_DINERGATE_SPAWNER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(GflmodModItems.CUSTOM_DINERGATE_SPAWNER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((entity.getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GflmodModVariables.PlayerVariables())).team == 3) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(GflmodModItems.CUSTOM_DINERGATE_SPAWNER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(GflmodModItems.MERC_DINERGATE_SPAWNER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
			if ((entity.getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GflmodModVariables.PlayerVariables())).team == 3) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(GflmodModItems.GN_K_DINERGATE_SPAWNER.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(GflmodModItems.MERC_DINERGATE_SPAWNER.get()).copy();
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
	}
}