/* lyginimas
const num= 12;

if (num == '12') {
    console.log('true');
} else {
    console.log('false');
}

if (num === '12') {
    console.log('true');
} else {
    console.log('false');
}
*/

/* loginis
const weatherIsNice = true;
const quarantine = true;

if (weatherIsNice && quarantine) {
    console.log('take a walk in the woods');
} else if (weatherIsNice || !quarantine) {
    console.log('meet with friends')
} else {
    console.log('stay at home');
}
*/

/* switch
const color = 'green';

switch (color) {
    case 'green':
        console.log('green');
        break;
    case 'blue':
        console.log('blue');
        break;
    case 'red':
        console.log('red');
        break;
    default:
        console.log('nein');
}
*/

/* loops
let i = 0;

while (i <= 10) {
    console.log(i);
    i++;
}

do {
    console.log(i);
    i++;
}   while (i <= 10)

for (let i = 0; i <= 10; i++) {
    console.log(i);
}

let items = ['item1', 'item2', 'item3', 'item4'];

for (let i = 0; i < items.length; i++) {
    console.log(items[i]);
}

for (value of items) {
    console.log(value);
}

let person = {
    name: 'John',
    surname: 'Joe',
    age: 21
};

for (key in person) {
    console.log(person[key]);
}

items.forEach(logItems);

function logItems (item, index, array) {
    console.log(item, index, array);
}
*/

/* function
const ages = [20, 15, 26, 48, 13 ,66];

const adult = ages.filter(function(item) {
    if (item >= 18) {
        return true;
    }
});

console.log(adult);
*/

/* map
const people = [
    {
        name: 'Ana',
        surname: 'Carol',
        age: 23
    },
    {
        name: 'Joe',
        surname: 'Jonson',
        age: 48
    },
    {
        name: 'Zeril',
        surname: 'Amorile',
        age: 18
    },
];

const names = people.map(function(person) {
    return person.name;
});

console.log(names);
*/

/* functions
function hola () {
    console.log('Hola!');
}

hola();
hola();
hola();

function hello (name = 'User') {
    console.log(`Hello, ${name}`);
}

hello();

function sum (x, y) {
    return x + y;
}

console.log(sum(11, 24));
*/

