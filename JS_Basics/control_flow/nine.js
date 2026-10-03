const myNums = [1,2,3,4,5,6,7,8,9,10]

// const myTotal = myNums.reduce(function (acc, currval) {
//     console.log(`acc: ${acc} and currval: ${currval}`);
//     return acc + currval
// },0)


const myTotal = myNums.reduce( (acc, currval) => acc + currval, 0)


// console.log(myTotal);

const shoppingCart = [
    {
        item: 'js course',
        price: 2999
    },
    {
        item: 'python course',
        price: 999
    },
    {
        item: 'mobile development course',
        price: 4999
    },
    {
        item: 'data science course',
        price: 7999
    }
]

const priceToPay = shoppingCart.reduce((acc, item) => acc + item.price, 0)
console.log(priceToPay);
