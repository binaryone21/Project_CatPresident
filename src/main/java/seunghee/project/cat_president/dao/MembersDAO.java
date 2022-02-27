package seunghee.project.cat_president.dao;

import seunghee.project.cat_president.vo.MembersVO;
import seunghee.project.cat_president.vo.ZipCodeVO;

import java.util.List;

public interface MembersDAO {

    // 해당 아이디 존재 여부 확인
    int checkUserid(String email);

    // 주소 검색
    List<ZipCodeVO> findZipCode(String dong);

    // 신규 회원 등록
    int insertMember(MembersVO mvo);

    // 로그인
    MembersVO selectMemberOne(MembersVO mvo);







// 1 - 현우


    int selectOneUserid(String email);



    int updateUser(MembersVO mvo);
}
