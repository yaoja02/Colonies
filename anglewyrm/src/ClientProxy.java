package colonies.anglewyrm.src;

import net.minecraft.src.ChestItemRenderHelper;
import net.minecraft.src.World;
import net.minecraftforge.client.MinecraftForgeClient;
import colonies.vector67.src.ColoniesChestRenderHelper;
import colonies.vector67.src.TileEntityColoniesChest;
import colonies.vector67.src.TileEntityColoniesChestRenderer;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;


public class ClientProxy extends ServerProxy
{
	@Override
	public void registerRenderInformation() {
		
		// renderers
		ChestItemRenderHelper.instance = new ColoniesChestRenderHelper();
		
		// old code for custom female model
		//RenderingRegistry.instance().registerEntityRenderingHandler(
		//		EntityWife.class, new RenderLiving(new ModelFemale(), 0.5F));
		
		// Grave Stone (start)
		//RenderingRegistry.instance().registerEntityRenderingHandler(
		//		EntityGraveStone.class, new RenderLiving(new ModelGraveStone(), 0.5F));		
		
		// preloaded textures
        MinecraftForgeClient.preloadTexture(ITEMS_PNG);
		MinecraftForgeClient.preloadTexture(BLOCK_PNG);
		
        MinecraftForgeClient.preloadTexture(BLACKSMITHCHEST_PNG);
        MinecraftForgeClient.preloadTexture(BUILDERCHEST_PNG);
        MinecraftForgeClient.preloadTexture(FARMERCHEST_PNG);
        MinecraftForgeClient.preloadTexture(HOUSECHEST_PNG);
        MinecraftForgeClient.preloadTexture(LOGGINGCAMP_PNG);
        MinecraftForgeClient.preloadTexture(MINERCHEST_PNG);
        MinecraftForgeClient.preloadTexture(TOWNHALLCHEST_PNG);
        MinecraftForgeClient.preloadTexture(HUNTERBLIND_PNG);
        MinecraftForgeClient.preloadTexture(CHESTCONTAINER_PNG);
	}


	public void registerTileEntitySpecialRenderer(Class<TileEntityColoniesChest> colonieschesttileentity) {
		ClientRegistry.bindTileEntitySpecialRenderer(colonieschesttileentity, new TileEntityColoniesChestRenderer());
	}
	@Override
    public World getClientWorld(){
        return FMLClientHandler.instance().getClient().theWorld;
    }
}
