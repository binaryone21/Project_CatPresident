package seunghee.project.cat_president.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CatagoryController {
    @Autowired
    private CategoryService ctgrSrv;

    // 카테고리 페이지
    @GetMapping("/category/every")
    public ModelAndView CategoryEvery() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("category/category_every.tiles");
        mav.addObject("TC_List", ctgrSrv.voListCategory());
        return mav;
    }

    // 카테고리 리스트
    @GetMapping("/category/list")
    public ModelAndView CategoryList(ModelAndView mv, String cate, String order, String cp) {
        mv.setViewName("category/category_list.tiles");
        // 카테고리 목록
        mv.addObject("cates",ctgrSrv.readCategoryList());

        // 카테고리 타이틀
        mv.addObject("ct_title", ctgrSrv.readCategoryCatename(cate));

        // 조건 정리
        // String need1 = ctgrSrv.categoryNeed(cate);
        // String need2 = ctgrSrv.orderNeed(order);
        // String target = need1 + need2;

        // mv.addObject("PDs", ctgrSrv.readProductsList(cp, target));
        // mv.addObject("PDCount", ctgrSrv.readCountProducts(target));

        return mv;
    }
}
