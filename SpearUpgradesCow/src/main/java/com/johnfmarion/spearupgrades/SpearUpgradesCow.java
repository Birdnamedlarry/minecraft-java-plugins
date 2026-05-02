package com.johnfmarion.spearupgrades;

import org.bukkit.plugin.java.JavaPlugin;

public class SpearUpgradesCow extends JavaPlugin {

    private SpearManager spearManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        spearManager = new SpearManager(this);
        spearManager.loadFromConfig();
        getServer().getPluginManager().registerEvents(new SpearListener(this, spearManager), this);
        getLogger().info("SpearUpgradesCow enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SpearUpgradesCow disabled!");
    }

    public SpearManager getSpearManager() {
        return spearManager;
    }
}
