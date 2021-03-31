import com.kuang.entity.People1;
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
 *  @Resource和@Autowired区别：
 *  都是用来自动装配的，都可以放在属性字段上
 *  @Autowired 通过bynType的方式实现，而且必须要求对象存在！（否则空指针）
 *  @Resource 默认通过byname的方式实现，如果找不到名字，则通过byType实现！如果两个都找不到的情况下，就报错！
 *  执行顺序不同：
 */
public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people.toString());

        people.getCat().shout();
        people.getDog().shout();

        People1 people1 = context.getBean("people1", People1.class);
        System.out.println(people1.toString());

        people1.getCat().shout();
        people1.getDog().shout();
    }

}
