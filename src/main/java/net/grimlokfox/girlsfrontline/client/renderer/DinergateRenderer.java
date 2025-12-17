package net.grimlokfox.girlsfrontline.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.grimlokfox.girlsfrontline.entity.DinergateEntity;
import net.grimlokfox.girlsfrontline.client.model.animations.AnimationsDinergateWalk;
import net.grimlokfox.girlsfrontline.client.model.animations.AnimationsDinergateIdle;
import net.grimlokfox.girlsfrontline.client.model.animations.AnimationsDinergateAttack;
import net.grimlokfox.girlsfrontline.client.model.ModelDinergate;

import com.mojang.blaze3d.vertex.PoseStack;

public class DinergateRenderer extends MobRenderer<DinergateEntity, ModelDinergate<DinergateEntity>> {
	public DinergateRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelDinergate.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(DinergateEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DinergateEntity entity) {
		return ResourceLocation.parse("gflmod:textures/entities/dinergateneutral.png");
	}

	private static final class AnimatedModel extends ModelDinergate<DinergateEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<DinergateEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(DinergateEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, AnimationsDinergateIdle.idle, ageInTicks, 1f);
				this.animateWalk(AnimationsDinergateWalk.walk, limbSwing, limbSwingAmount, 2f, 2f);
				this.animate(entity.animationState2, AnimationsDinergateAttack.attack, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(DinergateEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}