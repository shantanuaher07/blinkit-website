const express = require("express");
const mysql = require("mysql2");
const cors = require("cors");

const app = express();

app.use(cors());
app.use(express.json());
// Checkout route
app.post("/checkout", (req, res) => {
    const name = req.body.name;
    const phone = req.body.phone;
    const address = req.body.address;
    const city = req.body.city;
    const payment = req.body.payment;

    const sql = "INSERT INTO orders (name, phone, address, city, payment) VALUES (?,?,?,?,?)";

    db.query(sql, [name, phone, address, city, payment], (err, result) => {
        if(err){
            console.log(err);
            res.send("Error saving order");
        } else {
            console.log("Order saved successfully");
            res.send("Order placed successfully");
        }
    });
});

const db = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "RAJPUT1718",
  database: "blinkit"
});

db.connect((err)=>{
  if(err){
    console.log(err);
  }else{
    console.log("MySQL Connected");
  }
});


// ---------------- SIGNUP API ----------------

app.post("/signup",(req,res)=>{

const {email,password} = req.body;

db.query(
"INSERT INTO users (email,password) VALUES (?,?)",
[email,password],
(err,result)=>{

if(err){
console.log(err);
res.json({success:false});
}
else{
res.json({success:true});
}

});

});


// ---------------- LOGIN API ----------------

app.post("/login",(req,res)=>{

const {email,password} = req.body;

db.query(
"SELECT * FROM users WHERE email=? AND password=?",
[email,password],
(err,result)=>{

if(err){
console.log(err);
res.json({success:false});
}
else{

if(result.length>0){
res.json({success:true});
}
else{
res.json({success:false});
}

}

});

});


// ---------------- PLACE ORDER API ----------------

app.post("/place-order",(req,res)=>{

const {name,phone,address,city,payment} = req.body;

const sql = "INSERT INTO orders (name,phone,address,city,payment) VALUES (?,?,?,?,?)";

db.query(sql,[name,phone,address,city,payment],(err,result)=>{

if(err){
console.log(err);
res.send("Error saving order");
}
else{
res.send("Order Saved Successfully");
}

});

});


// ---------------- SERVER ----------------

app.listen(3000,()=>{
console.log("Server running on port 3000");
});