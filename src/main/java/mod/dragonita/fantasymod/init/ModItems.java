package mod.dragonita.fantasymod.init;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.Enum.ModItemTier;
import mod.dragonita.fantasymod.customthings.UnicornSpawnEgg;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems
{
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);
	
	public static final RegistryObject<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot",() -> new Item(new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<Item> RAINBOW_STICK = ITEMS.register("rainbow_stick",() -> new Item(new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	
	public static final RegistryObject<SwordItem> RAINBOW_SWORD = ITEMS.register("rainbow_sword", () -> new SwordItem(ModItemTier.FANTASY, 7, 5, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<PickaxeItem> RAINBOW_PICKAXE = ITEMS.register("rainbow_pickaxe", () -> new PickaxeItem(ModItemTier.FANTASY, 6, 6F, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<ShovelItem> RAINBOW_SHOVEL = ITEMS.register("rainbow_shovel", () -> new ShovelItem(ModItemTier.FANTASY, 2, 5, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<AxeItem> RAINBOW_AXE = ITEMS.register("rainbow_axe", () -> new AxeItem(ModItemTier.FANTASY, 10, 7.5F, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<HoeItem> RAINBOW_HOE = ITEMS.register("rainbow_hoe", () -> new HoeItem(ModItemTier.FANTASY, 5, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));

	public static final RegistryObject<Item> UNICORN_ENTITY_EGG = ITEMS.register("unicorn_entity_egg", () -> new UnicornSpawnEgg(ModEntityTypes.UNICORN, 0xF0A5A2, 0xA9672B, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
}