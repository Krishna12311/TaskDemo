package com.example.ToDoApplication.Hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello what are you learning today?";
    }

    @RequestMapping("/say-html")
    @ResponseBody
    public String sayHelloHtml(){
    StringBuffer sb=new StringBuffer();
    sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>todo</title>");
        sb.append(" </head>");
        sb.append(" <body>");
        sb.append(" my todo project");
        sb.append(" </body>");
        sb.append("</html>");

        return sb.toString();
    }

    @RequestMapping("/say-hello-jsp")
    public String sayHellojsp(){
        return "sayHello";
    }
}
