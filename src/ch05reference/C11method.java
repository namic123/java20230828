package ch05reference;

public class C11method {
    public static void main(String[] args) {
        int[] a = method1();

        System.out.println("change git");
        System.out.println("ihrhbakrfpndopljhygc".length());
    }
    public static int[] method1(){
        int[] c = {9,7,5};
        System.out.println("method1 내부");
        System.out.println(System.identityHashCode(c));

        return c;
    };
}
