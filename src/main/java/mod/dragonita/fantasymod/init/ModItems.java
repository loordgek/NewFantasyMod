package mod.dragonita.fantasymod.init;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.customthings.UnicornSpawnEgg;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);
	
	public static final RegistryObject<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot",() -> new Item(new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<Item> UNICORN_ENTITY_EGG = ITEMS.register("unicorn_entity_egg", () -> new UnicornSpawnEgg(ModEntityTypes.UNICORN, 0xF0A5A2, 0xA9672B, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
}