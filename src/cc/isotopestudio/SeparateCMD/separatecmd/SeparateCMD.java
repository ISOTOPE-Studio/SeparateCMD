package cc.isotopestudio.SeparateCMD.separatecmd;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SeparateCMD extends JavaPlugin {

    @Override
    public void onEnable() {
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new SeparateCMDCommandListener(), this);

        getLogger().info("SeparateCMD �ɹ�����!");
        getLogger().info("SeparateCMD ��ISOTOPE Studio����!");
        getLogger().info("http://isotopestudio.cc");
    }

    @Override
    public void onDisable() {
        getLogger().info("SeparateCMD �ɹ�ж��!");
    }

}
