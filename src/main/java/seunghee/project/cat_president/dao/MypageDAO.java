package seunghee.project.cat_president.dao;

import seunghee.project.cat_president.vo.CatSpeciesVO;
import seunghee.project.cat_president.vo.CatVO;
import seunghee.project.cat_president.vo.MembersVO;

import java.util.List;

public interface MypageDAO {

    // 고양이 리스트 읽어오기
    List<CatVO> selectCatList(String uno);

    // 고양이 품종 읽어오기
    List<CatSpeciesVO> selectSpeciesList();

    // 고양이 번호 읽어오기
    String selectCatCno(CatVO cvo);

    // 고양이 정보 등록
    void insertNewCat(CatVO cvo);

    // 대표고양이 번호 수정
    int updateMemberCno(MembersVO mvo);

    // 고양이 정보 읽어오기
    CatVO selectCatOne(String catno);

    // 고양이 이름 중복 체크 (업데이트)
    int countCatCno(CatVO cvo);

    // 고양이 정보 수정
    int updateCatOne(CatVO cvo);

}
