import com.kuang.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的自动装配
 * 1.自动装配是Spring满足bean依赖一种方式
 * 2.Spring会在上下文中自动寻找，并自动给bean装配属性
 *
 *
 *
 */
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people.toString());

        people.getCat().shout();
        people.getDog().shout();
    }

}
