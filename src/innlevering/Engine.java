package innlevering;

/**
 * Created by Petter on 20.01.2017.
 */
public class Engine {

    private boolean started;

    public void start(){
        started = true;
    }

    public boolean isStarted(){
      return started;
    }
}
