package cc.isotopestudio.SeparateCMD.separatecmd;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class SeparateCMDCommandListener implements Listener {
	private final SeparateCMD plugin;

	public SeparateCMDCommandListener(SeparateCMD plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onPlayerChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();
		String command = SeparateCMDHandle.map.get(player.getName());
		if (command == null)
			return;
		SeparateCMDHandle.process(event.getPlayer(), event.getMessage());
		event.setCancelled(true);
	}

	@EventHandler
	public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
		String command = event.getMessage();
		String args[] = command.split(" ");
		for (int i = 1; i < args.length; i++) {
			if (args[i].equals("!arg")) {
				SeparateCMDHandle.add(event.getPlayer().getName(), command);
				//event.getPlayer().sendMessage((new StringBuilder()).append(ChatColor.AQUA).append("  ÇëÊäÈëÖµ").toString());
				event.setCancelled(true);
				return;
			}
		}
	}

}
