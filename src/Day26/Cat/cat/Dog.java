package Day26.Cat.cat;

import Day26.Cat.cat.CanCry;

/**
 * Created by Administrator on 2017/6/27.
 */
public class Dog implements CanCry {
    @Override
    public void cry() {
        System.out.println("我是狗，我的叫声是汪汪汪");
    }
}
