package march_april_23;

public class Exceptions {
    public static void main(String[] args) {

        try {
            int n = 1000, x = 0;
            int arr[] =new int[n];
            for(int i = 0; i <= n; i++){
                arr[i] = i / x;
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("1st block - Index out of bound " + e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("2nd block - Arithmetic " + e.getMessage());
            //System.out.println("\n"+ e.toString());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("3rd block - Exception " + e.getMessage());
        }
    }
}
