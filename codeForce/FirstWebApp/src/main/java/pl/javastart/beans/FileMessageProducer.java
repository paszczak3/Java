package pl.javastart.beans;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
@Producer(type = Producer.ProducerType.FILE)
@PropertySource("classpath:appConfig.properties")
public class FileMessageProducer implements MessageProducer {

/*
    @Autowired
    @Value("${messageFileProperty}")
    private String fileName;


//trzeba odkomentowac ti co jest w getMessage aby to dzialalo a to Value zakomentowac
    @Autowired
    private org.springframework.core.env.Environment env;
*/


    @Value("${messageFileProperty}")
    private String fileName;


    @Override
    public String getMessage() {
        List<String> lines = null;
        try {
           // String fileName = env.getProperty("messageFileProperty");
            Path path = new File(getClass().getResource(fileName).toURI()).toPath();
            lines = Files.readAllLines(path);
        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        String result = "";
        if (lines != null)
            result = lines.stream().reduce(result, (a, b) -> a + b);
        return result;
    }
}
