package structural_pattern.adapter_pattern.mobile;

public class ChargerAdapter implements Charger{

    SmartPhone sm = new SmartPhone();

    @Override
    public void charge(String mob) {
        sm.chargeSmartPhone(mob);           //It is an Composition
    }

}
