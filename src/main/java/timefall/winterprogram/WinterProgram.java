package timefall.winterprogram;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import timefall.winterprogram.enchantment.EnchantRegistry;
import timefall.winterprogram.lessons.WorkingSpace;
import timefall.winterprogram.lessons.completed.polymorphism.Polymorphism;

import java.util.*;

public class WinterProgram implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static Identifier ID(String name) {
		return new Identifier("winterprogram", name);
	}

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		/* Jan 3 lecture */
		// LoopsAndSwitch.driver(82);

		/* Jan 5 lecture */
		//OOPIntro.driver();

		/* Jan 6 lecture */
		//Practice.driver();

		/* Jan 11 lecture */
		//Find sword extension example in SwordItemChild.class
		//Collections.driver();

		/* Jan 12 lecture */
		//Polymorphism.driver();

		/* Jan 13 lecture */
		WorkingSpace.driver();

		EnchantRegistry.init();

	}
}
