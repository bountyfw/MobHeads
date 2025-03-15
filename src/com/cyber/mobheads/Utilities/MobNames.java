package com.cyber.mobheads.Utilities;

import org.bukkit.entity.*;
import org.bukkit.entity.Villager.Profession;


public enum MobNames {
	Bat,
	Camel,
	Sniffer,
	Blaze,
	Cave_Spider,
	Chicken,
	Cow,
	Creeper,
	Charged_Creeper,
	Dolphin,
	Donkey,
	Drowned,
	Elder_Guardian,
	Enderman,
	Endermite,
	Ender_Dragon,
	Evoker,
	Ghast,
	Guardian,
	Black_Horse,
	Brown_Horse,
	Chestnut_Horse,
	Creamy_Horse,
	Dark_Brown_Horse,
	Gray_Horse,
	White_Horse,
	Skeleton_Horse,
	Zombie_Horse,
	Husk,
	Illusioner,
	Iron_Golem,
	Brown_Llama,
	Creamy_Llama,
	Gray_Llama,
	White_Llama,
	Brown_Llama_Trader,
	Creamy_Llama_Trader,
	Gray_Llama_Trader,
	White_Llama_Trader,
	Magma_Cube,
	Mooshroom,
	Mule,
	Ocelot,
	Blue_Parrot,
	Cyan_Parrot,
	Gray_Parrot,
	Green_Parrot,
	Red_Parrot,
	Phantom,
	Pig,
	Polar_Bear,
	Black_Rabbit,
	Black_and_White_Rabbit,
	Brown_Rabbit,
	Gold_Rabbit,
	Salt_and_Pepper_Rabbit,
	The_Killer_Bunny,
	Toast_Rabbit,
	White_Rabbit,
	Black_Sheep,
	Blue_Sheep,
	Brown_Sheep,
	Cyan_Sheep,
	Gray_Sheep,
	Green_Sheep,
	Light_Blue_Sheep,
	Lime_Sheep,
	Magenta_Sheep,
	Orange_Sheep,
	Pink_Sheep,
	Purple_Sheep,
	Rainbow_Sheep,
	Red_Sheep,
	Light_Gray_Sheep,
	White_Sheep,
	Yellow_Sheep,
	Shulker,
	Silverfish,
	Skeleton,
	Slime,
	Snow_Golem,
	Spider,
	Squid,
	Stray,
	Turtle,
	Vex,
	Vindicator,
	Witch,
	Wither,
	Wither_Skeleton,
	Zombie,
	Zombie_Pigman,
	Armadillo,
	Bogged,
	Breeze,
	
	Zombie_Butcher_Villager,
	Zombie_Cleric_Villager,
	Zombie_Farmer_Villager,
	Zombie_Librarian_Villager,
	Zombie_Nitwit_Villager,
	Zombie_Smith_Villager,
	/* From here the missing zombie villager professions */
	Zombie_Armorer_Villager,
	Zombie_Cartographer_Villager,
	Zombie_Fisherman_Villager,
	Zombie_Fletcher_Villager,
	Zombie_Leatherworker_Villager,
	Zombie_Mason_Villager,
	Zombie_Shepherd_Villager,
	Zombie_Weaponsmith_Villager,
	Zombie_Villager,

	Bee,

	/* 1.17 Mobs */
	Goat,
	Screaming_Goat,
	Lucy_Axolotl,
	Wild_Axolotl,
	Gold_Axolotl,
	Cyan_Axolotl,
	Blue_Axolotl,
	Glow_Squid,
	/* 1.17 Mobs */
	
	Warden,
	Allay,
	Tadpole,
	/*
	 * Frogs
	 */
	Temperate_Frog,
	Warm_Frog,
	Cold_Frog,

	Villager,
	Villager_Armorer,
	Villager_Butcher,
	Villager_Cartographer,
	Villager_Cleric,
	Villager_Farmer,
	Villager_Fisherman,
	Villager_Fletcher,
	Villager_Librarian,
	Villager_Shepherd,
	Villager_Weaponsmith,
	/* From here the missing villager professions */
	Villager_Nitwit,
	Villager_Leatherworker,
	Villager_Mason,
	Villager_Toolsmith,

	Tropical_Fish,
	Cod,
	Salmon,
	Pufferfish,

	Wandering_Trader,
	Pillager,
	Ravager,
	Mooshroom_Brown,

	Panda_Normal,
	Panda_Aggressive,
	Panda_Lazy,
	Panda_Brown,
	Panda_Worried,
	Panda_Playful,
	Panda_Weak,

