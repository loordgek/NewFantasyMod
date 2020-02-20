package mod.dragonita.fantasymod.client.renders.layer;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.client.models.ModelUnicorn;
import mod.dragonita.fantasymod.entities.UnicornEntity;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.util.ResourceLocation;

/**

 * Copy of {@link SaddleLayer} with tweaks to make it work for WildBoarEntity.

 *

 * @author Cadiboo

 */

public class UnicornSaddleLayer extends LayerRenderer<UnicornEntity, ModelUnicorn<UnicornEntity>> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entity/unicorn/wild_boar_saddle.png");

	private final ModelUnicorn<UnicornEntity> unicornModel = new ModelUnicorn<UnicornEntity>();

	public UnicornSaddleLayer(IEntityRenderer<UnicornEntity, ModelUnicorn<UnicornEntity>> p_i50927_1_) {
		super(p_i50927_1_);
	}

	@Override
	public void render(MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light, UnicornEntity entity, float p_225628_5_, float p_225628_6_, float p_225628_7_, float p_225628_8_, float p_225628_9_, float p_225628_10_) {
		if (entity.isHorseSaddled()) {
			this.getEntityModel();
			//this.unicornModel.setLivingAnimations(entity, p_225628_5_, p_225628_6_, p_225628_7_);
			this.unicornModel.setRotationAngles(entity, p_225628_5_, p_225628_6_, p_225628_8_, p_225628_9_, p_225628_10_);
			IVertexBuilder buffer = renderTypeBuffer.getBuffer(RenderType.getEntityCutoutNoCull(TEXTURE));
			this.unicornModel.render(matrixStack, buffer, light, OverlayTexture.NO_OVERLAY, p_225628_5_, p_225628_6_, p_225628_7_, p_225628_8_);
		}		
	}
	
}