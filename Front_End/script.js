let cart = JSON.parse(localStorage.getItem("cart")) || [];

function addToCart(name, price, image){

let product = {
name:name,
price:price,
image:image
};

cart.push(product);

localStorage.setItem("cart", JSON.stringify(cart));

alert(name + " added to cart");
}

function loadCart(){

let cartItems = JSON.parse(localStorage.getItem("cart")) || [];

let container = document.getElementById("cartItems");

cartItems.forEach(item => {

container.innerHTML += `
<div class="cart-card">
<img src="${item.image}">
<h3>${item.name}</h3>
<p>₹${item.price}</p>
</div>
`;

});
}