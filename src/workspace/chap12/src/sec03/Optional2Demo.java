package workspace.chap12.src.sec03;

import java.util.Optional;

public class Optional2Demo {
    public static void main(String[] args) {
        String s1 = "�ȳ�";  // or String s1 = null;
        Optional<String> o = Optional.ofNullable(s1);

        if(s1 != null)
            Util.print(s1);
        else
            Util.print("����");

        if(o.isPresent())
            Util.print(o.get());
        else
            Util.print("����");

        String s2 = o.orElse("����");
        Util.print(s2);

        o.ifPresentOrElse(Util::print, () -> System.out.println("����"));
    }
}