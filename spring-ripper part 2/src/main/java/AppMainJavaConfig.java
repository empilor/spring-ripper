import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import screensaver.ColorFrame;

public class AppMainJavaConfig {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        while (true) {
            context.getBean(ColorFrame.class).showOnRandomPlace();
            Thread.sleep(300);
        }
    }
}
