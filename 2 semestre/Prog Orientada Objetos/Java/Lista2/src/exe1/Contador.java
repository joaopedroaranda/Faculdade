package exe1;

public class Contador {

    private int relogio;

    public int getRelogio() {
        return relogio;
    }

    public void setRelogio(int relogio) {
        this.relogio = relogio;
    }

    public void zerarContador() {
        this.relogio = 0;
    }

    public void incrementarContador() {
        this.relogio += 1;
    }

    public int mostrarContador() {
        return relogio;
    }
}
