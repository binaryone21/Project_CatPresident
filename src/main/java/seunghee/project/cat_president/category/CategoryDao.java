package seunghee.project.cat_president.category;

import seunghee.project.cat_president.vo.CategoryVO;

import java.util.List;

public interface CategoryDao {

    // 카테고리 대분류 읽어오기
    List<CategoryVO> voListCategory();

    // 카테고리 전체 읽어오기
    List<CategoryVO> selectCategoryList();

    // 카테고리 타이틀 읽어오기
    String selectCategoryCatename(String target);

}
