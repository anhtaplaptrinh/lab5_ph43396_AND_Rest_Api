const mongoose = require('mongoose')
const express = require('express')
const app = express();
const port = 3000

const distributor = require('./Distributor')
const api = require('./api')

app.listen(port, () => {  console.log(`Server đang chạy ở cổng ${port}`)})

const uri = 'mongodb+srv://anhttph43396:zHNUJf43ZhRhrUg6@lab3-anhttph43396.9jz7xzv.mongodb.net/lab5';
app.use(express.json());
app.use('/api', api)

app.get('/', async (req, res) => {
    await mongoose.connect(uri)
    let dis = await distributor.find()

    res.send(dis)
})




