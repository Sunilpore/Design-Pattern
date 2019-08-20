package structural_pattern.adapter_pattern.pen;

import structural_pattern.adapter_pattern.pen.AssignmentWork;
import structural_pattern.adapter_pattern.pen.Pen;
import structural_pattern.adapter_pattern.pen.PenAdapter;

public class SchoolActivity {

    public static void main(String[] args) {

        Pen p = new PenAdapter();
        AssignmentWork aw = new AssignmentWork();
        aw.setPen(p);
        aw.writeAssignment("I am tired");

    }

}
