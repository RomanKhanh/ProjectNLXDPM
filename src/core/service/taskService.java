package core.service;


import core.plugin.PluginManager;
import core.plugin.EventContext;


public class taskService {
    private PluginManager pluginManager;
    
    public taskService(PluginManager pluginManager){
        this.pluginManager = pluginManager;
    }
    public void createTask(String TaskName){
        
        System.out.println("Create task" + TaskName);
        
        EventContext ctx = new EventContext(
               "Task Created",
                TaskName
        );
       
        
        pluginManager.notifyAllPlugins(ctx);
    }
}
