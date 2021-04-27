package television;

public class Television {
    private int volume;
    private int channel;

    private boolean hasVolume() {
        return this.volume > 0 && this.volume < 100;
    }

    public void upVolume() {
        if (hasVolume()) {
            this.volume++;
            return;
        }
        System.out.println("Volume maximo");
    }

    public void lowerVolume() {
        if (hasVolume()) {
            this.volume--;
            return;
        }
        System.out.println("Volume minimo");
    }

    public void setChannel(int channel) {
        // boolean valid = channel > 0;
        if (channel >= 0) {
            this.channel = channel;
            return;
        }

        System.out.println("Valor inválido");
    }

    public int getChannel() {
        return this.channel;
    }

    public int getVolume() {
        return this.volume;
    }

}
