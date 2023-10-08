package ch05reference;

public class C14enum {
    public static void main(String[] args) {
        MySeason v1 = MySeason.FALL;
        MySeason v2 = MySeason.SPRING;

        System.out.println("v1.toString() = " + v1.toString());
        System.out.println("v1.hashCode() = " + v1.hashCode());
        System.out.println("v1.equals(null) = " + v1.equals(null));

        System.out.println("v1.name() = " + v1.name());
        System.out.println("v1.ordinal() = " + v1.ordinal());
        System.out.println("v2.ordinal() = " + v2.ordinal());
    }
}
enum MySeason {
    SPRING,
    SUMMER,
    FALL,
    WINTER
}
