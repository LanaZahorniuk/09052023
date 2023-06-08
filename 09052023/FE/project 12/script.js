/* function makeFood(){
    console.log("нарезать овощи")
    console.log("сварить овощи")
    console.log("заправить овощи майонезом")
    console.log("перемешать овощи")    
}
makeFood()
makeFood()
*/
/*
    функция - это переиспользуемый блок кода.

    Function Declaration 
    function Name(параметр1, параметр2...) {
        тело функции - алгоритм действий функции
    }
    параметр - входные данные, с которыми работает функция


    Math.power(10, 2) - 10 - число, 2 - степень, в которую нужно возвести число
 */

/* function greeting(name) {
        const newName = name.toUpperCase()
        console.log("Hello," + newName)
    }
    greeting("Lana")
    greeting("Pavel") */

// Задача. Создать функцию, которая получает два числовых параметра и в консоли выводит
// а) сумму чисел
// б) разность
// в) произведение
// г) деление

/* function calc(num1, num2) {
        console.log(num1 + num2)
        console.log(num1 - num2)
        console.log(num1 * num2)
        console.log(num1 / num2)
    }
    calc(100, 200)
    calc(50, 5) */

// Задача. Создать функцию, которая получает два числа и в консоли выводит наибольшее из них
/* function number(num1, num2){
    if (num1 > num2) {
        console.log(num1);
      } else {
        console.log(num2);
      }
}
number(1,2) */


// Задача. Создать функцию, которая принимает число и выводит все числа от 0 до числа,
// которое принимаем в параметре
// fn(10) // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
/* function number(num) {
  for (let i = 0; i < num; i++) {
    console.log(i);
  }
}

number(40) */


// Задача. Создать функцию, которая принимает массив и отображает каждый элемент массива в консоли 
/* function showArrayElements(array) {
for(let i = 0; i < array.length; i++) {
    console.log(array[i])
}
}

showArrayElements(["Lana", "Zara"]),
showArrayElements([1, 3, 15, 48])
*/


/* function square(width, Length) {  // найти площадь
    console.log(width * Length)
    
}
square(5,5) */



/* function congrats(name) {
    console.log(`Hello, ${name}, Happy birthday!`)
}
congrats("Lana") // принять имя и подставить поздравления */


/* function number(num) {   // принять число и отобразить чётное оно или нечётное
    if(num % 2) 
    console.log("ne четное");
    else {
        console.log("четное");
      }

}
number(10) 

// oder

function number(num) {   // принять число и отобразить чётное оно или нечётное
    if(num % 2 == 0)
    console.log("четное");
    else {
        console.log("ne четное");
      }

}
number(5) 

*/

/* function printArray(number) {
    const arr = []
    for(let i = 0; i < number; i++) {
        arr.push(i)
    }
    console.log(arr)
}
printArray(10)
printArray(30)
*/

// запросить три имени и после вывести эти имена в верхнем регистре
/* function getNames() {
    const names = []
    for(let i = 0; i < 3; i++) {
        const name = prompt("введите имя")
        const upperCaseName = name.toUpperCase()
        names.push(upperCaseName)
    }
    console.log(names)
}
getNames() */





