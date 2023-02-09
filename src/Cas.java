public class Cas {
    int hodina,minuty;

    public Cas(int hodina, int minuty) {
        this.hodina = hodina;
        this.minuty = minuty;
    }

    @Override
    public String toString() {
        return "Cas{" +
                "hodina=" + hodina +
                ", minuty=" + minuty +
                '}';
    }
    public int prevedNaMinuty(){
        int a = hodina * 60;
        return a;
    }
    public int spocitejRozdilMinuty(Cas cas){
        int b = (this.prevedNaMinuty() - cas.prevedNaMinuty()) + Math.abs(this.minuty - cas.minuty);
        return Math.abs(b);
    }
}
