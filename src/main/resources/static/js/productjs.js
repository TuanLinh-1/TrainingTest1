// const  express = require('express')
// const app =  express();

// app.use(function (req, res, next) {

//     res.header('Access-Control-Allow-Origin', "http://localhost:4200");
//     res.header('Access-Control-Allow-Headers', true);
//     res.header('Access-Control-Allow-Credentials', 'Content-Type');
//     res.header('Access-Control-Allow-Methods', 'GET, POST, OPTIONS, PUT, PATCH, DELETE');
//     next();
//   });
let productAPI = "http://localhost:8081/apiProduct";
let brandAPI="http://localhost:8081/apiBrand";
$(document).ready(function () { //thực hiện các mã js khi trang Mô hình đối tượng tài liệu (DOM) đã sẵn sàng
    loadData()  //gọi hàm loadData() ra để thực thi
});
function loadData() {
    $.ajax({
        url: productAPI,
        type: 'GET',
        dataType: 'JSON'
    })
        .done((responseData) => {
            console.log(responseData);
            $("#dataProduct").html(responseData.map(function (item) {
                return `
                <tr>                
			        <td>${item.produce_name}</td>
			        <td>${item.brand_name}</td>
                    <td>${item.subcate_name}</td>
                    <td>${item.origin_price}</td>
                    <td>${item.status_name}</td>
			        <td>
				        <button
					        type="button"
					            class="btn btn-primary"
				                     onclick="productDetail(${item.id})">
                            <i class="fa fa-eye" aria-hidden="true"></i>
				        </button>
			
				        <button
					        type="button"
					            class="btn btn-danger"
					                data-toggle="modal"
				                        onclick="showFromProductUpdate(${item.id})">
				            <i class="fa fa-pencil" aria-hidden="true"></i>               
				            
     				     </button>
     				    
			        </td>
                 </tr>
                 
                `
            }))
        })
}
function productDetail(pro_id) {
    let productByIdAPI = `http://localhost:8081/apiProduct/${pro_id}`
    $.ajax({
        url: productByIdAPI,
        type: 'GET',
        dataType: 'JSON'
    })
        .done((responseData) => {
            console.log(responseData);
            $('#custom-table').html(
                `            
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Name</label>
                <input type="text" value="${responseData.produce_name}" class="form-control" id="exampleInputName" disabled>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Color</label>
                <input type="text"  value="${responseData.color}" class="form-control" id="exampleInputName" disabled>
            </div>
        
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Quantity</label>
                <input type="text"  value="${responseData.quantity}" class="form-control" id="exampleInputName" disabled>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Sell Price</label>
                <input type="text"  value="${responseData.sell_price}" class="form-control" id="exampleInputName" disabled>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Original Price</label>
                <input type="text"  value="${responseData.origin_price}" class="form-control" id="exampleInputName" disabled>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Description</label>
                <textarea cols="20" rows="5" disabled  value=""   class="form-control" id="IpDescription">${responseData.description}</textarea>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Brand Name</label>
                <input type="text"  value="${responseData.brand_name}" class="form-control" id="exampleInputName" disabled>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Sub Category</label>
                <input type="text"  value="${responseData.subcate_name}" class="form-control" id="exampleInputName" disabled>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Status</label>
                <input type="text"  value="${responseData.status_name}" class="form-control" id="exampleInputName" disabled>
            </div>
            <button
					        type="button"
					            class="btn btn-primary"
				                     onclick="x()">
                            Close 
				        </button>
            
            `
            )
        })
}
function showFromProductUpdate(pro_id){
    alert("da an")
    $.ajax({
        url:`http://localhost:8081/apiProduct/${pro_id}`,
        type:'GET',
        dataType: 'JSON'
    })
        .done(response =>{
            $('#custom').html(
                `
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Product ID:</label>
        <input type="number" value="${response.id}" class="form-control" id="IpId">
    </div>
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Name:</label>
        <input type="text"  value="${response.produce_name}" class="form-control" id="IpName">
    </div>
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Color:</label>
        <input type="text"  value="${response.color}" class="form-control" id="IpColor">
    </div>

    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Quantity</label>
        <input type="number"  value="${response.quantity}" class="form-control" id="IpQuantity">
    </div>
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Sell Price</label>
        <input type="number"  value="${response.sell_price}" class="form-control" id="IpSellPrice">
    </div>
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Original Price</label>
        <input type="number"  value="${response.origin_price}" class="form-control" id="IpOriginalPrice">
    </div>
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Description</label>
        <textarea cols="20" rows="5"  class="form-control" id="IpDescription">${response.description}</textarea>
    </div>
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Brand Name</label>
        <select class="form-select" aria-label="Default select example" id="roleTypeBrand" name="roleType"
            onclick="loadRoleTypesBrand();">
            <option value="${response.brand_id}">${response.brand_name}</option>
        </select>
    </div>
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Sub Category</label>
        <select class="form-select"  aria-label="Default select example" id="roleTypeSubCategory"
            name="roleTypeSubCategory" onclick="loadRoleTypesSubCategory();">
            <option value="${response.subcate_id}">${response.subcate_name}</option>
        </select>
    </div>
    <div class="mb-3">
        <label for="exampleInputName" class="form-label">Status</label>
        <select class="form-select" aria-label="Default select example" id="roleTypeStatus" name="roleTypeStatus"
            onclick="loadRoleTypesStatus();">
            <option value="${response.status_id}">${response.status_name}</option>
        </select>
    </div>
    <button type="button" class="btn btn-primary" onclick="updateProduct()">
        Update Product
    </button>

        `
            )
        })
}
// Function close
function x (){
    loadData();
    $('#custom-table').html(
        `
            <thead>
        <tr>
            <td>Product Name</td>
            <td>Brand Name</td>
            <td>Sub Category</td>
            <td>Price</td>
            <td>Status</td>
            <td>Program</td>
        </tr>
            </thead>
        <tbody id="dataProduct">

        </tbody>

        `
    )
}
function  showFormAddProduct(){
    $.ajax({
        url:brandAPI,
        type:'GET',
        dataType:'JSON'
    })
        .done(responseBrandData=>{
            console.log(responseBrandData);
            $('#custom').html(
                `
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Name</label>
                <input type="text"  class="form-control" id="IpName" >
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Color</label>
                <input type="text"   class="form-control" id="IpColor" >
            </div>
        
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Quantity</label>
                <input type="number"   class="form-control" id="IpQuantity" >
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Sell Price</label>
                <input type="number"   class="form-control" id="IpSellPrice" >
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Original Price</label>
                <input type="number"   class="form-control" id="IpOriginalPrice" >
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Description</label>
                <textarea cols="20" rows="5"  class="form-control" id="IpDescription"></textarea>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Brand Name</label>
                 <select class="form-select" aria-label="Default select example" id="roleTypeBrand" name="roleType" onclick="loadRoleTypesBrand();">
                    <option>Select</option>
                 </select>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Sub Category</label>
                <select class="form-select" aria-label="Default select example" id="roleTypeSubCategory" name="roleTypeSubCategory" onclick="loadRoleTypesSubCategory();">
                    <option>Select</option>
                 </select>
            </div>
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Status</label>
                <select class="form-select" aria-label="Default select example" id="roleTypeStatus" name="roleTypeStatus" onclick="loadRoleTypesStatus();">
                    <option>Select</option>
                 </select>
            </div>
            <button
					        type="button"
					            class="btn btn-primary"
				                     onclick="addProduct()">
                            Add Product 
				        </button>

        `
            )
        })

}
//Load Data Brand to combobox
function loadRoleTypesBrand() {
    {
        if ($('#roleTypeBrand').find("option").length == 1) {  //Check condition here
            $('#roleTypeBrand').empty().append('');
            $.ajax({
                url: 'http://localhost:8081/apiBrand',
                dataType: 'json',
                type: 'GEt',
            })
                .done((response)=>{
                        response.map(item => {

                            $('#roleTypeBrand').append($('<option>').text(item.brand_name).attr('value', item.id));
                        })

                })
        }

    }
}
//Load Data SubCategory to combobox
function loadRoleTypesSubCategory() {
    {
        if ($('#roleTypeSubCategory').find("option").length == 1) {  //Check condition here
            $('#roleTypeSubCategory').empty().append('');
            $.ajax({
                url: 'http://localhost:8081/SubCategoryAPI',
                dataType: 'json',
                type: 'GEt',

                success: function (response) {

                    response.map(item => {
                        $('#roleTypeSubCategory').append($('<option>').text(item.sub_cate_name).attr('value', item.id));
                    })
                },
                error: function (x, e) {

                }

            });
        }
        // }
    }
}
//Load Data Status to combobox
function loadRoleTypesStatus() {
    {
        if ($('#roleTypeStatus').find("option").length == 1) {  //Check condition here
            $('#roleTypeStatus').empty().append('');
            $.ajax({
                url: 'http://localhost:8081/StatusAPI',
                dataType: 'json',
                type: 'GEt',

                success: function (response) {

                    response.map(item => {
                        $('#roleTypeStatus').append($('<option>').text(item.status_name).attr('value', item.id));
                    })
                },
                error: function (x, e) {

                }

            });
        }
        // }
    }
}

