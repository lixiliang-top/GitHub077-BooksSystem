$(document).ready(function () {
    cha();
    $(".shou").click(function () {
        pageIndex = data.firstPage;
        cha()
    })
    $(".shang").click(function () {
        pageIndex = data.prePage;
        cha()
    })
    $(".xia").click(function () {
        pageIndex = data.nextPage;
        cha()
    })
    $(".wei").click(function () {
        pageIndex = data.lastPage;
        cha()
    })
    $(".chaxun").click(function () {
        cha();
    });
})

var pageIndex = 1;
var pageSize = 2;
var data;
var feilei;
var leixing;
function cha() {
    $(".table-fenye tr:gt(0)").remove();
    var fenlei2 = $(".fenlei").val();
    var mingcheng = $(".mingcheng").val();
    var jieyue = $(".jieyue").val();
    var json = {
        pageSize: pageSize,
        pageIndex: pageIndex,
        booktype : fenlei2,
        bookname : mingcheng,
        isborrow : jieyue
    }
    console.log(json);
    $.post("/doMain", json, function (resoult) {
        data = resoult.data;
        console.log(resoult.data)
        $(".ye").text(resoult.data.pageNum + "/" + resoult.data.pages);
        $(".zong").text(resoult.data.total);
        $.each(resoult.data.list, function (i, v) {
            console.log(v)
            if(v.booktype==1){
                feilei = "小说";
            }
            if(v.booktype==2){
                feilei = "文学";
            }
            if(v.booktype==3){
                feilei = "传记";
            }
            if(v.booktype==4){
                feilei = "艺术";
            }
            if(v.booktype==5){
                feilei = "少儿";
            }
            if(v.booktype==6){
                feilei = "经济";
            }
            if(v.booktype==7){
                feilei = "管理";
            }
            if(v.booktype==8){
                feilei = "科技";
            }

            if(v.isborrow==0){
                leixing = "未借阅";
            }
            if(v.isborrow==1){
                leixing = "已借阅";
            }
            var $tr = $("<tr class='tia' align='center'><td>" + v.bookcode + "</td><td>" + feilei + "</td><td>" + v.bookname + "</td><td>" + v.bookatuthor + "</td><td>" + v.publishpress + "</td><td>" + leixing + "</td></tr>");
            console.log($tr)
            $(".table-fenye").append($tr);
        })
    }, "json");
}