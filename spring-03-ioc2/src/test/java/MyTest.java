import com.kuang.pojo.User;
import com.kuang.pojo.UserT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 在配置文件beans.xml加载的时候，容器中管理的对象就已经初始化了
 */
public class MyTest {

    public static void main(String[] args) {
        /*User user = new User();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //我们的对象都在spring中管理了，我们要使用直接去里面取出来就可以了
        User user = (User) context.getBean("user");
        user.show();

        UserT user2 = (UserT) context.getBean("u2");
        user2.show();
    }

}
