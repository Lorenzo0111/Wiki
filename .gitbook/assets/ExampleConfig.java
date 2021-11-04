package me.lorenzo0111.test.Configurations;

import me.Lorenzo0111.api.Configuration.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

public class ExampleConfig extends Configuration {
    public ExampleConfig(String fileName, JavaPlugin plugin) {
        super(fileName, plugin);
    }
}
