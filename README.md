# JaywantMhala_Nimap_Assignment




### 🚀 Category Endpoints


| HTTP Method                                         | Route Path                                   | Parameters  | Description              |
|----------------------------------------------------|---------------------------------------------|-------------|--------------------------|
| <img alt="Static Badge" src="https://img.shields.io/badge/post-green?style=for-the-badge">   | `http://localhost:8082/api/categories`      | -           | Create new category      |
| <img alt="Static Badge" src="https://img.shields.io/badge/put-yellow?style=for-the-badge">   | `http://localhost:8082/api/categories/{id}` | categoryId  | Update existing category |
| <img alt="Static Badge" src="https://img.shields.io/badge/delete-red?style=for-the-badge">  | `http://localhost:8082/api/categories/{id}` | categoryId  | Delete existing category |
| <img alt="Static Badge" src="https://img.shields.io/badge/get-blue?style=for-the-badge">    | `http://localhost:8082/api/categories?page=1`      | -           | Get all categories       |
| <img alt="Static Badge" src="https://img.shields.io/badge/get-blue?style=for-the-badge">    | `http://localhost:8082/api/categories/{id}` | categoryId  | Get category by id       |


### 🚀 Product Endpoints


| HTTP Method                                         | Route Path                                   | Parameters  | Description              |
|----------------------------------------------------|---------------------------------------------|-------------|--------------------------|
| <img alt="Static Badge" src="https://img.shields.io/badge/post-green?style=for-the-badge">   | `http://localhost:8082/api/products`      | -           | Create new product      |
| <img alt="Static Badge" src="https://img.shields.io/badge/put-yellow?style=for-the-badge">   | `http://localhost:8082/api/products/{id}` | categoryId  | Update existing product |
| <img alt="Static Badge" src="https://img.shields.io/badge/delete-red?style=for-the-badge">  | `http://localhost:8082/api/products/{id}` | categoryId  | Delete existing product |
| <img alt="Static Badge" src="https://img.shields.io/badge/get-blue?style=for-the-badge">    | `http://localhost:8082/api/products?page=1`      | -           | Get all product       |
| <img alt="Static Badge" src="https://img.shields.io/badge/get-blue?style=for-the-badge">    | `http://localhost:8082/api/products/{id}` | categoryId  | Get product by id       |


 ### 🚀 Some important Endpoint 

### for Creating product
{
    
    "productName": "xxx xxx",
    "price": xx,
    "image": "xxxxx.xxx",
    "description": "xxxxxxx",
    "categoryId":102                                  // enter existing categoryId


}



### for display single product details with respective category details
{

    "productId": 102
    "productName": "Hp 15s",
    "price": 60000,
    "image": "laptop.jsp",
    "description": "best high performance laptop",
    "categoryId":103                                  //  category Id
    "categoryName: "Electron Devices"                 //category Name


}


