package ch07extends.lecture;

public class C11polymorphism {
    public static void main(String[] args) {
        String s = "java";
        Object o = s;
        String t = new String("java");

        int v1 = s.hashCode();
        int v2 = o.hashCode();
        int v3 = t.hashCode();

        System.out.println("v1 = " + System.identityHashCode(s));
        System.out.println("v2 = " + System.identityHashCode(o));
        System.out.println("v3= "+  System.identityHashCode(t));
    }
}
