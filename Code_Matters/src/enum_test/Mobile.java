package enum_test;

public enum Mobile {

    APPLE,SAMSUNG,HTC;


}

 class EnumExample{

     public static void main(String[] args) {
         Mobile m = Mobile.APPLE;                                       // This m represent all the Constants

         switch (m){

             case APPLE:
                 System.out.println("Apple");
                 break;

             case SAMSUNG:
                 System.out.println("Samsung");
                 break;

             case HTC:
                 System.out.println("Htc");
                 break;
         }

     }
}