package deors.demos.microservices.deorsdemosmicroservicesbookrecservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;


@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/bookrec")
    public String getBookRecommendation() throws UnknownHostException {
        return "the host in IP: "
                + InetAddress.getLocalHost().getHostAddress()
                + " recommends this book: "
                + bookRepository.getBooksRandomOrder().get(0);
    }
}