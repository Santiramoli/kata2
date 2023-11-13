package software.ulpgc.kata2;

import javax.management.ObjectName;
import java.util.HashMap;

public interface HistogramCalculator {

    HashMap<Object, Integer> calculate();
}
