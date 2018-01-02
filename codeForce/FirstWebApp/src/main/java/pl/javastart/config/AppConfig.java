package pl.javastart.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import pl.javastart.beans.DatabaseDatasource;
import pl.javastart.beans.DevProfile;
import pl.javastart.beans.ProdProfile;

import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Configuration
@PropertySource("classpath:appConfig.properties")
public class AppConfig {

    @Bean
    @DevProfile
    public DatabaseDatasource getH2Datasource() {
        return (() -> Arrays.asList("Test1","Test2","Test3","Test4","Test5"));
    }

    @Bean
    @ProdProfile
    public DatabaseDatasource getMysqlDatasource() {
        return new DatabaseDatasource() {
            @Override
            public List<String> getDatabase() {
                try{
                    Path filePath = new File(getClass().getResource("/data.txt").toURI()).toPath();
                    List<String> allLines = Files.readAllLines(filePath);
                    return allLines;
                } catch (IOException | URISyntaxException e) {
                    e.printStackTrace();
                }
                return new ArrayList<>();
            }
        };
    }

    /*
    @Bean
    @Qualifier("messageFile")
    public String configFileName() {
        return "/message.txt";
    }
*/
    @Bean
    @Qualifier("randomNumber")
    public int getRandom(){
        return new Random().nextInt();
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer
    getPropertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
