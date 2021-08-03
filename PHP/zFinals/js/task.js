$(document).ready(function () {
  console.log("ready!");
  $(".changeStatus option").click(function (e) {
    console.log(this.value);
    console.log($(this).value);
  });
});
// jau veikia, tiesiog buvo targetinamas toks ID kuris šiame puslapyje neegzistuoja
// const x = document.querySelector('.btest');
// x.addEventListener('click', testFunction);

// function testFunction() {
//   alert('Hello World!');
// }





// html'e pridėjau klasę .container visiems konteineriams (new, in progress ir completed), tokiu būdu nereiks žaisti po vieną
const inprog = document.querySelectorAll('.container');
console.log(inprog);

// eventai konteineriams

for (let container of inprog) {
  container.addEventListener('dragover', dragOver);
  container.addEventListener('dragenter', dragEnter);
  container.addEventListener('dragleave', dragLeave);
  container.addEventListener('drop', dragDrop);
}
// paimam VISUS task card'us (ALL čia labai svarbu)

const todos = document.querySelectorAll('.todo');
const protaskcards = document.querySelectorAll('.in');
const protaskcards2 = document.querySelectorAll('.progress');
const completedcards = document.querySelectorAll('.completed');

// pridedam drag eventus kortelėms
for (let taskCard of todos) {
  taskCard.addEventListener('dragstart', dragStart);
  taskCard.addEventListener('dragend', dragEnd);
}

for (let taskCard2 of protaskcards) {
  taskCard2.addEventListener('dragstart', dragStart);
  taskCard2.addEventListener('dragend', dragEnd);
}

for (let taskCard3 of completedcards) {
  taskCard3.addEventListener('dragstart', dragStart);
  taskCard3.addEventListener('dragend', dragEnd);
}



function dragStart() {
  this.classList.add('hold');
  setTimeout(() => this.classList.add('invisible'), 0);
}

function dragEnd() {
  this.classList.remove('invisible');
}

function dragOver(e) {
  e.preventDefault();
}

function dragEnter(e) {
  e.preventDefault();
  // dėl šitų efektų tai abejoju, per daug mirga-marga. Bet palikau, patobulinkite
  // this.classList.add('hovered');
}

function dragLeave() {
  // this.classList.remove('hovered');
}

function dragDrop() {
  // kadangi vienu metu tempiamas tik vienas elementas, jis turi klasę hold. būtent ši klasė ir padės mums įmesti į naują konteinerį
  const droppable = document.querySelector('.hold');
  this.append(droppable);
  // nebereikalingos klasės pašalinamos
  droppable.classList.remove('hold');
  this.classList.remove('hovered');

}

//DRAG AND DROP STYLE CHANGES



const fresh = document.querySelector('#freshy');
const progressive = document.querySelector('#inprogcontainer');
const done = document.querySelector('.donecontainer');

done.addEventListener('click', testFunction);

fresh.addEventListener('dragend', turnFresh);
fresh.addEventListener('dragend', turnFresh2);

function turnFresh(){
  this.querySelector('.in').className = ' todo';
  this.querySelector('.progress').className = ' todo';
}

function turnFresh2(){
  this.querySelector('.completed').className = ' todo';
}


progressive.addEventListener('dragend', turnGay);
progressive.addEventListener('dragend', turnGay2);

function turnGay(){
  this.querySelector('.todo').className = ' in progress';
}

function turnGay2(){
  this.querySelector('.completed').className = ' in progress';
}

done.addEventListener('dragend', turnDone);
done.addEventListener('dragend', turnDone2);

function turnDone(){
  this.querySelector('.todo').className = ' completed';
}

function turnDone2(){
  this.querySelector('.in').className = ' completed';
  this.querySelector('.progress').className = ' completed';
}


//CODE TO SET THE VALUES

fresh.addEventListener('dragend', valueOneA);
fresh.addEventListener('dragend', valueOneB);

function valueOneA(){
    this.querySelector('.completeinput').value='1';

}

function valueOneB(){
    this.querySelector('.progressinput').value='1';
}

progressive.addEventListener('dragend', valueTwoA);
progressive.addEventListener('dragend', valueTwoB);

function valueTwoA(){
    this.querySelector('.todoinput').value='2';
}

function valueTwoB(){
    this.querySelector('.completeinput').value='2';
}

done.addEventListener('dragend', valueTresA);
done.addEventListener('dragend', valueTresB);

function valueTresA(){
    this.querySelector('.todoinput').value='3';
}

function valueTresB(){
    this.querySelector('.progressinput').value='3';
}
