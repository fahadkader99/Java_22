package april_Fool;

public class FirstOccuranceOfElementInArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,5,5,6};
        int target = 5;                 // if target found then return the index


        for (int i = 0; i<arr.length;i++){
            if (arr[i] == target){
                System.out.println("element present at index: "+ i);
                break;          // if break is used then it will only find first one and break the loop
            }
        }
    }
}
