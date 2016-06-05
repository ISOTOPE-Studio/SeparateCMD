package cc.isotopestudio.SeparateCMD;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SeparateCMDtm extends JavaPlugin {
    static final String prefix = (new StringBuilder()).append(ChatColor.GOLD).append(ChatColor.BOLD).append("[")
            .append("称号").append("]").append(ChatColor.GREEN).toString();
    private static final String pluginName = "SeparateCMDtm";

    @Override
    public void onEnable() {
        this.getCommand("newtm").setExecutor(new CommandNewtm());
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new SeparateCMDtmListener(), this);
        getLogger().info(pluginName + " 成功加载!");
        getLogger().info(pluginName + " 由ISOTOPE Studio制作!");
        getLogger().info("http://isotopestudio.cc");
    }

    @Override
    public void onDisable() {
        getLogger().info("SeparateCMD 成功卸载!");
    }

}
