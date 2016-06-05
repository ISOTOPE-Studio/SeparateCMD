package cc.isotopestudio.SeparateCMD;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

class SeparateCMDHandle {

    private static final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();

    static Set<String> list = new HashSet<>();

    static void add(String name) {
        list.add(name);
    }

    static void process(Player player, String nickname) {
        String command = "/tm give " + player.getName() + " " + nickname + " null & e×ð¹óVIP;&c×Ô¶¨Òå³ÆºÅ";
        Bukkit.dispatchCommand(console, command);
    }

}