	Fox_Normal,
	Fox_Snow,

	//These are the invalid cats. Still have to load them:
	Black_Cat,
	Ginger_Cat,
	Siamese_Cat,

	Cat_AllBack,
	Cat_Black,
	Cat_British_ShortHair,
	Cat_Calico,
	Cat_Jellie,
	Cat_Persian,
	Cat_Ragdoll,
	Cat_Red,
	Cat_Siamese,
	Cat_Tabby,
	Cat_White,
	
	/*
	 * Wolf Types
	 */
    Ashen_Wolf,
    Black_Wolf,
    Chestnut_Wolf,
    Default_Wolf,
    Pale_Wolf,
    Rusty_Wolf,
    Snowy_Wolf,
    Spotted_Wolf,
    Striped_Wolf,
    Woods_Wolf,
	Wild_Wolf,
	Tamed_Wolf,
	
	
	Hoglin,
	Zoglin,
	Piglin,
	Piglin_Brute,
	Giant,
	Strider,

	/*
	 * 1.21.4
	 */
	Creaking;

	public static MobNames getName(Entity entity) {
		if(entity.getType().name().equalsIgnoreCase("ZOMBIFIED_PIGLIN")) {
			return Zombie_Pigman;
		}
		if (entity.getType().name().equalsIgnoreCase("ARMADILLO")) {
			return Armadillo;
		}
		if (entity.getType().name().equalsIgnoreCase("BOGGED")) {
			return Bogged;
		}
		
		switch (entity.getType()) {
			case BAT:
				return Bat;
			case CAMEL:
				return Camel;
			case SNIFFER:
				return Sniffer;
			case WARDEN:
				return Warden;
			case ALLAY:
				return Allay;
			case TADPOLE:
				return Tadpole;
			case FROG:
				return getFrogName((Frog) entity);
			case BLAZE:
				return Blaze;
			case OCELOT:
				return Ocelot;
			case CAVE_SPIDER:
				return Cave_Spider;
			case CHICKEN:
				return Chicken;
			case COW:
				return Cow;
			case CREEPER:
				return getCreeperName((Creeper) entity);
			case DOLPHIN:
				return Dolphin;
			case DONKEY:
				return Donkey;
			case DROWNED:
				return Drowned;
			case ELDER_GUARDIAN:
				return Elder_Guardian;
			case ENDERMAN:
				return Enderman;
			case ENDERMITE:
				return Endermite;
			case ENDER_DRAGON:
				return Ender_Dragon;
			case EVOKER:
				return Evoker;
			case GHAST:
				return Ghast;
			case GIANT:
				return Giant;
			case GUARDIAN:
				return Guardian;
			case HORSE:
				return getHorseName((Horse) entity);
			case ZOMBIE_HORSE:
				return Zombie_Horse;
			case SKELETON_HORSE:
				return Skeleton_Horse;
			case HUSK:
				return Husk;
			case ILLUSIONER:
				return Illusioner;
			case IRON_GOLEM:
				return Iron_Golem;
			case LLAMA:
				return getLLamaName((Llama) entity);
			case TRADER_LLAMA:
				return getLLamaTraderName((TraderLlama) entity);
			case MAGMA_CUBE:
				return Magma_Cube;
			case MOOSHROOM:
				return getMooshroomName((MushroomCow) entity);
			case MULE:
				return Mule;
			case PARROT:
				return getParrotName((Parrot) entity);
			case PHANTOM:
				return Phantom;
			case PIG:
				return Pig;
			case POLAR_BEAR:
				return Polar_Bear;
			case RABBIT:
				return getRabbitName((Rabbit) entity);
			case SHEEP:
				return getSheepName((Sheep) entity);
			case SHULKER:
				return Shulker;
			case SILVERFISH:
				return Silverfish;
			case SKELETON:
				return Skeleton;
			case SLIME:
				return Slime;
			case SNOW_GOLEM:
				return Snow_Golem;
			case SPIDER:
				return Spider;
			case SQUID:
				return Squid;
			case GLOW_SQUID:
				return Glow_Squid;
			case AXOLOTL:
				return getAxolotlName((Axolotl)entity);
			case GOAT:
				return getGoatName((Goat)entity);
			case STRAY:
				return Stray;
			case TURTLE:
				return Turtle;
			case VEX:
				return Vex;
			case VILLAGER:
				return getVillagerName((Villager)entity);
			case VINDICATOR:
				return Vindicator;
			case WITCH:
				return Witch;
			case WITHER:
				return Wither;
			case WITHER_SKELETON:
				return Wither_Skeleton;
			case WOLF:
				return getWolfName((Wolf) entity);
			case ZOMBIE:
				return Zombie;
			case ZOMBIE_VILLAGER:
				return getZombieVillagerName((ZombieVillager) entity);
			case COD:
				return Cod;
			case PUFFERFISH:
				return Pufferfish;
			case SALMON:
				return Salmon;
			case TROPICAL_FISH:
				return Tropical_Fish;
			case ARROW:
				return getFishName(entity);
			case WANDERING_TRADER:
				return Wandering_Trader;
			case PILLAGER:
				return Pillager;
			case RAVAGER:
				return Ravager;
			case CAT:
				return getCatName((Cat) entity);
			case PANDA:
				return getPandaName((Panda) entity);
			case BEE:
				return Bee;
			case FOX:
				return getFoxName((Fox) entity);
			case ZOMBIFIED_PIGLIN:
				return Zombie_Pigman;
			case PIGLIN:
				return Piglin;
			case PIGLIN_BRUTE:
				return Piglin_Brute;
			case STRIDER:
				return Strider;
			case ZOGLIN:
				return Zoglin;
			case HOGLIN:
				return Hoglin;
			case BREEZE:
				return Breeze;
			case CREAKING:
				return Creaking;
		default:
			break;
		}
		return null;
	}

