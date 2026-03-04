package JavaSession4;

public class Titlecase  {

    public static void main(String[] args) {

        String word = "hello world from java";
        String[] a = word.split(" ");
        String res = "";

        for(String wd : a){
            res += wd.substring(0,1).toUpperCase() + wd.substring(1) + " ";
        }

        System.out.println(res.trim());
    }
}
