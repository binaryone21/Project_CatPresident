package seunghee.project.cat_president.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seunghee.project.cat_president.vo.BoardVO;
import seunghee.project.cat_president.vo.CategoryVO;
import seunghee.project.cat_president.vo.ProductsVO;

import java.util.List;
import java.util.Map;

@Repository("pddao")
public class ProductsDAOImpl implements ProductsDAO {

    @Autowired
    private SqlSession sqlSession;

    // 기획전, 노하우 게시물 리스트 읽어오기
    @Override
    public List<BoardVO> selectBoardList(String bgroup) {
        return sqlSession.selectList("Products.readBoardList", bgroup);
    }

    // 기획전, 노하우 게시물 읽어오기
    @Override
    public BoardVO selectBoardOne(String bno) {
        return sqlSession.selectOne("Products.readBoardOne", bno);
    }

    // 기획전, 노하우 제품 리스트 읽어오기
    @Override
    public String selectBoardProducts(String bno) {
        return sqlSession.selectOne("Products.readBoardProducts", bno);
    }

    // 제품 목록 읽어오기
    @Override
    public List<ProductsVO> selectProductsList(Map param) {
        return sqlSession.selectList("Products.readProductsList", param);
    }

    // 제품 갯수 읽어오기
    @Override
    public int selectCountProducts(String target) {
        return sqlSession.selectOne("Products.readCountProducts", target);
    }

    // 스티커 제품 목록 읽어오기
    @Override
    public List<ProductsVO> selectStickerList(Map param) {
        return sqlSession.selectList("Products.readStickerList", param);
    }

    // 스티커 갯수 읽어오기
    @Override
    public int selectCountSticker(String target) {
        return sqlSession.selectOne("Products.readCountSticker", target);
    }

    // 제품 하나 읽어오기
    @Override
    public ProductsVO selectProductsOne(String pno) {
        return sqlSession.selectOne("Products.readProductsOne", pno);
    }
}
