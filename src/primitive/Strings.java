package primitive;

public class Strings {

    public static void main(String[] args) {
        String s1 = "Privet";
        String s2 = "Medved";
        System.out.println(s1 + ", " + s2 + "!");

        String name = "John";
        int age = 33;
        String s = "Hello, \"" + name + "\". \nYou are " + age + " years old.";
        System.out.println(s);

        //управляющие символы: \n - символ переноса   \" - символ ковычки (экранируем)
        
    }
}