	private static MobNames getGoatName(final Goat goat) {
		if (goat.isScreaming()) {
			return MobNames.Screaming_Goat;
		}
		return MobNames.Goat;
	}


	
	private static MobNames getAxolotlName(final Axolotl axolotl) {
		switch (axolotl.getVariant()) {
			case BLUE: {
				return MobNames.Blue_Axolotl;
			}
			case WILD: {
				return MobNames.Wild_Axolotl;
			}
			case GOLD: {
				return MobNames.Gold_Axolotl;
			}
			case CYAN: {
				return MobNames.Cyan_Axolotl;
			}
			case LUCY: {
				return MobNames.Lucy_Axolotl;
			}
			default: {
				return null;
			}
		}
	}

	private static MobNames getFrogName(final Frog frog) {
		if (frog.getVariant().equals(Frog.Variant.COLD)) {
			return MobNames.Cold_Frog;
		}
		if (frog.getVariant().equals(Frog.Variant.TEMPERATE)) {
			return MobNames.Temperate_Frog;
		}
		if (frog.getVariant().equals(Frog.Variant.WARM)) {
			return MobNames.Warm_Frog;
		}

		return MobNames.Temperate_Frog;
	}

	private static MobNames getCatName(Cat ocelot) {

		if (ocelot.getCatType() == null) {
			return null;
		}
		if (ocelot.getCatType().equals(Cat.Type.ALL_BLACK)) {
			return Cat_AllBack;
		}
		if (ocelot.getCatType().equals(Cat.Type.BRITISH_SHORTHAIR)) {
			return Cat_British_ShortHair;
		}
		if (ocelot.getCatType().equals(Cat.Type.SIAMESE)) {
			return Cat_Siamese;
		}
		if (ocelot.getCatType().equals(Cat.Type.RAGDOLL)) {
			return Cat_Ragdoll;
		}
		if (ocelot.getCatType().equals(Cat.Type.PERSIAN)) {
			return Cat_Persian;
		}
		if (ocelot.getCatType().equals(Cat.Type.JELLIE)) {
			return Cat_Jellie;
		}
		if (ocelot.getCatType().equals(Cat.Type.CALICO)) {
			return Cat_Calico;
		}
		if (ocelot.getCatType().equals(Cat.Type.WHITE)) {
			return Cat_White;
		}
		if (ocelot.getCatType().equals(Cat.Type.TABBY)) {
			return Cat_Tabby;
		}
		if (ocelot.getCatType().equals(Cat.Type.BLACK)) {
			return Cat_Black;
		}
		if (ocelot.getCatType().equals(Cat.Type.RED)) {
			return Cat_Red;
		}

		return null;

	}

	
	
	private static MobNames getFoxName(Fox ocelot) {

		if (ocelot.getFoxType() == null) {
			return null;
		}
		switch (ocelot.getFoxType()) {
			case RED:
				return Fox_Normal;
			case SNOW:
				return Fox_Snow;
		}
		return null;

	}


	private static MobNames getMooshroomName(MushroomCow mooshroom) {
		if (mooshroom.getVariant() == MushroomCow.Variant.BROWN) {
			return Mooshroom_Brown;
		} else {
			return Mooshroom;
		}
	}

