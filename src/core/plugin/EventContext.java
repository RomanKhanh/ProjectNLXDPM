
package core.plugin;

public class EventContext{
    private String eventType;
    private Object data;
    
    public EventContext(String evenType,Object data){
        this.eventType = evenType;
        this.data = data;
      }
    public String getEventType(){
        return eventType;
    }
    public Object getData(){
        return data;
    }
}
