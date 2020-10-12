import org.springframework.context.support.ClassPathXmlApplicationContext;
import quoters.Quoter;

public class ApplicationMain {
    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Thread.sleep(3000);
        context.getBean(Quoter.class);
    }
}
