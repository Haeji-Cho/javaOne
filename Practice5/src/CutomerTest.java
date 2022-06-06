public class CutomerTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.Member("조해지", "whgowl", "wh", 22);
        m.show(m.getname(), m.getid(), m.getpw(), m.getage());
    }
}

class Member{
    private String name;
    private String id;
    private String pw;
    private int age;

    public String getname(){
        return name;
    }
    public String getid(){
        return id;
    }
    public String getpw(){
        return pw;
    }
    public int getage(){
        return age;
    }

    public void Member(String name, String id, String pw, int age) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    void show(String name, String id, String pw, int age){
        System.out.printf("이름은: %s, 아이디는: %4s, 비밀번호: %4s, 나이는: %4d", name, id, pw, age);
    }

}
