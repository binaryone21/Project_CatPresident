package seunghee.project.cat_president.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seunghee.project.cat_president.dao.ProductsDAO;
import seunghee.project.cat_president.vo.BoardVO;
import seunghee.project.cat_president.vo.CategoryVO;
import seunghee.project.cat_president.vo.ProductsVO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service("pdsrv")
public class ProductsServiceImpl implements ProductsService {

    @Autowired
    private ProductsDAO pddao;

    // 기획전, 노하우 게시물 리스트 읽어오기
    @Override
    public List<BoardVO> readBoardList(String bgroup) {
        return pddao.selectBoardList(bgroup);
    }

    // 기획전, 노하우 게시물 읽어오기
    @Override
    public BoardVO readBoardOne(String bno) {
        return pddao.selectBoardOne(bno);
    }

    // 기획전, 노하우 제품 리스트 읽어오기
    @Override
    public List<ProductsVO> readBoardProducts(String bno) {
        String[] pnos = (pddao.selectBoardProducts(bno)).split("[,]");
        List<ProductsVO> pvos = new ArrayList<>();
        for (String pno : pnos) {
            pvos.add(pddao.selectProductsOne(pno));
        }
        return pvos;
    }

    // 카테고리 조건 정리
    @Override
    public String categoryNeed(String cate) {
        String need;
        if ( cate.equals("1000")) {
            need = "where ctno like \'%\' ";
        } else if ( cate.substring(2).equals("00")) {
            need = "where ctno like \'"+cate.substring(0,2)+"%\' ";
        } else {
            need = "where ctno = "+cate+" ";
        }
        return need;
    }

    // 정렬 조건 정리
    @Override
    public String orderNeed(String order) {
        String need ="";
        if ( order.equals("time")) {
            need = "order by pno desc";
        } else if ( order.equals("highPrice")) {
            need = "order by totprice desc";
        } else if ( order.equals("lowPrice")) {
            need = "order by totprice";
        } else if ( order.equals("star")) {
            need = "order by pno desc";
        } else if ( order.equals("reply")) {
            need = "order by pno desc";
        } else if ( order.equals("best")) {
            need = "order by sales desc";
        }
        return need;
    }

    // 기타 조건 정리
    @Override
    public String whereNeed(String where) {
        String need ="";
        if ( where.equals("recent")) {
            need = "where regdate = '2021-03-25'";
        }
        return need;
    }

    // 제품 리스트 읽어오기
    @Override
    public List<ProductsVO> readProductsList(String cp, String target) {
        Map<String, String> param = new HashMap<>();
        String snum = String.valueOf((Integer.parseInt(cp)-1)*30);
        param.put("snum", snum);
        param.put("target", target);
        return pddao.selectProductsList(param);
    }

    // 제품 갯수 읽어오기
    @Override
    public int readCountProducts(String target) {
        return pddao.selectCountProducts(target);
    }

    // 스티커 제품 리스트 읽어오기
    @Override
    public List<ProductsVO> readStickerList(String cp, String target) {
        Map<String, String> param = new HashMap<>();
        String snum = String.valueOf((Integer.parseInt(cp)-1)*30);
        param.put("snum", snum);
        param.put("target", target);
        return pddao.selectStickerList(param);
    }

    // 스티커 제품 갯수 읽어오기
    @Override
    public int readCountSticker(String target) {
        return pddao.selectCountSticker(target);
    }


    @Override // 제품 하나 읽어오기
    public ProductsVO readProductOne(String pno) {
        return pddao.selectProductsOne(pno);
    }
}
