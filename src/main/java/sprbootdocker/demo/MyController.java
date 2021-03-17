package sprbootdocker.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {
    @Value("${server.port}")
    private String port;

    @GetMapping
    public String showWelcomePage() {
        return "this is a page from SpringBootApp, port:" + port;
    }

    @GetMapping("page1")
    public String showPage1(){
        return "this is page 1";
    }
    @GetMapping("page2")
    public String showPage2(){
        return "this is page 2";
    }
}
