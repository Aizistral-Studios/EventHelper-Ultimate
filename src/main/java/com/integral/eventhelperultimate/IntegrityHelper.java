package com.integral.eventhelperultimate;

import java.util.UUID;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class IntegrityHelper {

	public static boolean isPlayerOP(EntityPlayer player) {
		return FMLCommonHandler.instance().getMinecraftServerInstance() != null ? FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getOppedPlayers().getEntry( player.getGameProfile() ) != null  : false;
	}

	public static boolean isPlayerOP(UUID playerID) {
		if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
			for (Object playerObj : FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayers()) {
				if (playerObj instanceof EntityPlayer) {
					if (((EntityPlayer)playerObj).getUniqueID().equals(playerID))
						return isPlayerOP((EntityPlayer)playerObj);
				}
			}
		}

		return false;
	}

	public static boolean isPlayerOP(String playerName) {
		if (FMLCommonHandler.instance().getMinecraftServerInstance() != null) {
			for (Object playerObj : FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayers()) {
				if (playerObj instanceof EntityPlayer) {
					if (((EntityPlayer)playerObj).getGameProfile().getName().equals(playerName))
						return isPlayerOP((EntityPlayer)playerObj);
				}
			}
		}

		return false;
	}

}
