package ch12api.lecture;

public class C18regex {
    public static void main(String[] args) {
        // regular expression : 정규표현식(정규식, 정규식표현)
        // 문자열의 패턴을 나타내는 기호들

        // 문자
        System.out.println("x".matches("x")); // true
        System.out.println("a".matches("a")); // true
        System.out.println("a".matches("x")); // false

        // 문자들
        System.out.println("xyz".matches("xyz")); // true
        System.out.println("xxx".matches("xxx")); // true
        System.out.println("xxx".matches("x")); // false

        // 수량자(quantifiers)
        System.out.println("xxx".matches("x{3}")); // true
        System.out.println("aaa".matches("a{3}")); // true
        System.out.println("aa".matches("a{3}")); // false
        System.out.println("aaa".matches("a{1,3}")); // true
        System.out.println("aa".matches("a{1,3}")); // true
        System.out.println("a".matches("a{1,3}")); // true

        System.out.println("dog".matches("do{1,3}g")); // true
        System.out.println("dooog".matches("do{1,3}g")); // true
        System.out.println("doog".matches("do{1,3}g")); // true

        System.out.println("dodog".matches("do{1,3}g")); // false

        // 그룹 : ()
        System.out.println("dodog".matches("(do){1,3}g")); // true
        System.out.println("dododog".matches("(do){1,3}g")); // true
        System.out.println("dog".matches("(do){1,3}g")); // true

        // 수량 :
        System.out.println("dog".matches("do{1,}g")); // true
        System.out.println("doog".matches("do{1,}g")); // true
        System.out.println("dooog".matches("do{1,}g")); // true
        System.out.println("doooog".matches("do{1,}g")); // true
        System.out.println("dooooooog".matches("do{1,}g")); //true

        // ? : 없거나 한번
        System.out.println("dg".matches("do?g")); // true
        System.out.println("dog".matches("do?g")); // true
        System.out.println("doog".matches("do?g")); // false

        // * : 0번 이상
        System.out.println("dg".matches("do*g")); // true
        System.out.println("dog".matches("do*g")); // true
        System.out.println("doog".matches("do*g")); // true
        System.out.println("dooog".matches("do*g")); // true
        System.out.println("doooog".matches("do*g")); // true

        // + : 1번 이상
        System.out.println("dg".matches("do+g")); // false
        System.out.println("dog".matches("do+g")); // true
        System.out.println("doog".matches("do+g")); // true
        System.out.println("dooog".matches("do+g")); // true
        System.out.println("doooog".matches("do+g")); // true

        // 문자 분류 (Character classes)
        System.out.println("dog".matches("d[oi]g")); // true
        System.out.println("dig".matches("d[oi]g")); // true
        System.out.println("dag".matches("d[io]g")); //false

        System.out.println("dog".matches("d[^oi]g")); // false
        System.out.println("dig".matches("d[^oi]g")); // false
        System.out.println("dag".matches("d[^oi]g")); // true

        System.out.println("dag".matches("d[a-z]g")); // true
        System.out.println("dbg".matches("d[a-z]g")); // true
        System.out.println("dcg".matches("d[a-z]g")); // true
        System.out.println("dzg".matches("d[a-z]g")); // true

        System.out.println("dag".matches("d[a-cx-z]g")); // true
        System.out.println("dbg".matches("d[a-cx-z]g")); // true
        System.out.println("dcg".matches("d[a-cx-z]g")); // true
        System.out.println("ddg".matches("d[a-cx-z]g")); // false
        System.out.println("deg".matches("d[a-cx-z]g")); // false
        System.out.println("dfg".matches("d[a-cx-z]g")); // false
        System.out.println("dxg".matches("d[a-cx-z]g")); // true
        System.out.println("dyg".matches("d[a-cx-z]g")); // true
        System.out.println("dzg".matches("d[a-cx-z]g")); // true


        // 문자 분류 기호
        System.out.println("0".matches("[0-9]")); // true
        System.out.println("7".matches("[0-9]")); // true
        System.out.println("0".matches("\\d")); // true
        System.out.println("7".matches("\\d")); // true

        System.out.println("a".matches("[a-zA-Z_0-9]")); // true
        System.out.println("_".matches("\\w")); // true
        System.out.println("8".matches("\\w")); // true

        // 예제 자바 변수명 작성규칙
        // : 숫자로 시작하면 안되고, 영문대소문자, _, $, 숫자
        String pattern = "[a-zA-Z_$][a-zA-Z_$0-9]*";
        System.out.println("pattern_1".matches(pattern)); // true
        System.out.println("_".matches(pattern));
        System.out.println("$".matches(pattern));
        System.out.println("4".matches(pattern));
        System.out.println("01023156149".matches("(0(2|10)-?\\d{3,4}-?\\d{4}|0\\d{8}|\\d{2})"));
        System.out.println("010-2315-6149".matches("(0(2|10)-?\\d{3,4}-?\\d{4}|0\\d{8}|\\d{2})"));
        System.out.println("02-2315-6149".matches("(0(2|10)-?\\d{3,4}-?\\d{4}|0\\d{8}|\\d{2})"));
        System.out.println("022316149".matches("(0(2|10)-?\\d{3,4}-?\\d{4}|0\\d{8}|\\d{2})"));
        System.out.println("02#2316#149".matches("(0(2|10)-?\\d{3,4}-?\\d{4}|0\\d{8}|\\d{2})"));

        System.out.println("namic123@naver.com".matches("\\w*@\\w*\\.\\w*"));

    }
}
