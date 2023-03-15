let brandAPI = "http://localhost:8081/apiBrand";
$(document).ready(function () { //thực hiện các mã js khi trang Mô hình đối tượng tài liệu (DOM) đã sẵn sàng
    loadData()  //gọi hàm loadData() ra để thực thi
});
function loadData(){
    $.ajax({
        url:brandAPI,
        type:'GET',
        dataType:'JSON'
    })
        .done((responseData)=>{
            console.log(responseData);
            $("#dataBrand").html(responseData.map( item => {
                return`
                    
                         <tr>
                            <th scope="row">${item.id}</th>
                            <td>${item.brand_name}</td>
                         </tr>
                    `
            }))
        })
}
function showFormAdd(){
    $("#custom").html(
        `
            <form id="myForm" >
                 <div class="mb-3">
                     <label for="exampleInputName" class="form-label">Brand Name</label>
                     <input type="text" id="brand_name" th:name="brand_name" class="form-control" id="exampleInputName" >
                 </div>
                 <button
					        type="button"
					            class="btn btn-primary"
				                     onclick="addBrand()">
				        ADD new Brand                                   
				        </button>
            </form>
        `
    )
}

function  addBrand(){
    let brand_name = $('#brand_name').val();
    console.log(brand_name);

    $.ajax({
        url: "http://localhost:8081/apiBrand",
        headers:{'Content-Type':  'application/x-www-form-urlencoded;charset=UTF-8'},
        type: "post",
        dataType: "json",
        data:{brand_name:brand_name}
    })
        .done(()=>{
            console.log("SUCCESS");
        })
        .fail(()=>{
            console.log("ERROR");
        })

}