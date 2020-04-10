package CodingNomads.examples.datatypes;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.lwawt.macosx.CSystemTray;

public class DataTypes {

    //can hold a true or false value
    boolean isAwesome = true;

    //8 bits (11111111 in binary) or 1 byte (-128 to 126)
    byte byteNum = 12;

    //16 bits or 2 byte in memory
    short shortNum = 12;

    //32 bits of memory
    int intNum = 1234;

    //64 bits of memory. Add an 'l' to the end.
    long longNum = 128483563981464l;

    //decimal. 32 bits of memory
    float floatNum = 12.45f;

    //decimal. 64 bits of memory
    double doubleNum = 123.45;

    //single characters stored in single quotes.
    static char c = 'a';

    public static void main(String[] args) {
        System.out.println(c);
        c++;
        System.out.println(c);
        char d = 103;
        System.out.println(d);
    }

}
