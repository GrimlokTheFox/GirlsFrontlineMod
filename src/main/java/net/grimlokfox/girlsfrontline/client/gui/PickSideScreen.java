package net.grimlokfox.girlsfrontline.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.grimlokfox.girlsfrontline.world.inventory.PickSideMenu;
import net.grimlokfox.girlsfrontline.network.PickSideButtonMessage;
import net.grimlokfox.girlsfrontline.init.GflmodModScreens;
import net.grimlokfox.girlsfrontline.GflmodMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class PickSideScreen extends AbstractContainerScreen<PickSideMenu> implements GflmodModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	Button button_for_glory_of_gk;
	Button button_im_on_my_own;
	Button button_bring_the_doom;

	public PickSideScreen(PickSideMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 315;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(ResourceLocation.parse("gflmod:textures/screens/tdoll.png"), this.leftPos + 38, this.topPos + 65, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("gflmod:textures/screens/head.png"), this.leftPos + 147, this.topPos + 66, 0, 0, 32, 32, 32, 32);
		guiGraphics.blit(ResourceLocation.parse("gflmod:textures/screens/sangvislogo.png"), this.leftPos + 247, this.topPos + 67, 0, 0, 32, 32, 32, 32);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.gflmod.pick_side.label_choose_your_side"), 118, 9, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.gflmod.pick_side.label_sangvis_ferri"), 230, 54, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.gflmod.pick_side.label_mercenary"), 141, 52, -1, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.gflmod.pick_side.label_griffin_kryuger"), 12, 53, -1, false);
	}

	@Override
	public void init() {
		super.init();
		button_for_glory_of_gk = Button.builder(Component.translatable("gui.gflmod.pick_side.button_for_glory_of_gk"), e -> {
			int x = PickSideScreen.this.x;
			int y = PickSideScreen.this.y;
			if (true) {
				GflmodMod.PACKET_HANDLER.sendToServer(new PickSideButtonMessage(0, x, y, z));
				PickSideButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 1, this.topPos + 101, 113, 20).build();
		this.addRenderableWidget(button_for_glory_of_gk);
		button_im_on_my_own = Button.builder(Component.translatable("gui.gflmod.pick_side.button_im_on_my_own"), e -> {
			int x = PickSideScreen.this.x;
			int y = PickSideScreen.this.y;
			if (true) {
				GflmodMod.PACKET_HANDLER.sendToServer(new PickSideButtonMessage(1, x, y, z));
				PickSideButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}).bounds(this.leftPos + 116, this.topPos + 101, 92, 20).build();
		this.addRenderableWidget(button_im_on_my_own);
		button_bring_the_doom = Button.builder(Component.translatable("gui.gflmod.pick_side.button_bring_the_doom"), e -> {
			int x = PickSideScreen.this.x;
			int y = PickSideScreen.this.y;
			if (true) {
				GflmodMod.PACKET_HANDLER.sendToServer(new PickSideButtonMessage(2, x, y, z));
				PickSideButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}).bounds(this.leftPos + 209, this.topPos + 101, 103, 20).build();
		this.addRenderableWidget(button_bring_the_doom);
	}
}