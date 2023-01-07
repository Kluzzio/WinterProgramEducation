package timefall.winterprogram;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import timefall.winterprogram.lessons.WorkingSpace;
import timefall.winterprogram.lessons.completed.LoopsAndSwitch;
import timefall.winterprogram.lessons.completed.introtooop.practice.Animal;
import timefall.winterprogram.lessons.completed.introtooop.practice.AnimalDiet;
import timefall.winterprogram.lessons.completed.introtooop.practice.Foods;

public class WinterProgram implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		/* Jan 3 lecture */
		// LoopsAndSwitch.driver(82);

		/* Jan 5 lecture */
		WorkingSpace.driver();

		Animal myFavHerbivore = new Animal(AnimalDiet.HERBIVORE, 400);

		myFavHerbivore.eat(Foods.BEEF);
		myFavHerbivore.clearBowels();
	}
}
