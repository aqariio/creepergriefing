package aqario.creepergriefing;

import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreeperGriefing implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("CreeperGriefing");

	public static GameRules.Key<GameRules.BooleanRule> DO_CREEPER_GRIEFING;

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Loading {}", mod.metadata().name());

		DO_CREEPER_GRIEFING = GameRuleRegistry.register("creeperGriefing",
			GameRules.Category.MOBS, GameRuleFactory.createBooleanRule(true));
	}
}
