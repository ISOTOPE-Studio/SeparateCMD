package cc.isotopestudio.SeparateCMD;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Mars on 6/5/2016.
 * Copyright ISOTOPE Studio
 */
class CommandNewtm implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("newtm")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(S.toPrefixRed("����Ҫ��Ҳ���ִ��"));
                return true;
            }
            /*
            if (!sender.hasPermission("vip.admin")) {
                sender.sendMessage(S.toPrefixRed("��û��Ȩ��"));
                return true;
            }*/
            SeparateCMDHandle.add(sender.getName());
            sender.sendMessage(S.toPrefixYellow("�������³ƺ�"));
        }
        return false;
    }
}
