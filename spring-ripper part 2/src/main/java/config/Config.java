package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import screensaver.ColorFrame;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "screensaver")
public class Config {
    @Bean
    @Scope("periodical")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255),
                random.nextInt(255),
                random.nextInt(255));
    }

    @Bean
    public ColorFrame frame() {
        ColorFrame frame = new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
        return frame;
    }
}
