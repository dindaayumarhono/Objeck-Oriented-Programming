package TClass;

public class circle {
    public double jari;

    public void setJari2(double input_jari) {
        this.jari = input_jari;
    }

    public double getJari() {
        return this.jari;
    }

    public double getLuas() {
        return Math.PI * this.jari * this.jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * this.jari;
    }
}

