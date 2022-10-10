import java.util.List;
import java.util.ArrayList;

public class Cylinders {

    private final List<Cylinder> cylinders;

    public Cylinders() {
        this.cylinders = new ArrayList<>();
    }

    public double getAverageCylinderVolume() {
        double volume = 0;
        for (int i = 0; i < cylinders.size(); i++) {
            volume += cylinders.get(i).getVolume();
        }
        return volume / cylinders.size();
    }

    public boolean addCylinder(Cylinder cylinder) {
        return cylinders.add(cylinder);
    }

    public void RemoveOnIndex(int number) {
        if (number < cylinders.size())
            cylinders.remove(number);
    }

    public void RemoveOnElement(Cylinder cylinder) {
        cylinders.remove(cylinder);
    }

    @Override
    public String toString() {
        return "" + cylinders + "\n";
    }


}
