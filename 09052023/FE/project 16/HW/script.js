//Написать цикл, который создает множество параграфов с каждым десятым числом в промежутке от 100 до 50 (т.е. 100, 90, 80, 70, 60, 50). 
//Добавить созданные параграфы в div с классом numbers.
const numbersSuite = document.querySelector('section');
for(let i = 100; i >= 50; i -= 10) {
    numbersSuite.innerHTML += `
    <div class="numbers">
    <p>${i}</p>
    </div>`;
} 


//Написать цикл, который проходится по массиву строк, для каждой строки создает параграф и добавляет его в div с классом strings_container. 
//Строки взять произвольные.
const students = ['Zahorniuk', 'Topolya', 'Jung', 'Vovchok']
const studentsBest = document.querySelector("section");
for (let i = 0; i < students.length; i++) {
studentsBest.innerHTML += `
    <div class="strings_container">
    <p>${students[i]}</p>
    </div>`;}


// Написать цикл, который проходится по массиву с объектами - у объектов свойства first_name, last_name и  age (данные взять произвольные) 
//- и создает карточки только для совершеннолетних пользователей. Карточка должна содержать информацию об имени, фамилии и возрасте пользователя. 
//Добавить все карточки в div с классом users_container.
const clients = [
  {
    first_name: "Lana",
    last_name: "Zahorniuk",
    age: 23,
  },

  {
    first_name: "Taras",
    last_name: "Topolya",
    age: 17,
  },

  {
    first_name: "Carl",
    last_name: "Jung",
    age: 68,
  },

  {
    first_name: "Marko",
    last_name: "Vovchok",
    age: 16,
  },
];
const section = document.querySelector("section");
for (let i = 0; i < clients.length; i++) {
  const client = clients[i];
  if (client.age >= 18) {
    section.innerHTML += `
    <div class="users_container">
    <p>${clients[i].first_name}</p>
    <p>${clients[i].last_name}</p>
    <p>${clients[i].age}</p>
    </div>`;
  }
}
