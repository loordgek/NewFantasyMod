package mod.dragonita.fantasymod.entities;

import java.util.Optional;

import org.apache.logging.log4j.Logger;

import mod.dragonita.fantasymod.Main;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.goal.PanicGoal;
import net.minecraft.entity.ai.goal.PrioritizedGoal;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.network.IPacket;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import net.minecraftforge.fml.network.FMLPlayMessages;
import net.minecraftforge.fml.network.NetworkHooks;

public class UnicornEntity extends HorseEntity{
	private UnicornEntity entity = this;
	private static Logger LOGGER = Main.LOGGER;
	
	public UnicornEntity(final EntityType<? extends UnicornEntity> entityType, final World world) {
		super(entityType, world);
	}

	@Override
	protected void registerAttributes() {
		super.registerAttributes();

		final double baseSpeed = this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).getBaseValue();
		final double baseHealth = this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).getBaseValue();
		// Multiply base health and base speed by one and a half
		this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(baseSpeed * 1.5D);
		this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(baseHealth * 1.5D);
	}
	
	/*
	 * This Function return true if the 
	 * running Goal was the same as in the parameters
	 * @return true if it was the same, else false
	 */
	public boolean CompareGoal(Class<PanicGoal> TargetGoal) {
		boolean ReturnValue = false;
		if(entity.goalSelector.getRunningGoals().findFirst() != null) {
			Optional<PrioritizedGoal> FindedGoalList = entity.goalSelector.getRunningGoals().findFirst();
			LOGGER.info("First Controll was passed: " + FindedGoalList.toString());
			
			if(FindedGoalList.filter(goal -> goal.getGoal().getClass().equals(TargetGoal)).isPresent() == true) {
				//Optional<PrioritizedGoal> FindedGoal = FindedGoalList.filter(goal -> goal.getGoal().getClass().equals(TargetGoal.getClass()));
				LOGGER.info("Second Controll was passed");
				
				//if(FindedGoal.get().getGoal() == TargetGoal) {
					LOGGER.info("Entity has a Goal");
					ReturnValue = true;
					return ReturnValue;
				//}
			} else {
				LOGGER.info("Nope, here was a nil on the 2. controll");
				LOGGER.info("TestValues: " + FindedGoalList.toString());
				//LOGGER.info(" ");
				return ReturnValue;
			}
		} else {
			LOGGER.info("Nope, here was a nil on the 1. controll");
			return ReturnValue;
		}
	}
	
	/**
	 * Creates a child new entity from the parent entity.
	 * Can be used to set additional on the child entity based on the parent.
	 *
	 * @param parent The entity that made this child
	 * @return A new WildBoar
	 * @see AbstractHorseEntity#setOffspringAttributes(AgeableEntity, AbstractHorseEntity)
	 */
	@Override
	public UnicornEntity createChild(final AgeableEntity parent) {
		// Use getType to support overrides in subclasses
		return (UnicornEntity) getType().create(this.world);
	}
	
	/**
	 * Called on the logical server to get a packet to send to the client containing data necessary to spawn your entity.
	 * Using Forge's method instead of the default vanilla one allows extra stuff to work such as sending extra data,
	 * using a non-default entity factory and having {@link IEntityAdditionalSpawnData} work.
	 *
	 * It is not actually necessary for our WildBoarEntity to use Forge's method as it doesn't need any of this extra
	 * functionality, however, this is an example mod and many modders are unaware that Forge's method exists.
	 *
	 * @return The packet with data about your entity
	 * @see FMLPlayMessages.SpawnEntity
	 */
	@Override
	public IPacket<?> createSpawnPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}
}