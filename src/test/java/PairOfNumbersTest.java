import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class PairOfNumbersTest {

    @Test
    public void validatePairsOfNumbersForTheGivenKey() {

        //Arrange
        int[] arr = {1, 2, -1, -2, 4, 5, -9, 0, 10, 40};
        int key = 4;
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("{1,4}");
        expectedResult.add("{2,-2}");
        expectedResult.add("{-1,5}");
        expectedResult.add("{4,0}");
        expectedResult.add("{10,40}");

        //Act
        List<String> actualResult = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(new Calculate().sum(arr[i],arr[j]) == key){
                    actualResult.add(new Calculate().getPair(arr[i],arr[j]));
                }
                else if(new Calculate().diff(arr[i],arr[j]) == key){
                    actualResult.add(new Calculate().getPair(arr[i],arr[j]));
                }
                else if(new Calculate().mul(arr[i],arr[j]) == key){
                    actualResult.add(new Calculate().getPair(arr[i],arr[j]));
                }
                else if(new Calculate().div(arr[i],arr[j]) == (float)key){
                    actualResult.add(new Calculate().getPair(arr[i],arr[j]));
                }
            }

            }
        //Assert
        int i=0;
        for (String expected : expectedResult){
            System.out.println(expected);
            Assert.assertEquals(actualResult.get(i++),expected);

        }
    }
}