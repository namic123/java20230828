package ch12api.lecture;

public class C35annotatiton {
@MyAnnotation35(name={"son","lee"})
    int field;
int field2;
}
@interface MyAnnotation35{
    String[] name();

}
