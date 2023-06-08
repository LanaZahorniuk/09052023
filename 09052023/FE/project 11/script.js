/* const array = ["Hello", "Hello world", 10, true]
console.log(array)

const obj = {
    // key: value
}


const user = { // user это объект
    email: "test@gmail.com",
    name: "Lana",
    age: 25,
    hobbies: ["football", "design"],
    info: { // info это свойство
        descr: "Lorem ipsum dolor sit amet"
    } // свойство descr внутри свойства info
}
console.log(user)
console.log(user.name)
console.log(user.hobbies[0]) //сначала oбращаемся к объекту а потом к массиву
*/

/* const produkt = {
  price: 10,
  name: "samsung",
};
console.log(produkt.price);

const produkt2 = {
    price: 15,
    name: "nokia",
  };
  console.log(produkt.price);
*/

/*  const produkts = [
    {
        price: 10,
        name: "samsung",
      },
      {
        price: 15,
        name: "nokia",
      }
  ]

  console.log(produkts[1].name) // вывести название вторго продукта 
  for(let i = 0; i < produkts.length; i++) {
    console.log(produkts[i].name)
  }

  let sum = 0 // вывести сумму стоимости всех продуктов
  for(let i = 0; i < produkts.length; i++) {
    // console.log(produkts[i].price)
    sum = sum + produkts[i].price
    // sum += produkts[i].price - это одно и тоже
  }
  console.log(sum)
*/

/* const users = [
  {
    name: "Lana",
    email: "lana@gmail.com",
    login: "LanaLana",
    age: 33,
  },
  {
    name: "Stepan",
    email: "stepan@gmail.com",
    login: "Stepan777",
    age: 41,
  },
  {
    name: "Taras",
    email: "taras@gmail.com",
    login: "Taras_Star",
    age: 15,
  },
]; */

/* for(let i = 0; i < users.length; i++) {
    // console.log(users[i].name)
    // console.log(`Your email - ${users[i].email}, and your login - ${users[i].login}`)
if(users[i].age > 18) { // вывести логины тех кому больше 18
    console.log(users[i].login)
}
} */
/* const valedatedUsers = []; // дозаписать сюда тех, кому больше 18
for (let i = 0; i < users.length; i++) {
  if (users[i].age > 18) {
    valedatedUsers.push(users[i].login);
  }
}
console.log(valedatedUsers); */


const products = [
  {
    name: "Aser",
    category: "Laptop"
  },
  {
    name: "Samsung",
    category: "TV"
  },
  {
    name: "Iphone",
    category: "phone"
  },
  {
    name: "Panasonuc",
    category: "TV"
  }
]
for(let i = 0; i < products.length; i++) {
if(products[i].category == "TV") { //отобразить позиции с TV
  console.log(products[i].name)
}
  }

  /*
    length = 4
    1. let i = 0, 0 < 4 - true, products[0].category == TV - false, i++
    2. i = 1, 1 < 4 - true, products[1].category == TV - true, console.log("Samsung"), i++
    3. i = 2, 2 < 4 - true, products[2].category == TV - false, i++,
    4. i = 3, 3 < 4 - true, products[3].category == TV - true, console.log("Panasonic"), i++
    5. i = 4, 4 < 4 - false, ВЫХОД из цикла
*/