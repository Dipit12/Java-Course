public class string_ex {
    static String greet(){
        String greeting = "Hello how are you?";
        return greeting;
    }

    static String personal_greeting(String name){
        return "Hello  " + name;
    }

    public static void main(String[] args){
        String message = greet();
        System.out.println(message);
        System.out.println(personal_greeting("Dipit"));
    }
}
