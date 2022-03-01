package seunghee.project.cat_president.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatagoryController {
    @Autowired
    // private CategoryService ctgrSrv;

    // 카테고리 페이지
    @GetMapping("/category/page")
    public ModelAndView CatetoryPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("");
        return mav;
    }
}
