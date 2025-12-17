package net.grimlokfox.girlsfrontline.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.grimlokfox.girlsfrontline.entity.ProwlerEntity;
import net.grimlokfox.girlsfrontline.client.model.animations.prowlerWalkAnimation;
import net.grimlokfox.girlsfrontline.client.model.animations.prowlerAnimation;
import net.grimlokfox.girlsfrontline.client.model.Modelprowler;

public class ProwlerRenderer extends MobRenderer<ProwlerEntity, Modelprowler<ProwlerEntity>> {
	public ProwlerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelprowler.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ProwlerEntity entity) {
		return ResourceLocation.parse("gflmod:textures/entities/prowler.png");
	}

	private static final class AnimatedModel extends Modelprowler<ProwlerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ProwlerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ProwlerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, prowlerAnimation.idle, ageInTicks, 1f);
				this.animateWalk(prowlerWalkAnimation.walk, limbSwing, limbSwingAmount, 2f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ProwlerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}