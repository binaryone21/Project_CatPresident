/*** Global Variable **************************************************/

    let searchText = $('#hd_searchText')





/*** Event ************************************************************/

    // 메인 로그 클릭
    $('#mainLogo').on('click', () => { location.href = "/" })

    // 제품 검색 버튼 클릭
    $('#hd_searchBtn').on('click', searchProductList)

    // 제품 검색 엔터
    searchText.on('keyup', (e) => { if(e.keyCode === 13) { searchProductList() }})

    // 로그인 버튼 클릭
    $('.BTN_goLogin').on('click', () => { location.href = "/user/login" })

    // 회원가입 버튼 클릭
    $('.BTN_goSignUp').on('click', () => { location.href = "/user/signup" })

/*** Function *********************************************************/

    // 제품 검색
    function searchProductList() {
        let searchText =  $('#hd_searchText').val();
        location.href = "/find/list?find="+searchText+"&cate=1000&order=time&cp=1";
    }


/*
// 제품 검색 엔터
let findPD = document.querySelector('#hd_searchText');
findPD.addEventListener('keyup',function(e){
    if (e.keyCode === 13) {
        let find =  $('#hd_findText').val();
        location.href = "/find/list?find="+find+"&cate=1000&order=time&cp=1";
    }
});*/
