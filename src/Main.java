import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.out.println("----№1----");
        // -1-//
        char[] Array = ("Ukrainian National Forestry,Educational and scientific institute of woodworking and computer technologies and design,Computer Science-22,Computer Science").toCharArray();
        System.out.println(Array);

        System.out.println("----№2----");
        // -2-//
        String string1 = new String(Array,0,136);
        System.out.println("String: "+string1);
        System.out.println("----№3----");

        // -3-//
        StringBuffer string2 =new StringBuffer(string1);
        string2.reverse();
        System.out.println("String buffer after reversing = " + string2);
        System.out.println("----№4----");

        // -4-//
        String string3 =new String(string1.toUpperCase());
        System.out.println("String after toUpperCase = " + string3);
        if(string1.equals(string3))
            System.out.println("The line matches ");
        else
            System.out.println("The line not matches ");
        System.out.println("----№5----");

        // -5-//
        System.out.println(string1.substring(28,116));
        System.out.println("----№6----");

        // -6-//
        String string4= string1 +"---"+ string3;
        System.out.println(string4);
        System.out.println("----№7----");

        // -7-//
        System.out.println("First letter \"E\":"+string1.indexOf('E'));
        System.out.println("Last letter \"a\": " + string1.lastIndexOf('o'));
        System.out.println("----№8----");

        // -8-//
        StringBuffer string5 = new StringBuffer("Medvediev Roman Anatoliiovych , 02.01.2004");
        System.out.println(string5);
        System.out.println("----№9----");

        // -9-//
        System.out.println(string5.delete(30,38));
        System.out.println("----№10----");

        // -10-//
        string5.append(",Jerusalem");
        System.out.println(string5);
        System.out.println("----№11----");

        // -11-//
        string5.insert(34,",male");
        System.out.println(string5);
        System.out.println("----№12----");

        // -12-//
        String string5_1=new String(string5);
        System.out.println(string5.length());
        System.out.println(string5_1.getBytes(StandardCharsets.UTF_16LE).length);
        System.out.println("----№13----");

        // -13-//
        string5.setLength(29);
        System.out.println(string5);
        System.out.println("----№14----");

        // -14-//
        string5.setLength(9);
        string5.reverse();
        System.out.println(string5);

    }
}