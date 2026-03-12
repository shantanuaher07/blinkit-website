// ADD PRODUCT TO CART
function addToCart(name, price, image){

let cart = JSON.parse(localStorage.getItem("cart")) || [];

let product = {
name: name,
price: price,
image: image,
discount: 10
};

cart.push(product);

localStorage.setItem("cart", JSON.stringify(cart));

alert(name + " added to cart 🛒");

}


// LOAD CART PRODUCTS
function loadCart(){

let cartItems = JSON.parse(localStorage.getItem("cart")) || [];

let container = document.getElementById("cartItems");

let total = 0;

container.innerHTML = "";

cartItems.forEach(item => {

let finalPrice = item.price - (item.price * item.discount / 100);

total += finalPrice;

container.innerHTML += `
<div class="cart-card">

<img src="${item.image}">

<h3>${item.name}</h3>

<p>Price: ₹${item.price}</p>

<p>Discount: ${item.discount}%</p>

<p>Final Price: ₹${finalPrice}</p>

<button class="order-btn">Order Now 🚚</button>

</div>
`;

});

// TOTAL PRICE
document.getElementById("totalPrice").innerHTML =
"Total Amount: ₹" + total + " 💰";

}
<script>
function searchProduct() {
    let input = document.getElementById("searchInput").value.toLowerCase();
    let products = document.getElementsByClassName("product");

    for (let i = 0; i < products.length; i++) {
        let name = products[i].getElementsByTagName("h3")[0].innerText.toLowerCase();

        if (name.includes(input)) {
            products[i].style.display = "block";
        } else {
            products[i].style.display = "none";
        }
    }
}
</script>
