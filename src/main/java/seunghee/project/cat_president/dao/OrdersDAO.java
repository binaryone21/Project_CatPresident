package seunghee.project.cat_president.dao;

import seunghee.project.cat_president.vo.CategoryVO;
import seunghee.project.cat_president.vo.MembersVO;
import seunghee.project.cat_president.vo.ProductsVO;

import java.util.List;

public interface OrdersDAO {

    // 현재의 장바구니설정 불러오기
    MembersVO selectBuylist(String uno);

    int updateBuyamount(MembersVO mvo);

    List<CategoryVO> selectCategory();

    List<ProductsVO> selectPrdBrand();
}
