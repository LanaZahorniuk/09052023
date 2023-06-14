// Напишите функцию, которая принимает два числовых аргумента и
// возвращает наименьшее из них.
function getNumber(num1, num2) {
  if (num1 < num2) {
    console.log(num1);
  } else {
    console.log(num2);
  }
}
getNumber(1, 100);

// Напишите функцию, которая принимает два числовых аргумента
// и выводит в консоль все четные числа от большего к меньшему.
function numbers(num1, num2) {
  const max = Math.max(num1, num2);
  const min = Math.min(num1, num2);
  for (let i = max; i >= min; i--) {
    if (i % 2 === 0) {
      console.log(i);
    }
  }
}
numbers(10, 1);

// Напишите функцию power, которая принимает два числовых аргумента
// (основание степени и саму степень) и возвращает число в указанной
// степени. Значение степени должно быть указано по умолчанию 2.
function power(num1, num2 = 2) {
  return num1 ** num2;
}
console.log(power(3));
console.log(power(5, 3));

// Напишите функцию, которая принимает числовой аргумент n и считает
// сумму чисел от 1 до n.
function getNumbers(n) {
  let sum = 0;
  for (let i = 1; i <= n; i++) sum += i;
  console.log(sum);
}
getNumbers(6);

// Напишите функцию, которая принимает два числовых аргумента n и m
// и считает сумму четных чисел и нечетных чисел от n до m.
// Суммы выведите в консоль (в начале сумму четных чисел, а затем
// сумму нечетных).
function sumNambers(n, m) {
  let sumEven = 0;
  let sumOdd = 0;
  for (let i = n; i <= m; ++i) {
    if (i % 2 === 0) {
      sumEven += i;
    } else {
      sumOdd += i;
    }
  }
  console.log(sumEven);
  console.log(sumOdd);
}
sumNambers(3, 10);


// Напишите функцию, которая принимает в качестве аргументов массив строк,
// а возвращает первый самый длинный элемент массива. Если входной массив
// пуст, функция возвращает null. Если есть несколько одинаковых по длине
// элементов - функция возвращает первый из этих элементов. 
// (string.length > string.length) - сравнение длины строк
// Пример: [ 'one', 'two', 'three' ] => 'three'
function longestArrayElement(massiv) {
  if (massiv.length === 0) {
    return null;
  }

  let longest = massiv[0];
  for (let i = 0; i < massiv.length; i++) {
    if (massiv[i].length > longest.length) {
      longest = massiv[i];
    }
  }
  return longest;
}

const massiv = ["Lana", "Zara", "Konstantin", "Alexandra"];
console.log(longestArrayElement(massiv));
