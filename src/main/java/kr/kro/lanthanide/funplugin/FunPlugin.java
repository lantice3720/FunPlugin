package kr.kro.lanthanide.funplugin;

import kr.kro.lanthanide.funplugin.listeners.PlayerIO;
import org.bukkit.Bukkit;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class FunPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PlayerIO(), this);
//        Bukkit.getPlayer("asd").getName();
        VirtualEntity virtualEntityyy;


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
