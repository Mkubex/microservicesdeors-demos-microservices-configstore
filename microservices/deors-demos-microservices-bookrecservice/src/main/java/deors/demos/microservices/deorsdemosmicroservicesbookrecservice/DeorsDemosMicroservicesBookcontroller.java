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