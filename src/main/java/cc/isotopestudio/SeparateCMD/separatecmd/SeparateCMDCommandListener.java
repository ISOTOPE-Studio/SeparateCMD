package cc.isotopestudio.SeparateCMD.separatecmd;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.server.ServerCommandEvent;

public class SeparateCMDCommandListener implements Listener {
	private final SeparateCMD plugin;

	public SeparateCMDCommandListener(SeparateCMD plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onServerCommand(ServerCommandEvent event) {
		String command = event.getCommand();
		String args[] = command.split(" ");
		for (int i = 0; i < args.length; i++) {
			
		}
	}

	@EventHandler
	public void onPlayerCommand(PlayerCommandPreprocessEvent event) {

	}

}
