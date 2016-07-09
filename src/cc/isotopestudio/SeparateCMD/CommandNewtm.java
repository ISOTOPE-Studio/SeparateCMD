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
    static final String msg = S.toPrefixYellow("请在聊天框内输入你的称号名") + S.toRed("<7个中文或者7个字母>");

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("newtm")) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(S.toPrefixRed("必须要玩家才能执行"));
                return true;
            }

            if (!sender.hasPermission("newtm")) {
                sender.sendMessage(S.toPrefixRed("你没有权限"));
                return true;
            }
            SeparateCMDHandle.add(sender.getName());
            sender.sendMessage(msg);
            sender.sendMessage(msg);
            sender.sendMessage(msg);
            return true;
        }
        return false;
    }
}
