package pl.javastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    private MessageProducer producer;
    private MessageDecorator decorator;
   // private FileMessageProducer fileMessageProducer;

    /*
    @Autowired(required = false)
    public void setFileMessageProducer(FileMessageProducer fileMessageProducer) {
        this.fileMessageProducer = fileMessageProducer;
    }

    public FileMessageProducer getFileMessageProducer() {
        return fileMessageProducer;
    }
*/
    @Autowired(required = false)
    public void setDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    MessagePrinter() {}

    @Autowired
    public MessagePrinter(@Producer(type = Producer.ProducerType.FILE) MessageProducer producer) {
        this.producer = producer;
    }

    public MessageProducer getProducer() {
        return producer;
    }

   // @Autowired(required = false)
   // @Qualifier("simpleMessageProducer")
    public void setProducer(MessageProducer producer) {
        this.producer = producer;
    }

    public void print() {
        /*
        String message = producer.getMessage();
        message = decorator.decorate(message);
        if(decorator != null) {
            System.out.println(message);
        } else {
            System.out.println("Decorator jest rowny null");
        }
        *
        */

        System.out.println("Message produced: " + producer.getMessage());

        /*
        String message = producer.getMessage();
        message = decorator != null? decorator.decorate(message) : message;
        System.out.println(message);

        /*
        String message2 = fileMessageProducer.getMessage();
        if(fileMessageProducer !=null){
            System.out.println(message2);
        } else {
            System.out.println("nie czytam z pliku");
        }

        if(producer == null) {
            System.out.println("producer jest rowny null");
        } else {
            System.out.println(producer.getMessage());
            System.out.println("producer jest rozny od null");
        }
        */
    }
}