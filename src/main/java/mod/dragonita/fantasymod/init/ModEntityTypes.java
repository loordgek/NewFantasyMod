package mod.dragonita.fantasymod.init;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.entities.UnicornEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModEntityTypes {
	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, Main.MODID);

    public static final RegistryObject<EntityType<UnicornEntity>> UNICORN = ENTITY_TYPES.register("unicorn_entity", () -> EntityType.Builder.create(UnicornEntity::new, EntityClassification.CREATURE)
            .size(1, 1)
            .build("unicorn_entity"));
}