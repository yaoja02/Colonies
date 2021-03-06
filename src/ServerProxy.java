package colonies.src;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;


public class ServerProxy implements IGuiHandler
{
	public static String ITEMS_PNG  = "/colonies/gfx/Items.png";
	public static String BLOCK_PNG  = "/colonies/gfx/block.png";

	// Skins are going to be switched to variables, so players can download skins
	/*
	public static String M_SWIMSKIN_PNG      = "/colonies/anglewyrm/gfx/m-swimskin.png";
	public static String F_SWIMSKIN_PNG      = "/colonies/anglewyrm/gfx/f-swimskin.png";
	public static String WANDERERSKIN_PNG    = "/colonies/grahammarcellus/gfx/unemployedskin1.png";
	public static String MINERSKIN_PNG       = "/colonies/grahammarcellus/gfx/minerskin.png";
	public static String WIFESKIN_PNG        = "/colonies/pmardle/gfx/FemaleBasic.png";
	*/
	public static String BLACKSMITHCHEST_PNG = "/colonies/pmardle/gfx/Blacksmithchest.png";
	public static String BUILDERCHEST_PNG    = "/colonies/pmardle/gfx/Builderchest.png";
	public static String FARMERCHEST_PNG     = "/colonies/pmardle/gfx/Farmerchest.png";
	public static String HOUSECHEST_PNG      = "/colonies/pmardle/gfx/Housechest.png";
	public static String LOGGINGCAMP_PNG     = "/colonies/pmardle/gfx/Lumberjackchest.png";
	public static String MINERCHEST_PNG      = "/colonies/irontaxi/gfx/minerChest.png";
	public static String TOWNHALLCHEST_PNG   = "/colonies/gfx/TownHallChest.png";
	public static String HUNTERBLIND_PNG     = "/colonies/kzolp67/gfx/HunterBlind.png";
	public static String CHESTCONTAINER_PNG  = "/colonies/anglewyrm/gfx/invalidChest.png";
	public static String FISHERMANHUT_PNG    = "/colonies/irontaxi/gfx/fishermanhut.png";
	public static String GUARDHOUSE_PNG  	 = "/colonies/boycat97/gfx/guardHouse.png";
	public static String ALCHEMISTCHEST_PNG  = "/colonies/gfx/alchemistChest.png";
	
    public void registerRenderInformation()
    {

    }

    public void registerTileEntitySpecialRenderer(Class<TileEntityColoniesChest> renderer)
    {
        // TODO: Add special render types here
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z)
    {
        return null;
    }

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world,
            int x, int y, int z)
    {
        return null;
    }

    public World getClientWorld()
    {
        return null;
    }
}
