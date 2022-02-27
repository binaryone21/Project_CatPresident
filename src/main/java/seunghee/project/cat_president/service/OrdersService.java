package seunghee.project.cat_president.service;

import seunghee.project.cat_president.vo.CategoryVO;
import seunghee.project.cat_president.vo.ProductsVO;

import java.util.List;

public interface OrdersService {

    String addBuylist(ProductsVO pvo, String uno);

    List<ProductsVO> readbuylist(String uno);

    List<CategoryVO> readCategory();

    List<ProductsVO> readProduct();
}
