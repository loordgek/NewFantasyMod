package mod.dragonita.fantasymod.client.renders;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.client.models.ModelUnicorn;
import mod.dragonita.fantasymod.client.renders.layer.UnicornSaddleLayer;
import mod.dragonita.fantasymod.entities.UnicornEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = Main.MODID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class UnicornEntityRender extends MobRenderer<UnicornEntity, ModelUnicorn>
{	
	private static final ResourceLocation UNICORN = new ResourceLocation(Main.MODID, "textures/entity/unicorn/wild_boar.png");

	public UnicornEntityRender(final EntityRendererManager manager) {
		super(manager, new ModelUnicorn(), 0.7F);
		this.addLayer(new UnicornSaddleLayer(this));
	}

	@Override
	public ResourceLocation getEntityTexture(final UnicornEntity entity) {
		return UNICORN;
	}
}
