/* const header = document.querySelector("header")
const title = document.createElement("h1")
title.innerText = "My title"
header.appendChild(title) */


/*
    innerText - свойстсво текста внутри тега

    Алгоритм создания элемента
        1. Находим элемент, в который хотим положить созданный тег. querySelector()
        2. Создаем тег. createElement()
        3. Добавляем текст. innerText
        4. Добавляем созданный тег в найденный в п1 тег. appendChild()
*/


/* const mein = document.querySelector("mein")
console.log(mein.innerHTML) 
const header = document.querySelector("header")
header.innerHTML = "<h1>My title</h1>"*/

// Задача. Создать цикл, который позволяет добавить 10 тегов p 
// с тектом HELLO внутрь section
/*const section = document.querySelector("section")
//section.innerHTML = "<p>Hello</p>" // вручную
section.innerHTML += "<p>Hello!</p>"
section.innerHTML += "<p>Hello!</p>"
section.innerHTML += "<p>Hello!</p>"
for(let i = 0; i < 10; i++) {
section.innerHTML += "<p>Hello</p>"
} */
/*  
   1.  Свойство innerText позволяет считывать или задавать текстовое содержимое элемента. 
    При считывании текста с элемента будет возвращена строка с текстовым содержимым всех вложенных дочерних элементов. 

    2. Свойство innerHTML позволяет считать содержимое элемента в виде HTML-строки или установить новый HTML.
    */

// Зачада. Есть массив имен names. Для каждого имени создать тег p и добавить его в section
/* const names = ["Arsen", "Yuliya", "Lana", "Maria"]
const section = document.querySelector("section")
// section.innerHTML += `<p>${names[0]}</p>`
// section.innerHTML += `<p>${names[1]}</p>`
for(let i = 0; i < 4; i++) {
section.innerHTML += `<p class="text">${names[i]}</p>` //создали класс и в css подключили стили
} */
/*
    names.length = 4
    1. let i = 0;  0 < 4 - true, section.innerHTML += `<p> Arsen </p>`, i++
    2. i = 1, 1 < 4 - true, section.innerHTML += `<p> Yuliya </p>`, i++
    3. i = 2, 2 < 4 - true, section.innerHTML += `<p> Lana </p>`, i++
    4. i = 3, 3 < 4 - true, section.innerHTML += `<p> Maria </p>`, i++
*/
// Задача. Есть массив объектов prodcuts. Для каждого продукта 
//создать разметку

/*
    <div class="product">
        <h5>Назввание продукта</h5>
        <p>Цена продукта</p>
    </div>
*/
const products = [
    {
        name: "Iphone 13",
        price: 10000

    },
    {
        name: "Iphone 14",
        price: 20000

    },
    {
        name: "Iphone 15",
        price: 25000

    },
]
const section = document.querySelector("section")
for(let i = 0; i < products.length; i++) {
    section.innerHTML += `<div class="product"><h5>${products[i].name}</h5><p>${products[i].price}</p></div>`
    }
// Добавить в разметку <h1></h1>, в котором должна быть общая стоимость 
//всех продуктов
// 1. с помощью цикла for посчитать сумму всех продуктов
// 2. добавить h1 в конец section, в котором указать цену

let sum = 0;
for(let i = 0; i < products.length; i++) {
    sum += products[i].price;
    }
section.innerHTML += `<h1>Общая сумма ${sum}</h1>`