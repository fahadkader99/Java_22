package qA_Fox;

public class VersionOfJavaInSystem {
    public static void main(String[] args) {

        String version = System.getProperty("java.version");
        System.out.println("The Java version in my Mac is: "+ version);
    }
}
