/* const title = document.querySelector("h1")
console.log(title.innerText)
title.innerText = "hello Lana"


const descr = document.querySelector(".descr")
console.log(descr)

const title1 = document.querySelector(".footer")
console.log(title1.innerText)
title1.innerText = "hello"

const title2 = document.querySelector("h2")
console.log(title2.innerText)
title2.innerText = "TITLE"

const googleLink = document.querySelector("main a")
console.log(googleLink.innerText)
googleLink.innerText = "Facebook" */


// DOM и навигация по html

/*
    числа
    строки
    буль
    объекты (массивы) - 
        let user = {
            name: "Arsen"
        }

    main = {
        className: "main"
        innerHTML: "<h1></h1>"
        style: {
            backgroundColor: "red"
        }
    }
*/

/* querySelector() - поиск первого элемента по селектору
    querySelectorAll() - поиск всех элементов по селектору

        функция

        function greeting() {
            console.log("Hello")
        }

        метод 

        let user = {
            key: value,
            greeting: function() {
                console.log("hello")
            }
        } */


       /*  innerText - свойство получить или назначить текст внутри тега
    title = {
        innerText: "Hello World" */
    

/* const title = document.querySelector("h1")
title.innerText += " это мой первый заголовок"

const texts = document.querySelectorAll("p")
console.log(texts)

const array = [10, 20, 30]
console.log(array) */


// const texts = document.querySelectorAll("p")
/* texts[0].innerText = "привет как дела"
texts[1].innerText = "привет как дела"
texts[2].innerText = "привет как дела" */

/* for(let i = 0; i < texts.length; i++) {
    //console.log(texts[i])
    texts[i].innerText = "привет как дела"
  } */


  // Изменить название с Google на Facebook и также изменить переход по ссылке с Гугла на Facebook
/* const googleLink = document.querySelector("main a")
googleLink.innerText = "Facebook"
const href = googleLink.setAttribute("href", "https://www.facebook.com/")
// const href = googleLink.getAttribute("href") // отобразить
// console.log(href);

/* getAttribute(attr) - метод, для получения значение атрибута тега
        attr - название атрибута, значение которого мы хотим получить
    setAttribute(attr, value) - метод, для назначения атрибута
        attr - название атрибута, значение которого мы хотим изменить
        value - значение, на которое хотим поменять */


// Задача. Поменять у всех ссылок текст на Instagram
// Ссылку у всех тегов поменять на https://instagram.com

       /* const texts = document.querySelectorAll("a")
        for(let i = 0; i < texts.length; i++) {
            //console.log(texts[i])
            texts[i].innerText = "instagram"
            texts[i].setAttribute("href", "https://www.instagram.com/")
          } */


