const mongoose = require('mongoose')
const Scheme = mongoose.Schema;

const Distributors = new Scheme({
    name: {type: String}
})

const distributor = mongoose.model('thanhpho', Distributors)

module.exports = distributor;