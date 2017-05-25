/**
 * 
 */
package zc.mvc.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author zhouchao
 *
 */
@Controller
public class GoController {
  
  @RequestMapping(value={"/"},method= {RequestMethod.HEAD})
  public String head(){
    return "go.jsp";
  }
}
