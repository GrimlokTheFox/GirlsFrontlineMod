package net.grimlokfox.girlsfrontline.procedures;

import net.minecraft.world.entity.Entity;

public class AssimilatedSFOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("team", 1);
	}
}