package seunghee.project.cat_president.category;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seunghee.project.cat_president.vo.CategoryVO;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    SqlSession sqlSession;

    // 카테고리 대분류 읽어오기
    @Override
    public List<CategoryVO> voListCategory() {
        return sqlSession.selectList("ctgrMap.voListCategory");
    }

    // 카테고리 전체 읽어오기
    @Override
    public List<CategoryVO> selectCategoryList() {
        return sqlSession.selectList("ctgrMap.readCategoryList");
    }

    // 카테고리 타이틀 읽어오기
    @Override
    public String selectCategoryCatename(String target) {
        return sqlSession.selectOne("ctgrMap.readCategoryCatename", target);
    }

}
