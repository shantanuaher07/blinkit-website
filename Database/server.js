const express = require("express");
const mysql = require("mysql2");

const app = express();

const db = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "RAJPUT1718",
  database: "blinkit"
});

db.connect((err) => {
  if (err) {
    console.log(err);
  } else {
    console.log("MySQL Connected");
  }
});

app.get("/", (req, res) => {
  res.send("Blinkit server running");
});

app.listen(3000, () => {
  console.log("Server running on port 3000");
});
app.get("/addproduct", (req, res) => {

  const sql = "INSERT INTO products (name, price, category) VALUES ('Milk', 50, 'Dairy')";

  db.query(sql, (err, result) => {
    if (err) {
      console.log(err);
    } else {
      res.send("Product inserted successfully");
    }
  });

});
app.get("/products", (req, res) => {

  db.query("SELECT * FROM products", (err, result) => {
    if (err) {
      console.log(err);
    } else { addEventListener
      res.json(result);
    }
  });

});