
package application;

import core.plugin.PluginManager;
import core.service.taskService;
import plugins.notification.NotificationPlugin;
public class App {
    public static void main(String[] args){
              
        // (1) Khởi tạo PluginManager
        PluginManager pluginManager = new PluginManager();
        
        // (2) Đăng ký plugin
        pluginManager.registerPlugin(new NotificationPlugin());
        
        
        // (3) Khởi tạo Service       
        taskService taskservice = new taskService(pluginManager);
        
        taskservice.createTask("Text");
    }
}
