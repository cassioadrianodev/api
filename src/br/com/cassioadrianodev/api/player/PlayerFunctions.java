package br.com.cassioadrianodev.api.player;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class PlayerFunctions {
	
	/**
	 * Retornar um som especifico para o jogador.
	 * @param player - Player Parameter
	 * @param note - Note Parameter
	 * @param i - Int Number
	 */
	public static void sendSound(Player player, Sound note, int i) {
		player.playSound(player.getLocation(), note, i, i);
	}

}
