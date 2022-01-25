import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GamesByAgeTest {
    @Test
    public void validateSortStudentsByAgeInGroups(){

        //Arrange
        int[] arr = {21,22,23,25,20,24,19,18};
        List<Integer> expectedGroup1= new ArrayList<>();
        expectedGroup1.add(18);
        expectedGroup1.add(19);
        expectedGroup1.add(20);
        List<Integer> expectedGroup2= new ArrayList<>();
        expectedGroup2.add(21);
        expectedGroup2.add(22);
        expectedGroup2.add(23);
        List<Integer> expectedGroup3= new ArrayList<>();
        expectedGroup3.add(24);
        expectedGroup3.add(25);
        List<List<Integer>> expectedGroupList = new ArrayList<>();
        expectedGroupList.add(expectedGroup1);
        expectedGroupList.add(expectedGroup2);
        expectedGroupList.add(expectedGroup3);

        //Act
        Arrays.sort(arr);
        int first = arr[0];
        List<List<Integer>> actualGroupList = new ArrayList<>();
        List<Integer> actualGroup= new ArrayList<>();
        actualGroup.add(first);
        for(int i=1 ; i<arr.length ; i++){
            if(arr[i] - first <=2){
                actualGroup.add(arr[i]);
            }
            else {
                actualGroupList.add(actualGroup);
                actualGroup =new ArrayList<>();
                first = arr[i];
                actualGroup.add(first);
            }
        }
        actualGroupList.add(actualGroup);
        System.out.println(actualGroupList);

        //Assert
        int i=0;
        for (List<Integer> expectedGroup : expectedGroupList){
            int j=0;
            for (Integer expectedMember : expectedGroup){
                Assert.assertEquals(actualGroupList.get(i).get(j++),expectedMember);
            }
            i++;
        }
    }
}




