package com.hulei.myspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mr.Hu
 * @create 2022 - 10 - 2022/10/15
 */

/*@ResponseBody
@Controller*/

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handle01(){
        return "Hello,Spring Boot 2!";
    }


}
