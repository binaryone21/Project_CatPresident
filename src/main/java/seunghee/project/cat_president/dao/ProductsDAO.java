package seunghee.project.cat_president.dao;


import seunghee.project.cat_president.vo.BoardVO;
import seunghee.project.cat_president.vo.CategoryVO;
import seunghee.project.cat_president.vo.ProductsVO;

import java.util.List;
import java.util.Map;

public interface ProductsDAO {

    // 기획전, 노하우 게시물 리스트 읽어오기
    List<BoardVO> selectBoardList(String bgroup);

    // 기획전, 노하우 게시물 읽어오기
    BoardVO selectBoardOne(String bno);

    // 기획전, 노하우 제품 리스트 읽어오기
    String selectBoardProducts(String bno);

    // 제품 목록 읽어오기
    List<ProductsVO> selectProductsList(Map param);

    // 제품 갯수 읽어오기
    int selectCountProducts(String target);

    // 스티커 제품 목록 일어오기
    List<ProductsVO> selectStickerList(Map param);

    // 스티커 제품 갯수 읽어오기
    int selectCountSticker(String target);

    // 제품 하나 읽어오기
    ProductsVO selectProductsOne(String pno);
}
