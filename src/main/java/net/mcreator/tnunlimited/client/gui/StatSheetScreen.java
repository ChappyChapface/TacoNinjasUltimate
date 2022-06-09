
package net.mcreator.tnunlimited.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.tnunlimited.world.inventory.StatSheetMenu;
import net.mcreator.tnunlimited.network.TnunlimitedModVariables;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class StatSheetScreen extends AbstractContainerScreen<StatSheetMenu> {
	private final static HashMap<String, Object> guistate = StatSheetMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public StatSheetScreen(StatSheetMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("tnunlimited:textures/stat_sheet.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "MAX HP:", 15, 16, -12829636);
		this.font.draw(poseStack, "ARMOR:", 15, 25, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).HPDisplay) + "", 87, 16, -12829636);
		this.font.draw(poseStack, "MULTIPLIERS", 6, 52, -12829636);
		this.font.draw(poseStack, "MAIN STATS", 6, 7, -12829636);
		this.font.draw(poseStack, "STRENGTH:", 15, 88, -12829636);
		this.font.draw(poseStack, "SPEED:", 15, 70, -12829636);
		this.font.draw(poseStack, "ARMOR:", 15, 61, -12829636);
		this.font.draw(poseStack, "SWIM SPD:", 15, 79, -12829636);
		this.font.draw(poseStack, "SLASH STR:", 15, 97, -12829636);
		this.font.draw(poseStack, "BLUNT STR:", 15, 106, -12829636);
		this.font.draw(poseStack, "GUN STR:", 15, 115, -12829636);
		this.font.draw(poseStack, "FAMILIAR STR:", 15, 124, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).ArmorIncrease) + "", 87, 61, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).OmniStrengthIncrease) + "", 87, 88, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).familiarStrengthIncrease) + "", 87, 124, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).movementSpeedIncrease) + "", 87, 70, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).swimSpeedIncrease) + "", 87, 79, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).slashStrengthIncrease) + "", 87, 97, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).bluntStrengthIncrease) + "", 87, 106, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).gunStrengthIncrease) + "", 87, 115, -12829636);
		this.font.draw(poseStack, "" + ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).ArmorDisplay) + "", 87, 25, -12829636);
		this.font.draw(poseStack, "SATURATION:", 15, 34, -12829636);
		this.font.draw(poseStack, "" + (int) ((entity.getCapability(TnunlimitedModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new TnunlimitedModVariables.PlayerVariables())).SatDisplay) + "", 87, 34, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
