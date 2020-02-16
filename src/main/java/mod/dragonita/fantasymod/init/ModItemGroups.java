package mod.dragonita.fantasymod.init;

import javax.annotation.Nonnull;

import com.google.common.base.Supplier;

import mod.dragonita.fantasymod.Main;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public final class ModItemGroups {
	
	public static final ItemGroup RAINBOW_MOD_GROUP = new ModItemGroup(Main.MODID, () -> new ItemStack(ModItems.RAINBOW_INGOT.get()));

	public static final class ModItemGroup extends ItemGroup {

		@Nonnull
		private final Supplier<ItemStack> iconSupplier;

		public ModItemGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier) {
			super(name);
			this.iconSupplier = iconSupplier;
		}

		@Override
		@Nonnull
		public ItemStack createIcon() {
			return iconSupplier.get();
		}
	}
}