	private static MobNames getCreeperName(Creeper creeper) {
		if (creeper.isPowered()) {
			return Charged_Creeper;
		}
		return Creeper;
	}

	private static MobNames getHorseName(Horse horse) {
		if (horse.getColor() == null) {
			return null;
		}
		switch (horse.getColor()) {
			case BLACK:
				return Black_Horse;
			case BROWN:
				return Brown_Horse;
			case CHESTNUT:
				return Chestnut_Horse;
			case CREAMY:
				return Creamy_Horse;
			case DARK_BROWN:
				return Dark_Brown_Horse;
			case GRAY:
				return Gray_Horse;
			case WHITE:
				return White_Horse;
		}
		return null;
	}

	private static MobNames getLLamaName(Llama llama) {
		if (llama.getColor() == null) {
			return null;
		}
		switch (llama.getColor()) {
			case BROWN:
				return Brown_Llama;
			case CREAMY:
				return Creamy_Llama;
			case GRAY:
				return Gray_Llama;
			case WHITE:
				return White_Llama;
		}
		return null;
	}
	private static MobNames getLLamaTraderName(TraderLlama llama) {
		if (llama.getColor() == null) {
			return null;
		}
		switch (llama.getColor()) {
			case BROWN:
				return Brown_Llama_Trader;
			case CREAMY:
				return Creamy_Llama_Trader;
			case GRAY:
				return Gray_Llama_Trader;
			case WHITE:
				return White_Llama_Trader;
		}
		
		return null;
	}

	private static MobNames getParrotName(Parrot parrot) {
		if (parrot.getVariant() == null) {
			return null;
		}
		switch (parrot.getVariant()) {
			case BLUE:
				return Blue_Parrot;
			case CYAN:
				return Cyan_Parrot;
			case GRAY:
				return Gray_Parrot;
			case GREEN:
				return Green_Parrot;
			case RED:
				return Red_Parrot;
		}
		return null;
	}

	private static MobNames getRabbitName(Rabbit rabbit) {
		if (rabbit.getCustomName() != null && rabbit.getName().equals("Toast")) {
			return Toast_Rabbit;
		}
		if (rabbit.getRabbitType() == null) {
			return null;
		}
		switch (rabbit.getRabbitType()) {
			case BLACK:
				return Black_Rabbit;
			case BLACK_AND_WHITE:
				return Black_and_White_Rabbit;
			case BROWN:
				return Brown_Rabbit;
			case GOLD:
				return Gold_Rabbit;
			case SALT_AND_PEPPER:
				return Salt_and_Pepper_Rabbit;
			case THE_KILLER_BUNNY:
				return The_Killer_Bunny;
			case WHITE:
				return White_Rabbit;
		}
		return null;
	}

	private static MobNames getPandaName(Panda panda) {
		if (panda.getMainGene() == null) {
			return null;
		}
		switch (panda.getMainGene()) {
			case LAZY:
				return Panda_Lazy;
			case WEAK:
				return Panda_Weak;
			case BROWN:
				return Panda_Brown;
			case NORMAL:
				return Panda_Normal;
			case PLAYFUL:
				return Panda_Playful;
			case WORRIED:
				return Panda_Worried;
			case AGGRESSIVE:
				return Panda_Aggressive;
		}
		return null;
	}

	private static MobNames getSheepName(Sheep sheep) {
		if (sheep.getCustomName() != null && sheep.getCustomName().equals("jeb_")) {
			return Rainbow_Sheep;
		}
		if (sheep.getColor() == null) {
			return null;
		}
		switch (sheep.getColor()) {
			case BLACK:
				return Black_Sheep;
			case BLUE:
				return Blue_Sheep;
			case BROWN:
				return Brown_Sheep;
			case CYAN:
				return Cyan_Sheep;
			case GRAY:
				return Gray_Sheep;
			case GREEN:
				return Green_Sheep;
			case LIGHT_BLUE:
				return Light_Blue_Sheep;
			case LIME:
				return Lime_Sheep;
			case MAGENTA:
				return Magenta_Sheep;
			case ORANGE:
				return Orange_Sheep;
			case PINK:
				return Pink_Sheep;
			case PURPLE:
				return Purple_Sheep;
			case RED:
				return Red_Sheep;
			case LIGHT_GRAY:
				return Light_Gray_Sheep;
			case WHITE:
				return White_Sheep;
			case YELLOW:
				return Yellow_Sheep;
		}
		return null;
	}

