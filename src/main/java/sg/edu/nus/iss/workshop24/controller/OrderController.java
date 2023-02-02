package sg.edu.nus.iss.workshop24.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/order")
public class OrderController {

    @PostMapping
    public String postCart(@RequestBody MultiValueMap<String, String>
        Model model, HttpSesion sess) {
            List<OrderDetails> ordDetails = sess.getAttribute("")
        }
    
}
