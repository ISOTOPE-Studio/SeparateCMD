package cc.isotopestudio.SeparateCMD;

import org.bukkit.ChatColor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SeparateCMDtm extends JavaPlugin {
    static final String prefix = (new StringBuilder()).append(ChatColor.GOLD).append(ChatColor.BOLD).append("[")
            .append("�ƺ�").append("]").append(ChatColor.GREEN).toString();
    private static final String pluginName = "SeparateCMDtm";

    @Override
    public void onEnable() {
        this.getCommand("newtm").setExecutor(new CommandNewtm());
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new SeparateCMDtmListener(), this);
        getLogger().info(pluginName + " �ɹ�����!");
        getLogger().info(pluginName + " ��ISOTOPE Studio����!");
        getLogger().info("http://isotopestudio.cc");
    }

    @Override
    public void onDisable() {
        getLogger().info("SeparateCMD �ɹ�ж��!");
    }

}
