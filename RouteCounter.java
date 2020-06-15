import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RouteCounter {
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>(Arrays.asList(1, 3, 6, 2, 4));
        int ans = countRoutes1(7, ar);
        System.out.println("The possible number of routes: " + ans);

    }

    public static int countRoutes1(int fuel, List<Integer> cities) {
        Set<List<Integer>> routes = new HashSet<>();
        int start = cities.get(0);
        for (int i = 1; i < cities.size(); i++) {
            int remFuel = fuel;
            List<Integer> route = new ArrayList<>();
            route.add(cities.get(0));
            Set<Integer> traversed = new HashSet<>();
            traversed.add(cities.get(0));
            int nextStart = start;
            int end = cities.get(i);
            int diff = end - nextStart;
            int currIter = i;
            while (end > start && currIter < cities.size()) {
                if (remFuel >= diff && !traversed.contains(end)) {
                    route.add(cities.get(currIter));
                    traversed.add(cities.get(currIter));
                    remFuel -= diff;
                    nextStart = end;
                }
                if (currIter + 1 < cities.size() && cities.get(currIter + 1) > start) {
                    end = cities.get(currIter + 1);
                    diff = Math.abs(end - nextStart);
                }
                currIter++;
            }
            if (route.size() > 1) routes.add(route);
        }
        return routes.size();
    }
}
