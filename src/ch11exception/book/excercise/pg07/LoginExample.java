package ch11exception.book.excercise.pg07;

public class LoginExample {
    public static void main(String[] args) {
        try {
            login("id1","12345");
        }catch (Exception e){
            System.out.println(e);
        }

        try{
            login("id2", "54321");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void login(String id, String password) throws NotExistIDException, WrongPasswordException{
        if(!id.equals("id2")){
            throw new NotExistIDException("아이디가 존재하지 않습니다.");
        }
        if(!password.equals("12345")){
            throw new WrongPasswordException("패스워드가 틀립니다.");
        }
    }
}
