package qa.practice;

public class RemoveJunk {

    public static void main(String[] args) {
        String str = "te♠st data here ♠ ♣ !@#$%^&* ♠ ♣";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);
    }
}
