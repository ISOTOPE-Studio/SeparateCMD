package cc.isotopestudio.SeparateCMD;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import static cc.isotopestudio.SeparateCMD.SeparateCMDtm.prefix;

class SeparateCMDtmListener implements Listener {

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();
        if (SeparateCMDHandle.list.remove(player.getName())) {
            event.setCancelled(true);
            String nickname = event.getMessage();
            int a = nickname.lastIndexOf("&");
            int b = nickname.lastIndexOf("��");
            if (b > a) a = b;
            char color = nickname.charAt(a + 1);
            nickname = "��" + color + ChatColor.stripColor(nickname);
            if (nickname.length() > 7) {
                player.sendMessage(prefix + nickname + S.toRed("̫����, �ƺ���Ҫ7���ַ�����(������ɫ�ַ�)"));
            } else {
                SeparateCMDHandle.process(player, nickname);
                player.sendMessage(S.toPrefixGreen("�ɹ���ȡ�³ƺ�, ����/tm open �л��ƺ�"));
            }
        }
    }
}