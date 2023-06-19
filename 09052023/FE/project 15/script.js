// Задача. при клике на кнопку btn, в консоли отобразить "приветствую!"
// const btn = document.querySelector(".btn")
// btn.add

/* const btn = document.querySelector(".btn")

btn.addEventListener("click", function(){ //тут вызывает функцию клик по кнопке
    console.log("приветствую!")
}) */

/* function sum() {   // тут мы сами вызываем функцию 
    console.log("ваша сумма")
}
sum() */

/*
    addEventListener - метод, который позволяет вызвать функцию по происшествии какого-либо события

    addEventListener(type, cb) - принимает два аргумента
    type - тип события - click, scroll, submit, change, input
    cb - callback function - функция обратного вызова, функцию вызываем не мы, а какая-то другая функция
*/

// Задача. При нажатии на кпноку btn увеличивать значение в p.text на 1

/*
    1. Создаем переменную для хранения текущего значения числа
    2. При клике увеличиваем переменную на 1
        2.1. Повесить слушатель события на кнопку
        2.2. Вызывать cb функцию, которая увеличивает переменную на 1
    3. меняем текст в теге p на значение переменной
 */
/*  const btn = document.querySelector(".btn")
    const text = document.querySelector(".text")
let num = 0
btn.addEventListener("click", function(){ 
    num++
    text.innerText = num
})

const btnMinus = document.querySelector(".btn-minus")
btnMinus.addEventListener("click", function(){ 
    num--
    text.innerText = num
}) */

/* const btn = document.querySelector(".btn")
const text = document.querySelector(".text")
const btnMinus = document.querySelector(".btn-minus")
let num = 0

btn.addEventListener("click", function(){ 
num++
text.innerText = num
})

btnMinus.addEventListener("click", function(){ 
    if(num > 0) {  // в этом случае меньше 0 не может быть
        num--
        text.innerText = num
    }

}) */

// Задача. При нажатии на кнопку менять цвет фона body на соответствующий

/* const redBtn = document.querySelector(".red-btn")

redBtn.addEventListener("click", function() {
    //console.log("hello")
    document.body.style.backgroundColor = "red"
// менять цвет текста внутри нажатой кнопки на черный
redBtn.style.color = "black"
}) */

/*
    querySelector("body")

    document.body - обращение к тегу body 

    main = {
        innerText: "Текстовое содержимое",
        innerHTML: "<h1>Текстовое содержимое</h1>",
        style: {
            backgroundColor: ""
        }
    }
    main.style.backgroundColor = "red"
*/

// ДЗ. При нажатии на каждую из кнопок менять цвет фона body на соответвующий
// При нажатии на кнопку img-btn менять фон body на картинку.

/* const buttons = document.querySelectorAll("button")
// console.log(buttons)
for(let i = 0; i < buttons.length; i++){
    buttons[i].addEventListener("click", function() {
        if(buttons[i].id == "img") {
            document.body.style.background = "url(./lila.jpg)"
        } else {
            const color = buttons[i].id
            document.body.style.background = color
        }      
    })
}*/

// Есть массив names, нужно отобразить каждый элемент массива в консоли
const names = ["Lana", "Ivan", "Taras", "Marichka"];
for (let i = 0; i < names.length; i++) {
  console.log(names[i]);
}

/*
    .forEach() - еще один способ выполнить операцию для каждого элемента массива, но
        без явного описания цикла, как было в for
    позволяет применить коллбек-функцию ко всем элементам массива.
    
    forEach(item, index, arr) принимает три аргумента
        1. item - каждый элемент массива, текущий элемент; (array[i]) - каждый элемент массива в for
        2. index -  индекс текущего элемента
        3. arr - сам массив, над которым выполняем действия
*/

names.forEach(function (name) {
  console.log(name);
});

// Есть массив чисел numbers. FOREACH
const numbers = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100];
// вывести в консоли
// а) вывести числа больше 60
// б) квадрат каждого числа
numbers.forEach(function (number) {
  if (number > 60) {
    //console.log(number) }
    console.log(number ** 2);
  }
});


//  менять цвет кнопок через forEach

const buttons = document.querySelectorAll("button");
buttons.forEach(function (btn) {
  btn.addEventListener("click", function () {
    if (btn.id == "img") {
      document.body.style.background = "url(./lila.jpg)";
    } else {
      const color = btn.id;
      document.body.style.background = color;
    }
  });
});