function addProduct(){
    alert('đã ấn');
    var produce_name =$('#IpName').val();
    var color =$('#IpColor').val();
    var quantity =$('#IpQuantity').val();
    var sell_price =$('#IpSellPrice').val();
    var origin_price =$('#IpOriginalPrice').val();
    var description =$('#IpDescription').val();
    var brand_id =$('#roleTypeBrand').val();
    var status_id =$('#roleTypeStatus').val();
    var subcate_id =$('#roleTypeSubCategory').val();

    // console.log(produce_name);
    // console.log(color);
    // console.log(quantity);
    // console.log(sell_price);
    // console.log(origin_price);
    // console.log(description);
    // console.log(brand_id);
    // console.log(status_id);
    // console.log(subcate_id);

    $.ajax({
        url:"http://localhost:8081/apiProduct",
        type:'Post',
        data:{produce_name:produce_name,color:color,quantity:quantity,sell_price:sell_price,
            origin_price:origin_price,description:description,brand_id:brand_id,status_id:status_id,subcate_id:subcate_id}
    })

}
function updateProduct(){
    var id = $('#IpId').val();
    var produce_name =$('#IpName').val();
    var color =$('#IpColor').val();
    var quantity =$('#IpQuantity').val();
    var sell_price =$('#IpSellPrice').val();
    var origin_price =$('#IpOriginalPrice').val();
    var description =$('#IpDescription').val();
    var brand_id =$('#roleTypeBrand').val();
    var status_id =$('#roleTypeStatus').val();
    var subcate_id =$('#roleTypeSubCategory').val();

    // console.log(id);
    // console.log(produce_name);
    // console.log(color);
    // console.log(quantity);
    // console.log(sell_price);
    // console.log(origin_price);
    // console.log(description);
    // console.log(brand_id);
    // console.log(status_id);
    // console.log(subcate_id);
    $.ajax({
        url:"http://localhost:8081/apiProduct",
        type:"PUT",
        data:{id:id,produce_name:produce_name,color:color,quantity:quantity,sell_price:sell_price,
                origin_price:origin_price,description:description,brand_id:brand_id,status_id:status_id,subcate_id:subcate_id}
    }).done(alert('Update Successed'))

}
