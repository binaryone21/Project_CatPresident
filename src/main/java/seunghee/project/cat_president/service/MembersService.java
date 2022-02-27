package seunghee.project.cat_president.service;

import seunghee.project.cat_president.vo.MembersVO;

import javax.servlet.http.HttpSession;

public interface MembersService {

    // 해당 아이디 존재 여부 확인
    int checkUserid(String email);

    // 주소 검색
    String findZipCode(String dong);

    // 신규 회원 등록
    int addNewMember(MembersVO mvo);

    // 로그인
    String tryLogin(MembersVO mvo, HttpSession sess);





    String findUserId(String email);


    boolean modifyUser(MembersVO mvo);
}
