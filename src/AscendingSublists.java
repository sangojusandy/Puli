import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class AscendingSublists {
    public static List<List<Integer>> getAscendingSublists(List<Integer> inputList) {
        List<List<Integer>> result = new ArrayList<>();

        if (inputList.isEmpty()) {
            return result; // Return an empty list if the input is empty
        }

        List<Integer> sublist = new ArrayList<>();
        sublist.add(inputList.get(0)); // Add the first element to the initial sublist

        for (int i = 1; i < inputList.size(); i++) {
            if (inputList.get(i) > inputList.get(i - 1)) {
                sublist.add(inputList.get(i)); // Add the current element to the current sublist if it's in ascending order
            } else {
                result.add(sublist); // Add the completed sublist to the result list
                sublist = new ArrayList<>(); // Start a new sublist with the current element
                sublist.add(inputList.get(i));
            }
        }

        result.add(sublist); // Add the final sublist to the result list

        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = List.of(1, 2, 3, 5, 7, 8, 9);
        List<List<Integer>> result = getAscendingSublists(inputList);

        // Output the result
        for (List<Integer> sublist : result) {
            System.out.println(sublist);
        }
    }
}
