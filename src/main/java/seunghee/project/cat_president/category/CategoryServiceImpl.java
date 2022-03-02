package seunghee.project.cat_president.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seunghee.project.cat_president.vo.CategoryVO;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao ctgrDao;

    // 카테고리 대분류 읽어오기
    @Override
    public List<CategoryVO> voListCategory() {
        return ctgrDao.voListCategory();
    }

    // 카테고리 전체 읽어오기
    @Override
    public List<CategoryVO> readCategoryList() {
        return ctgrDao.selectCategoryList();
    }

    // 카테고리 타이틀 읽어오기
    @Override
    public String readCategoryCatename(String target) {
        return ctgrDao.selectCategoryCatename(target);
    }

}
