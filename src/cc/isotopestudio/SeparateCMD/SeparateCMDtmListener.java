package cc.isotopestudio.SeparateCMD;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

class SeparateCMDtmListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (SeparateCMDHandle.list.remove(player.getName())) {
            SeparateCMDHandle.process(player, event.getMessage());
            event.setCancelled(true);
        }
    }
}
