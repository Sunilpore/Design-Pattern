package structural_pattern.adapter_pattern.mobile;

public class AssignCharger {

    private Charger ch;

    public Charger getCharger() {
        return ch;
    }

    public void setCharger(Charger ch) {
        this.ch = ch;
    }

    public void chargeMobile(String mob){
        ch.charge(mob);
    }

}
