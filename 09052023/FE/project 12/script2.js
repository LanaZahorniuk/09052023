/* let players = [
  {
    name: "Zevs",
    health: 100,
    damage: 60,
  },
  {
    name: "Ares",
    health: 80,
    damage: 40,
  },
];


function summator(num1, num2) {
	return num1 + num2
}
alert(summator(10, 4)); */


function number() {
    let sum = 0;

    for (let i = 2; i <= 10; i += 2 ) {
        sum += i;
    }
return sum;
}

/* function funk(a) {
    return a ** 3
}
console.log(funk(3)); 
document.write(funk(3)); */

// Сделайте функцию, которая параметром принимает число и
//проверяет, положительное это число или отрицательное.
//В первом случае пусть функция выводит в консоль текст '+++',
//а во втором '---'.

/* function number(num) {
    if (num > 0) {
        console.log('+++');
        return '+++'
    } else if (val === 0) {
        return '==='
    } else {
        console.log('---');
        return '---'
    }
}

let itog = number(10) */

/* const a = +prompt('введите число')

function num(a) {
    if (a >= 0) {
        console.log("положительное")
    }
    else {
        console.log("отрицательное")
    }
}
num(a)
*/

/* const list = [23, 354, -23, 45, 23, 34]
let res = 0 // глобальная область видимости
for (let i = 0; i < list.length; i++) { // локальная область видимости
    res = res + list[i]
}

console.log(res); */

//В программе объявлена переменная list, которая содержит массив чисел.
//Используя цикл посчитайте разность суммы всех четных чисел и суммы
//всех нечетных.
/* const list = [23, 354, -23, 45, 23, 34];

let even = 0;
let odd = 0;

for (let i = 0; i < list.length; i++) {
  if (list[i] % 2 === 0) {
    even = even + list[i];
  } else {
    odd = +list[i];
  }
}
let total = even - odd;
console.log(total); */

for (let i = 0; i >= 6; i--) {
  console.log(i);
}