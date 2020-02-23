package mod.dragonita.fantasymod.init;

import mod.dragonita.fantasymod.Main;
import mod.dragonita.fantasymod.Enum.ModArmorMaterial;
import mod.dragonita.fantasymod.Enum.ModItemTier;
import mod.dragonita.fantasymod.customthings.UnicornSpawnEgg;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class ModItems
{	
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);
	
	public static final RegistryObject<Item> RAINBOW_APPLE = ITEMS.register("rainbow_apple",() -> new Item(new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP).food(new Food.Builder().hunger(6).saturation(10.0F).effect(new EffectInstance(Effects.ABSORPTION, 3600, 5), 1).effect(new EffectInstance(Effects.REGENERATION, 3600, 5), 1).effect(new EffectInstance(Effects.HEALTH_BOOST, 3600, 5), 1).effect(new EffectInstance(Effects.INSTANT_HEALTH, 3600, 5), 1).effect(new EffectInstance(Effects.JUMP_BOOST, 3600, 5), 1).effect(new EffectInstance(Effects.SPEED, 3600, 5), 1).effect(new EffectInstance(Effects.STRENGTH, 3600, 5), 1).build())));
	
	public static final RegistryObject<Item> RAINBOW_INGOT = ITEMS.register("rainbow_ingot",() -> new Item(new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<Item> RAINBOW_STICK = ITEMS.register("rainbow_stick",() -> new Item(new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	
	public static final RegistryObject<ArmorItem> RAINBOW_HELMET = ITEMS.register("rainbow_helmet", () -> new ArmorItem(ModArmorMaterial.FANTASY, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<ArmorItem> RAINBOW_CHESTPLATE = ITEMS.register("rainbow_chestplate", () -> new ArmorItem(ModArmorMaterial.FANTASY, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<ArmorItem> RAINBOW_LEGGINGS = ITEMS.register("rainbow_leggings", () -> new ArmorItem(ModArmorMaterial.FANTASY,EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<ArmorItem> RAINBOW_BOOTS = ITEMS.register("rainbow_boots", () -> new ArmorItem(ModArmorMaterial.FANTASY, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));

	
	public static final RegistryObject<SwordItem> FULL_RAINBOW_SWORD = ITEMS.register("full_rainbow_sword", () -> new SwordItem(ModItemTier.FANTASY, 15, 2, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<PickaxeItem> FULL_RAINBOW_PICKAXE = ITEMS.register("full_rainbow_pickaxe", () -> new PickaxeItem(ModItemTier.FANTASY, 12, 3F, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<ShovelItem> FULL_RAINBOW_SHOVEL = ITEMS.register("full_rainbow_shovel", () -> new ShovelItem(ModItemTier.FANTASY, 5, 3, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<AxeItem> FULL_RAINBOW_AXE = ITEMS.register("full_rainbow_axe", () -> new AxeItem(ModItemTier.FANTASY, 18, 4.5F, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<HoeItem> FULL_RAINBOW_HOE = ITEMS.register("full_rainbow_hoe", () -> new HoeItem(ModItemTier.FANTASY, 2, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));	
	
	public static final RegistryObject<SwordItem> RAINBOW_SWORD = ITEMS.register("rainbow_sword", () -> new SwordItem(ModItemTier.FANTASY, 7, 5, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<PickaxeItem> RAINBOW_PICKAXE = ITEMS.register("rainbow_pickaxe", () -> new PickaxeItem(ModItemTier.FANTASY, 6, 6F, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<ShovelItem> RAINBOW_SHOVEL = ITEMS.register("rainbow_shovel", () -> new ShovelItem(ModItemTier.FANTASY, 2, 5, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<AxeItem> RAINBOW_AXE = ITEMS.register("rainbow_axe", () -> new AxeItem(ModItemTier.FANTASY, 10, 7.5F, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
	public static final RegistryObject<HoeItem> RAINBOW_HOE = ITEMS.register("rainbow_hoe", () -> new HoeItem(ModItemTier.FANTASY, 5, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));

	public static final RegistryObject<Item> UNICORN_ENTITY_EGG = ITEMS.register("unicorn_entity_egg", () -> new UnicornSpawnEgg(ModEntityTypes.UNICORN, 0xF0A5A2, 0xA9672B, new Item.Properties().group(ModItemGroups.RAINBOW_MOD_GROUP)));
}