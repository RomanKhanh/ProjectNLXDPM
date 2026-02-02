package core.plugin;

import java.util.ArrayList;
import java.util.List;


public class PluginManager {
    private List<Plugin> plugins = new ArrayList<>();
        
    public void registerPlugin(Plugin plugin){
        plugins.add(plugin);}
   
    
    public void notifyAllPlugins(EventContext ctx) {
        for (Plugin plugin : plugins) {
            plugin.execute(ctx);
        }
    }
}

