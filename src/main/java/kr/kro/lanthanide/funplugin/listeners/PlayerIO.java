package kr.kro.lanthanide.funplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginLogger;

public class PlayerIO implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        PluginLogger.getLogger("FunPlugin").info("Player Joined: " + e.getPlayer().getName());
    }

//    @EventHandler
//    public void onPacketPlayOut(Packet)
}
