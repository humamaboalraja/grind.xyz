package easy

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.function.Executable
import xyz.grind.coding.easy.GroupAnagrams

class GroupAnagramsTest {

    private fun listOfListsInputMock(testCasesRenderer: Boolean): List<List<String>>? {
        val listOfLists: MutableList<List<String>> = ArrayList()
        val firstInnerList: MutableList<String> = ArrayList()
        val secondInnerList: MutableList<String> = ArrayList()
        val thirdInnerList: MutableList<String> = ArrayList()
        firstInnerList.add("eat")
        firstInnerList.add("ate")
        firstInnerList.add("tea")
        firstInnerList.add("eta")
        listOfLists.add(firstInnerList)
        if (testCasesRenderer) {
            secondInnerList.add("tba")
            secondInnerList.add("tab")
            secondInnerList.add("bat")
            listOfLists.add(secondInnerList)
        }
        thirdInnerList.add("post")
        thirdInnerList.add("pots")
        thirdInnerList.add("spot")
        thirdInnerList.add("stop")
        thirdInnerList.add("tops")
        listOfLists.add(thirdInnerList)
        return listOfLists
    }

    @Test
    fun `Should return list of lists that has grouped anagrams that are provided from the strs input array`() {
        Assertions.assertAll(
            Executable {
                assertEquals(GroupAnagrams.groupAnagramsBruteForce(arrayOf("eat", "ate", "tea", "eta", "post", "pots", "spot", "stop", "tops")), listOfListsInputMock(false))
            },
            Executable {
                assertEquals(GroupAnagrams.groupAnagramsBruteForce(arrayOf("eat", "ate", "tea", "eta", "tba", "tab", "bat", "post", "pots", "spot", "stop", "tops")), listOfListsInputMock(true))
            },
            Executable {
                assertEquals(GroupAnagrams.groupAnagramsBruteForceTwo(arrayOf("eat", "ate", "tea", "eta", "post", "pots", "spot", "stop", "tops")), listOfListsInputMock(false))
            },
            Executable {
                assertEquals(GroupAnagrams.groupAnagramsBruteForceTwo(arrayOf("eat", "ate", "tea", "eta", "tba", "tab", "bat", "post", "pots", "spot", "stop", "tops")), listOfListsInputMock(true))
            },
            Executable {
                assertEquals(GroupAnagrams.groupAnagrams(arrayOf("eat", "ate", "tea", "eta", "post", "pots", "spot", "stop", "tops")), listOfListsInputMock(false))
            }
        )
    }

    @Test
    fun `Should return an empty list`() {
        Assertions.assertAll(
            Executable {
                assertEquals(GroupAnagrams.groupAnagramsBruteForce(arrayOf()), ArrayList<String>())
            },
            Executable {
                assertEquals(GroupAnagrams.groupAnagramsBruteForceTwo(arrayOf()), ArrayList<String>())
            },
            Executable {
                assertEquals(GroupAnagrams.groupAnagrams(arrayOf()), ArrayList<String>())
            }
        )
    }
}
