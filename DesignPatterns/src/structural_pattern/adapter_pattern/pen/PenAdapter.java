package structural_pattern.adapter_pattern.pen;

public class PenAdapter implements Pen{

    PilotPen pp = new PilotPen();

    @Override
    public void write(String str) {
        pp.mark(str);           // Here we use composition
    }

}
