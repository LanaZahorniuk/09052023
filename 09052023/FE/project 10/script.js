/* const names = ["Lana", "Taras", "Marichka"]
console.log(names[1]) */

/* const numbers = [10, 15, 0, 100, 21]
console.log(numbers[2]) */

// const arr = ["Hello", 100, true, ["Hello", "Hello World"]] //в массиве могут храниться разные типы данных

/* const countries = ["Germany", "France", "UK"]
console.log(countries.length) //length длина массива или количество элементов

countries.push("Spain") //push позволяет добавить значение в конец массива
console.log(countries.length) 

countries[countries.length - 1]

*/

/* const names = ["Lana", "Taras", "Marichka"]
const username = prompt("ввeдите имя")
names.push(username)
console.log(names) */

/* const names = ["Lana", "Taras", "Marichka"]
const username1 = prompt("ввeдите имя")
const username2 = prompt("ввeдите имя")
names.push(username1, username2)
console.log(names) */

/* 

for(let i = 0; i < 10; i++) {
    console.log("Hello")
}


цикл for
for(инициалтзация; условие; шаг) {
    тело цикла
}

let i = 0; это инициалтзация, повторение (итирация), т е создвание счетчика
i < 10; условие что цикл должен быть 10 раз повториться
i++ шаг увеличение пересенной на 1

*/

/* for(let i = 0; i < 50; i++) {
    console.log("Hello world")
} */

// for(let i = 1; i <= 100; i++) {
/* for(let i = 0; i < 100; i++) {
    console.log(i + 1)
} */

/* for(let i = 0; i < 100; i++) {
    if(i % 2 == 0)
    console.log(i)
} //отобразит четные числа */

/* const names = ["Lana", "Taras", "Marichka"]
for(let i = 0; i < names.length; i++) {
    console.log(names[i])
} */

/* console.log(names[0])
console.log(names[1])
console.log(names[2]) */

/* const numbers  = [10, 20, 5, 11, 6, 4]
for(let i = 0; i < numbers.length; i++) {
    console.log(numbers[i] ** 2)
} // вывести квадрат чисел */

/* const countries = ["Germany", "France", "UK", "Spain"]
for(let i = 0; i < countries.length; i++){
console.log(countries[i].toUpperCase()) 
} // вывести все в верхнем регистре

// oder

const countries = ["Germany", "France", "UK", "Spain"]
for(let i = 0; i < countries.length; i++){
    const upperCaseCountry = countries[i].toUpperCase()
console.log(upperCaseCountry) 
}

*/

/* const countries = ["Germany", "France", "UK", "Spain"];
const countrieUpperCase = []
for (let i = 0; i < countries.length; i++) {
  const upperCaseCountry = countries[i].toUpperCase();
  console.log(countries[i].toUpperCase());
  countrieUpperCase.push(upperCaseCountry)
}  // Если хотим заполнить другой массив странами в верхнем регистре */
