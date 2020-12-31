package me.lorenzo0111.test;

import me.Lorenzo0111.api.Configuration.Configuration;
import me.Lorenzo0111.api.RocketAPI;
import me.lorenzo0111.test.Commands.ExampleCommand;
import me.lorenzo0111.test.Configurations.ExampleConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        RocketAPI api = RocketAPI.getInstance();
        api.hook(this);

        Configuration configuration = new ExampleConfig("example", this);
        System.out.println(configuration.get("welcome"));
    }
	
}
