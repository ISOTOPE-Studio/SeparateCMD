package cc.isotopestudio.SeparateCMD.separatecmd;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SeparateCMD extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new SeparateCMDCommandListener(), this);

        getLogger().info("SeparateCMD 成功加载!");
        getLogger().info("SeparateCMD 由ISOTOPE Studio制作!");
        getLogger().info("http://isotopestudio.cc");
    }

    @Override
    public void onDisable() {
        getLogger().info("SeparateCMD 成功卸载!");
    }

}
