package seunghee.project.cat_president.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seunghee.project.cat_president.dao.MypageDAO;
import seunghee.project.cat_president.vo.CatSpeciesVO;
import seunghee.project.cat_president.vo.CatVO;
import seunghee.project.cat_president.vo.MembersVO;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service("mysrv")
public class MypageServiceImpl implements MypageService {

    @Autowired
    private MypageDAO mydao;

    // 고양이 리스트 읽어오기
    @Override
    public List<CatVO> readCatList(String uno) {
        return mydao.selectCatList(uno);
    }

    // 고양이 품종 읽어오기
    @Override
    public List<CatSpeciesVO> readSpeciesList() {
        return mydao.selectSpeciesList();
    }

    // 고양이 이름 중복 체크
    @Override
    public String checkCat(CatVO cvo) {
        return mydao.selectCatCno(cvo);
    }

    // 고양이 정보 등록
    @Override
    public void addNewCat(CatVO cvo, HttpSession sess) {
        mydao.insertNewCat(cvo);

        // 대표 고양이 번호 지정
        if (cvo.getPrima().equals("Y")) {
            cvo.setPrima("N");
            String catno = mydao.selectCatCno(cvo);
            MembersVO mvo = (MembersVO) sess.getAttribute("user");
            mvo.setCatno(catno);
            mydao.updateMemberCno(mvo);
        }
    }

    // 고양이 정보 읽어오기
    @Override
    public CatVO readCatOne(String catno) {
        return mydao.selectCatOne(catno);
    }

//    // 고양이 정보 수정
//    @Override
//    public int modifyCatOnt(CatVO cvo) {
//        System.out.println(cvo.getCatname()+" "+cvo.getUno());
//        return mydao.updateCatOne(cvo);
//    }

    // 고양이 이름 중복 체크 (업데이트)
    @Override
    public int countCatCno(CatVO cvo) {
        return mydao.countCatCno(cvo);
    }

    // 고양이 정보 수정
    @Override
    public void modifyCatOne(CatVO cvo, HttpSession sess) {
        mydao.updateCatOne(cvo);

        // 대표 고양이 번호 지정
        if (cvo.getPrima().equals("Y")) {
            cvo.setPrima("N");
            String catno = mydao.selectCatCno(cvo);
            MembersVO mvo = (MembersVO) sess.getAttribute("user");
            mvo.setCatno(catno);
            mydao.updateMemberCno(mvo);
        }
    }
}
