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

public class UnicornSaddleLayer extends LayerRenderer<UnicornEntity, ModelUnicorn> {

	private static final ResourceLocation TEXTURE = new ResourceLocation(Main.MODID, "textures/entity/unicorn/wild_boar_saddle.png");

	private final ModelUnicorn unicornModel = new ModelUnicorn();

	public UnicornSaddleLayer(IEntityRenderer<UnicornEntity, ModelUnicorn> p_i50927_1_) {
		super(p_i50927_1_);
	}

	@Override
	public void func_225628_a_(MatrixStack matrixStack, IRenderTypeBuffer renderTypeBuffer, int light, UnicornEntity entity, float p_225628_5_, float p_225628_6_, float p_225628_7_, float p_225628_8_, float p_225628_9_, float p_225628_10_) {
		if (entity.isHorseSaddled()) {
			this.getEntityModel().setModelAttributes(this.unicornModel);
			this.unicornModel.setLivingAnimations(entity, p_225628_5_, p_225628_6_, p_225628_7_);
			this.unicornModel.func_225597_a_(entity, p_225628_5_, p_225628_6_, p_225628_8_, p_225628_9_, p_225628_10_);
			IVertexBuilder buffer = renderTypeBuffer.getBuffer(RenderType.func_228640_c_(TEXTURE));
			this.unicornModel.func_225598_a_(matrixStack, buffer, light, OverlayTexture.field_229196_a_, p_225628_5_, p_225628_6_, p_225628_7_, p_225628_8_);
		}		
	}

}