	/*
	 * TODO test wolf variants
	 */
	private static MobNames getWolfName(Wolf w) {
		
	
		if (w.getVariant().equals(Wolf.Variant.ASHEN)) {
			return Ashen_Wolf;
		}
		if (w.getVariant().equals(Wolf.Variant.BLACK)) {
			return Black_Wolf;
		}
		if (w.getVariant().equals(Wolf.Variant.CHESTNUT)) {
			return Chestnut_Wolf;
		}
		if (w.getVariant().equals(Wolf.Variant.PALE)) {
			return Pale_Wolf;
		}
		if (w.getVariant().equals(Wolf.Variant.RUSTY)) {
			return Rusty_Wolf;
		}
		if (w.getVariant().equals(Wolf.Variant.SNOWY)) {
			return Snowy_Wolf;
		}
		if (w.getVariant().equals(Wolf.Variant.SPOTTED)) {
			return Spotted_Wolf;
		}
		if (w.getVariant().equals(Wolf.Variant.STRIPED)) {
			return Striped_Wolf;
		}
		if (w.getVariant().equals(Wolf.Variant.WOODS)) {
			return Woods_Wolf;
		}
		return Default_Wolf;
		
		
		/*
		if (wolf.isTamed()) {
			return Tamed_Wolf;
		}
		
		return Wild_Wolf;*/

	}

	private static MobNames getZombieVillagerName(ZombieVillager zombieVillager) {
		if (zombieVillager.getVillagerProfession() == null) {
			return Zombie_Nitwit_Villager;
		}
		
		if (zombieVillager.getVillagerProfession().equals(Profession.TOOLSMITH)) {
			return Zombie_Smith_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.BUTCHER)) {
			return Zombie_Butcher_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.FARMER)) {
			return Zombie_Farmer_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.LIBRARIAN)) {
			return Zombie_Librarian_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.CLERIC)) {
			return Zombie_Cleric_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.ARMORER)) {
			return Zombie_Armorer_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.CARTOGRAPHER)) {
			return Zombie_Cartographer_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.FISHERMAN)) {
			return Zombie_Fisherman_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.FLETCHER)) {
			return Zombie_Fletcher_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.LEATHERWORKER)) {
			return Zombie_Leatherworker_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.MASON)) {
			return Zombie_Mason_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.SHEPHERD)) {
			return Zombie_Shepherd_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.WEAPONSMITH)) {
			return Zombie_Weaponsmith_Villager;
		}
		if (zombieVillager.getVillagerProfession().equals(Profession.NITWIT)) {
			return Zombie_Nitwit_Villager;
		}
		return Zombie_Villager;

			
	
	}


	private static MobNames getVillagerName(Villager villager) {
		if (villager.getProfession() == null) {
			return Villager;
		}
		if (villager.getProfession().equals(Profession.ARMORER)) {
			return Villager_Armorer;
		}
		if (villager.getProfession().equals(Profession.BUTCHER)) {
			return Villager_Butcher;
		}
		if (villager.getProfession().equals(Profession.CARTOGRAPHER)) {
			return Villager_Cartographer;
		}
		if (villager.getProfession().equals(Profession.CLERIC)) {
			return Villager_Cleric;
		}
		if (villager.getProfession().equals(Profession.FARMER)) {
			return Villager_Farmer;
		}
		if (villager.getProfession().equals(Profession.FISHERMAN)) {
			return Villager_Fisherman;
		}
		if (villager.getProfession().equals(Profession.FLETCHER)) {
			return Villager_Fletcher;
		}
		if (villager.getProfession().equals(Profession.LIBRARIAN)) {
			return Villager_Librarian;
		}
		if (villager.getProfession().equals(Profession.SHEPHERD)) {
			return Villager_Shepherd;
		}
		if (villager.getProfession().equals(Profession.WEAPONSMITH)) {
			return Villager_Weaponsmith;
		}
		if (villager.getProfession().equals(Profession.NITWIT)) {
			return Villager_Nitwit;
		}
		if (villager.getProfession().equals(Profession.LEATHERWORKER)) {
			return Villager_Leatherworker;
		}
		if (villager.getProfession().equals(Profession.MASON)) {
			return Villager_Mason;
		}
		if (villager.getProfession().equals(Profession.TOOLSMITH)) {
			return Villager_Toolsmith;
		}
		return Villager;
	
	}

	private static MobNames getFishName(Entity entity) {
		if (entity.getName() == null) {
			return null;
		}
		switch (entity.getName()) {
			case "Raw Cod":
				return Cod;
			case "Raw Salmon":
				return Salmon;
			case "Pufferfish":
				return Pufferfish;
			case "Tropical Fish":
				return Tropical_Fish;
		}
		return null;
	}
}

