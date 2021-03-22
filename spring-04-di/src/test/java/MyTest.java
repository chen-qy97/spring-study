import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println("student--name: " + student.getName());
        System.out.println("***************************************");
        System.out.println("student: " + student.toString());
    }

    /**
     * 注意：p命名和c命名空间不能直接使用，需要倒入xml约束
     */
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
        User user1 = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user1 ==user2);
        System.out.println(user1.toString());
    }

}
