
package plugins.notification;

import core.plugin.EventContext;
import core.plugin.Plugin;

public class NotificationPlugin implements Plugin {

    @Override
    public void execute(EventContext ctx) {
       if("Task Created".equals(ctx.getEventType())){
           System.out.println("Gửi thông báo"+ctx.getData());
       }
    }   
}
