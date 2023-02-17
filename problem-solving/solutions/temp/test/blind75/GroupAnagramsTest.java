package blind75;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import xyz.grind.coding.blind75.GroupAnagrams;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTest {

    List<List<String>> listOfListsInputMock(boolean testCasesRenderer) {

        List<List<String>> listOfLists = new ArrayList<>();
        List<String> firstInnerList = new ArrayList<>();
        List<String> secondInnerList = new ArrayList<>();
        List<String> thirdInnerList = new ArrayList<>();

        firstInnerList.add("eat");
        firstInnerList.add("ate");
        firstInnerList.add("tea");
        firstInnerList.add("eta");
        listOfLists.add(firstInnerList);

        if(testCasesRenderer) {
            secondInnerList.add("tba");
            secondInnerList.add("tab");
            secondInnerList.add("bat");
            listOfLists.add(secondInnerList);
        }
        thirdInnerList.add("post");
        thirdInnerList.add("pots");
        thirdInnerList.add("spot");
        thirdInnerList.add("stop");
        thirdInnerList.add("tops");
        listOfLists.add(thirdInnerList);

        return listOfLists;
    }

    @Test
    @DisplayName("Should return list of lists that has grouped anagrams that are provided from the strs input array")
    void shouldReturnArrayWithTwoIntegersThatSumUpToTarget() {
        assertAll(
                () -> assertEquals(GroupAnagrams.groupAnagramsBruteForce(new String[]{"eat","ate","tea","eta","post","pots","spot","stop","tops"}), listOfListsInputMock(false)),
                () -> assertEquals(GroupAnagrams.groupAnagramsBruteForce(new String[]{"eat","ate","tea","eta","tba","tab","bat","post","pots","spot","stop","tops"}), listOfListsInputMock(true)),
                () -> assertEquals(GroupAnagrams.groupAnagramsBruteForceTwo(new String[]{"eat","ate","tea","eta","post","pots","spot","stop","tops"}), listOfListsInputMock(false)),
                () -> assertEquals(GroupAnagrams.groupAnagramsBruteForceTwo(new String[]{"eat","ate","tea","eta","tba","tab","bat","post","pots","spot","stop","tops"}), listOfListsInputMock(true)),
                () -> assertEquals(GroupAnagrams.groupAnagrams(new String[]{"eat","ate","tea","eta","post","pots","spot","stop","tops"}), listOfListsInputMock(false))
        );
    }

    @Test
    @DisplayName("Should return an empty list")
    void shouldReturnEmptyArrayIfNoTwoIntegersSumUpToTarget() {
        assertAll(
                () -> assertEquals(GroupAnagrams.groupAnagramsBruteForce(new String[]{}), new ArrayList<>()),
                () -> assertEquals(GroupAnagrams.groupAnagramsBruteForceTwo(new String[]{}), new ArrayList<>()),
                () -> assertEquals(GroupAnagrams.groupAnagrams(new String[]{}), new ArrayList<>())
        );
    }

}

