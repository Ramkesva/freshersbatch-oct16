package com.Assign1;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
@Controller  
public class HelloController {  
@RequestMapping("/hello")  
    public String redirect()    
    {  
        return "viewpage";  
    }   
}

@RequestMapping("/hello1")  
public String display()  
{  
    return "final";  
}  
}  