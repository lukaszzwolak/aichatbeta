package pl.coderslab.aichat.controllers;

import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.aichat.repositories.ApplicationUserRepository;

@RestController
public class ApplicationUserController {

    //    private final ApplicationUserRepository applicationUserRepository;

//    @Autowired
//    public ApplicationUserControllerr(ApplicationUserRepository applicationUserRepository) {
//        this.applicationUserRepository = applicationUserRepository;
//    }
//
//    @GetMapping
//    public List<Book> getAllBooks() {
//        return bookRepository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Book getBookById(@PathVariable Long id) {
//        return bookRepository.findById(id).orElse(null);
//    }
//
//    @PostMapping
//    public Book addBook(@RequestBody Book book) {
//        return bookRepository.save(book);
//    }
//
//    @PutMapping("/{id}")
//    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
//        if (bookRepository.existsById(id)) {
//            updatedBook.setId(id);
//            return bookRepository.save(updatedBook);
//        }
//        return null;
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteBook(@PathVariable Long id) {
//        bookRepository.deleteById(id);
//    }
}
