public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder();
        builder1.append("a");
        builder1.append("b");
        builder1.append("c");
        builder1.append("d");
        System.out.println(builder1);
        builder1.delete(0,2);
        System.out.println(builder1);
        builder1.append("c");
        builder1.append("d");
        builder1.reverse();
        System.out.println(builder1);
        builder1.deleteCharAt(2);
        System.out.println(builder1);
    }
}
