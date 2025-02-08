package com.cyber.mobheads.Utilities;

import java.lang.reflect.Field;
import java.util.UUID;

import com.destroystokyo.paper.profile.ProfileProperty;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.cyber.mobheads.Config.ConfigController;
import com.cyber.mobheads.advancements.AdvancementsManager;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import com.destroystokyo.paper.profile.PlayerProfile;

public class SkullFactory{

	public static ItemStack getMobSkull(MobMeta mobmeta, Player owner) {
		String encodedTexture = mobmeta.getTextureCode();
		String randomUUID = mobmeta.getUUID();
		String displayName = mobmeta.getDisplayName();
		if (encodedTexture == null) {
			return null;
		}
		if (encodedTexture.equalsIgnoreCase("[vanilla]") || randomUUID.equalsIgnoreCase("[vanilla]") || displayName.equalsIgnoreCase("[vanilla]")) {
			if (owner != null) {
				AdvancementsManager.triggerAdvancement(owner, mobmeta.getAdvancements());
			}
			if (displayName.equalsIgnoreCase("[vanilla]")) {
				return getVanillaSkull(mobmeta.getMobName());
			}
			ItemStack vanillaSkull = getVanillaSkull(mobmeta.getMobName());
			ItemMeta meta = vanillaSkull.getItemMeta();
			meta.setDisplayName(ChatColor.RESET + displayName);
			vanillaSkull.setItemMeta(meta);
			return vanillaSkull;
		}

		ItemStack skull = new ItemStack(Material.PLAYER_HEAD, 1);

		SkullMeta meta = (SkullMeta)skull.getItemMeta();
		//GameProfile profile = new GameProfile(UUID.fromString(randomUUID), "");
		//profile.getProperties().put("textures", new Property("textures", encodedTexture));
		//Field profileField = null;
		//try {
		//	profileField = meta.getClass().getDeclaredField("profile");
		//	profileField.setAccessible(true);
		//	profileField.set(meta, profile);
		//} catch (NoSuchFieldException | IllegalArgumentException | IllegalAccessException e1) {
		//	e1.printStackTrace();
		//}
		PlayerProfile profile = Bukkit.createProfile(UUID.fromString(randomUUID));
		profile.setProperty(new ProfileProperty("textures", encodedTexture));
		meta.setPlayerProfile(profile);

		meta.setDisplayName(ChatColor.RESET + displayName);
		if (owner != null) {
			AdvancementsManager.triggerAdvancement(owner, mobmeta.getAdvancements());
		}
		skull.setItemMeta(meta);
		return skull;
	}

	@SuppressWarnings("deprecation")
	public static ItemStack getPlayerSkull(String playername, Player killer) {
		/*
		 * TEST if it fixes
		 */
		ItemStack item = new ItemStack(Material.PLAYER_HEAD, 1);
		ItemMeta itemMeta = item.getItemMeta();
		((SkullMeta) itemMeta).setOwner(playername);
		item.setItemMeta(itemMeta);
		if (killer != null) AdvancementsManager.triggerAdvancement(killer, ConfigController.getAdvancementsPlayer());
		return item;
	}

	public static ItemStack getVanillaSkull(MobNames mobname) {
		Material mat;
		switch (mobname) {
			case Ender_Dragon:
				mat = Material.DRAGON_HEAD;
				return new ItemStack(mat, 1);
			case Zombie:
				mat = Material.ZOMBIE_HEAD;
				return new ItemStack(mat, 1);
			case Skeleton:
				mat = Material.SKELETON_SKULL;
				return new ItemStack(mat, 1);
			case Creeper:
				mat = Material.CREEPER_HEAD;
				return new ItemStack(mat, 1);
			case Wither_Skeleton:
				mat = Material.WITHER_SKELETON_SKULL;
				return new ItemStack(mat, 1);
		default:
			break;
		}
		return null;
	}


	public static String getVanillaName(MobNames mobname) {
		switch (mobname) {
			case Skeleton:
				return "Skeleton Head";
			case Creeper:
				return "Creeper Head";
			case Zombie:
				return "Zombie Head";
			case Ender_Dragon:
				return "Dragon Head";
			case Wither_Skeleton:
				return "Wither Skeleton Head";
		default:
			break;
		}
		return null;
	}
	public static String getVanillaName(Entity entity) {
		switch (entity.getType()) {
			case SKELETON:
				return "Skeleton Head";
			case CREEPER:
				return "Creeper Head";
			case ZOMBIE:
				return "Zombie Head";
			case ENDER_DRAGON:
				return "Dragon Head";
			case WITHER_SKELETON:
				return "Wither Skeleton Head";
		default:
			break;
		}
		return null;
	}
}

