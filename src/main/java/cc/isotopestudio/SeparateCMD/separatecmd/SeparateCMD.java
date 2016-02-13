package cc.isotopestudio.SeparateCMD.separatecmd;

import java.io.File;
import java.io.IOException;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class SeparateCMD extends JavaPlugin {
	public final String version = "v1.0";

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
		
		getLogger().info("SeparateCMD �ɹ�����!");
		getLogger().info("SeparateCMD ��ISOTOPE Studio����!");
		getLogger().info("http://isotopestudio.cc");
	}
/*
	public void onReload() {
		reloadPlayersData();
		this.reloadConfig();
	}
*/
	@Override
	public void onDisable() {
		//savePlayersData();
		getLogger().info("SeparateCMD �ɹ�ж��!");
	}

	private File dataFile = null;
	private FileConfiguration data = null;

	public void reloadPlayersData() {
		if (dataFile == null) {
			dataFile = new File(getDataFolder(), "playersData.yml");
		}
		data = YamlConfiguration.loadConfiguration(dataFile);
	}

	public FileConfiguration getPlayersData() {
		if (data == null) {
			reloadPlayersData();
		}
		return data;
	}

	public void savePlayersData() {
		if (data == null || dataFile == null) {
			return;
		}
		try {
			getPlayersData().save(dataFile);
		} catch (IOException ex) {
			getLogger().info("����ļ�����ʧ�ܣ�");
		}
	}

}
