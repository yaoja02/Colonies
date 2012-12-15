package colonies.stabtokill.src;

import net.minecraft.src.Achievement;
import net.minecraftforge.common.AchievementPage;
import colonies.anglewyrm.src.ColoniesMain;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * 
 * @author stabtokill
 *
 */
public class ColoniesAchievements {
	
	static final Achievement TownStarted = new Achievement(50, "TownStarted", 1, 1, ColoniesMain.townHall, null).registerAchievement();	
	static final Achievement ToTheDepts = new Achievement(51, "ToTheDepts", 3, 2, ColoniesMain.minerChest, null).registerAchievement();
	
	public static AchievementPage page1 = new AchievementPage("Colonies", TownStarted, ToTheDepts);
	
	private static void addAchievementName(String ach, String name) {
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	private static void addAchievementDesc(String ach, String desc) {
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}

	public static void addAchievementLocalizations() {
		addAchievementName("TownStarted", "First Town Started");
		addAchievementDesc("TownStarted", "You Made A Town");
		addAchievementName("ToTheDepts", "Miner box");
		addAchievementDesc("ToTheDepts", "Made A Helpful Miner");
	}

}