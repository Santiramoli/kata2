package software.ulpgc.kata2;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        List<Food> foods = CsvFileFoodLoader.with("dataset.csv").load();
        Map<Object, Integer> histogram = new SubgroupHistogramCalculator(foods).calculate();
        Iterator<Object> var3 = histogram.keySet().stream().sorted().toList().iterator();

        while(var3.hasNext()){
            String key = (String) var3.next();
            System.out.println(key + "--> " + histogram.get(key));
        }
    }
}
