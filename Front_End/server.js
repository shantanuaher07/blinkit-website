const express = require("express");
const mysql = require("mysql2");

const app = express();

const db = mysql.createConnection({
    host: "localhost",
    user: "root",
    password: "",
    database: "blinkit"
});

db.connect((err) => {
    if (err) {
        console.log("Database connection failed");
    } else {
        console.log("MySQL Connected");
    }
});

app.listen(3000, () => {
    console.log("Server running on port 3000");
});