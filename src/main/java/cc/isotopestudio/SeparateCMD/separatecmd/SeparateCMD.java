package cc.isotopestudio.SeparateCMD.separatecmd;

import java.io.File;
import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SeparateCMD extends JavaPlugin {
	public final String version = "v1.0.1";

	public final String prefix = (new StringBuilder()).append(ChatColor.GREEN).append("[").append(ChatColor.ITALIC)
			.append(ChatColor.BOLD).append("SeparateCMD").append(ChatColor.RESET).append(ChatColor.GREEN).append("]")
			.append(ChatColor.RESET).toString();

	public void createFile(String name) {

		File file;
		file = new File(getDataFolder(), name + ".yml");
		if (!file.exists()) {
			saveDefaultConfig();
		}
	}

	String FileVersion = "1";

	@Override
	public void onEnable() {
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvents(new SeparateCMDCommandListener(this), this);

		getLogger().info("SeparateCMD 成功加载!");
		getLogger().info("SeparateCMD 由ISOTOPE Studio制作!");
		getLogger().info("http://isotopestudio.cc");
	}

	@Override
	public void onDisable() {
		getLogger().info("SeparateCMD 成功卸载!");
	}

}
