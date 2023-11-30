/*Given an array of n item values, sort the array in ascending order, first by the frequency of each value, then by the values themselves.
For example, given the array [4, 5, 6, 5, 4, 3], return [3, 6, 4, 4, 5, 5]. use itemssort function to sort the array.
we have this code
public class Solution {
public static void main(Stringl
args) throws IOException {
BufferedReader bufferedReader = new BufferedReader (new InputStreamReader (System. in));
Bufferedwriter bufferedWriter = new BufferedWriter (new FileWriter (System. getenv ("OUTPUT_РАТН")));
int itemsCount = Integer. parseInt (bufferedReader.readLine(). trim());
List‹ Integer> items = IntStream. range(0, itemsCount) •mapToobj (i -> {
try {
return bufferedReader. readLine(). replaceAll ("\\s+$", "");
} catch (I0Exception ex) {
throw new RuntimeException (ex);
}
｝）
• map (String:: trim)
• map (Integer: :parseInt)
. collect (toList()) ;
List‹Integer> result = Result. itemsSort (items);
bufferedwriter. write(
result. stream)
• map (Object:: toString)
•collect (joining ("\n"))
+ "\n"
) ;
bufferedReader. close(); bufferedwriter. close();}}}
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result {
    public static List<Integer> itemsSort(List<Integer> items) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer item : items) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        result.add(entry.getKey());
                    }
                });
        return result;
    }
}