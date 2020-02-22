package mod.dragonita.fantasymod;

import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import mod.dragonita.fantasymod.init.ModBlocks;
import mod.dragonita.fantasymod.init.ModDimensions;
import mod.dragonita.fantasymod.init.ModEntityTypes;
import mod.dragonita.fantasymod.init.ModItems;
import mod.dragonita.fantasymod.init.ModTileEntityTypes;
import mod.dragonita.fantasymod.world.gen.FantasyOreGen;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@SuppressWarnings("deprecation")
@Mod(Main.MODID)
public final class Main implements DeferredWorkQueue.CheckedRunnable
{
	public static final String MODID = "fantasymod";
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	public Main()
	{
		//DeferredWorkQueue.
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

		LOGGER.debug("Hello from Fantasy Mod");
		
		final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		// Register Deferred Registers (Does not need to be before Configs)
		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
		ModEntityTypes.ENTITY_TYPES.register(modEventBus);
		ModTileEntityTypes.TILE_ENTITY_TYPES.register(modEventBus);
	}
	/*
	@SuppressWarnings("deprecation")
	public void WorkQueue(final DeferredWorkQueue event) {
		FantasyOreGen.generateOre();
    	LOGGER.info("All Ores are loaded");
	}
	*/
	
	public void setup(final FMLCommonSetupEvent event)
	{
    	//FantasyOreGen.generateOre();
    	//LOGGER.info("All Ores are loaded");
        //LOGGER.info("HELLO FROM PREINIT");
	}
	
    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client
        LOGGER.info("Got game settings {}", event.getMinecraftSupplier().get().gameSettings);
    }
    
    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // some example code to dispatch IMC to another mod
        InterModComms.sendTo("fantasymod", "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }
    
    private void processIMC(final InterModProcessEvent event)
    {
        // some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.getMessageSupplier().get()).
                collect(Collectors.toList()));
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
        // do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
    
    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    	//FantasyOreGen.generateOre();
    	//LOGGER.info("All Ores are loaded");
    }
    /*
	public static void registerEntityWorldSpawn(EntityType<?> entity, Biome... biomes)
	{
		for(Biome biome : biomes)
		{
			if(biome != null)
			{
				biome.getSpawns(entity.getClassification()).add(new SpawnListEntry(entity, 20, 1, 10));
			}
		}
	}
     */
    
	@Override
	public void run() throws Exception {
		ModDimensions.registerDimensions();
		LOGGER.info("Dimensions are loaded");
		FantasyOreGen.generateOre();
    	LOGGER.info("Ores are loaded");
	}	
}