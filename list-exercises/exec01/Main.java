import java.text.ParseException;

import television.RemoteControl;

/**
 * Aqui você usa para testar/utilizar as classes
 */

public class Main {
    public static void main(String[] args) throws ParseException {
        RemoteControl remoteControl = new RemoteControl();

        System.out.println(remoteControl.getChannel());
        remoteControl.upVolume();
    }
}
