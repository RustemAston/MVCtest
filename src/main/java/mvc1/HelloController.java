package mvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHello(){
        return "hello_world";         // здесь название возвращаемой view, т.е. имеется ввиду hello_world.html
    }

    @GetMapping("/goodbye")
    public String getGoodbye(){
        return "goodbye";
    }
}