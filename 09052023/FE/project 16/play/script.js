function start_game() {
  //console.log("start_game works");
  object.classList.toggle('start');

}

function finish_game() {
  object.classList.remove('start')
  //console.log("finish_game works");
  alert(`You lose. Score ${score}`);
}

function hit() {
  //console.log("hit works");
  score++;
  document.title = `Score ${score}`;

  object.classList.remove('start');
  void object.offsetWidth;
  object.classList.add('start');

  let random_offset = Math.random() * 340;
  object.style.left = `${random_offset}px`;

  change_object_background();
}

function miss(event) {
  if (event.target.id == "area") {
    //console.log("miss works");
    score--;

    if (score <= 0) {
      finish_game();
    }
    document.title = `Score ${score}`;
  }
}

function change_object_background(){
  const colors = ['red', 'purple', 'gold', 'blue', 'orange'];
  const random_index = Math.floor(Math.random() * colors.length);
  object.style.background = colors[random_index];   
}

let score = 0;
let object = document.querySelector('#object');