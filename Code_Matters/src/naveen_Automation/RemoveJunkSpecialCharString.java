package naveen_Automation;

import org.testng.annotations.Test;

public class RemoveJunkSpecialCharString {
    // remove junk || special char from  a string ----> use Regula expression

    @Test
    void removeJunk(){
        String s = "###%%!!!&&&& Fa**&&&Ha!@#D#12345###";

        // regex [^a-zA-Z0-9]

        s = s.replaceAll("[^a-zA-Z0-9]", "");       // ^ mean not
        System.out.println("After cleanup " + s);
    }
}
