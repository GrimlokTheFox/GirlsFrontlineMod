package net.grimlokfox.girlsfrontline.procedures;

import net.minecraft.world.entity.Entity;

public class MercDroidsOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("team", 3);
	}
}