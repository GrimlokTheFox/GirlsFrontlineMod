package net.grimlokfox.girlsfrontline.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;

import net.grimlokfox.girlsfrontline.network.GflmodModVariables;

public class SFCustomEntityIsHurtProcedure {
	public static void execute(DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (((damagesource.getEntity()).getCapability(GflmodModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new GflmodModVariables.PlayerVariables())).team != 2) {
			if ((damagesource.getEntity()).getPersistentData().getDouble("team") != 2) {
				if (entity instanceof Mob _entity && (damagesource.getEntity()) instanceof LivingEntity _ent)
					_entity.setTarget(_ent);
			}
		}
	}
}