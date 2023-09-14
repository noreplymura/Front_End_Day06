public class Test {
    public static void main(String args[]) {
        String s = "alpha+beta+gama+delta+sigma";
        String[] result = s.split("\\+", 0); 
       
        for (String sub_string : result) {
            System.out.println(sub_string);
        }
    }
}
