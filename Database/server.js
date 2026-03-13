const express = require("express")
const mysql = require("mysql2")
const cors = require("cors")

const app = express()

app.use(cors())
app.use(express.json())

const db = mysql.createConnection({
host:"localhost",
user:"root",
password:"",
database:"blinkit"
})

db.connect(err=>{
if(err) console.log(err)
else console.log("MySQL Connected")
})


// SIGNUP API
app.post("/signup",(req,res)=>{

const {email,password}=req.body

db.query(
"INSERT INTO users (email,password) VALUES (?,?)",
[email,password],
(err,result)=>{

if(err){
res.json({success:false})
}
else{
res.json({success:true})
}

})

})


// LOGIN API
app.post("/login",(req,res)=>{

const {email,password}=req.body

db.query(
"SELECT * FROM users WHERE email=? AND password=?",
[email,password],
(err,result)=>{

if(result.length>0){
res.json({success:true})
}
else{
res.json({success:false})
}

})

})

app.listen(3000,()=>{
console.log("Server running on port 3000")
})