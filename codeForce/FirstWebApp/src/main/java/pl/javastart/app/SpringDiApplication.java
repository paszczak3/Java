package pl.javastart.app;

import org.springframework.context.annotation.*;
import pl.javastart.beans.*;
import pl.javastart.config.AppConfig;

import java.io.File;
import java.util.List;

@Configuration
@ComponentScan(basePackages = {"pl.javastart.beans"})//,excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = MessagePrinter.class))//,
//excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = MessagePrinter.class))
public class SpringDiApplication {

    /*
    @Bean
   // @Primary
    public MessagePrinter messagePrinter () {
        MessageProducer messageProducer = new SimpleMessageProducer();
        return new MessagePrinter(messageProducer);
    }

    @Bean
    @Primary
    public MessagePrinter messagePrinter2(){
        MessageProducer messageProducer = new FileMessageProducer();
        return  new MessagePrinter(messageProducer);
    }

*/


    public static void main(String[] args) {
        /*
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(SpringDiApplication.class, AppConfig.class);
        MessagePrinter printer = ctx.getBean(MessagePrinter.class);
        printer.print();
        */

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
                SpringDiApplication.class);

        NamesRepository namesRepo= ctx.getBean(NamesRepository.class);
        List<String> allNames = namesRepo.getAll();
        allNames.forEach(System.out::println);



        ctx.close();
    }
}