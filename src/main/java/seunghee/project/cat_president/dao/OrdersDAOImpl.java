package seunghee.project.cat_president.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seunghee.project.cat_president.vo.CategoryVO;
import seunghee.project.cat_president.vo.MembersVO;
import seunghee.project.cat_president.vo.ProductsVO;

import java.util.List;

@Repository("oddao")
public class OrdersDAOImpl implements OrdersDAO{

    @Autowired
    private SqlSession sqlSession;


    @Override
    public MembersVO selectBuylist(String uno) {
        return sqlSession.selectOne("Orders.downbuylist", uno);
    }

    @Override
    public int updateBuyamount(MembersVO mvo) {
        return sqlSession.update("Orders.upbuylist");
    }

    @Override
    public List<CategoryVO> selectCategory() {
        return sqlSession.selectList("Orders.cateList");
    }

    @Override
    public List<ProductsVO> selectPrdBrand() {
        return sqlSession.selectList("Orders.brandList");
    }
}
