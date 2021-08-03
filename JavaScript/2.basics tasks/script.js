// 1
let age = 21;
let name = 'Jonas';
let hobby = 'irklavimas';
console.log('Mano vardas ' + name + ', man ' + age + '. Mano hobis yra ' + hobby + '.');
console.log('----------------------------');
// 2
let date = 2001;
let futureDate = 2066;
let futureAge = futureDate - date;
console.log(futureDate + ' metais man bus ' + futureAge + ' arba ' + (futureAge - 1) + ' metai/metų.');
console.log('----------------------------');
// 3
let d = 14;
let r = d / 2;
let A = Math.round(Math.PI * Math.pow(r, 2) * 100) / 100;
console.log('Apskritimo kurio skersmuo yra ' + d + 'cm, plotas yra ' + A + ' cm^2.');
console.log('----------------------------');
// 4
let tempC = 23;
let tempF = tempC * 9 / 5 + 32;
console.log(tempC + '°C yra ' + tempF + '°F');
console.log('----------------------------');
// 5
let sentence = 'Mes kalbame mažai, jeigu nekalbame apie save.';
console.log(sentence.length);
console.log(sentence.toUpperCase());
console.log(sentence.slice(0, 34));
let array = sentence.split(' ');
console.log(array);
console.log(sentence.indexOf('mažai'));
console.log(sentence.replace('kalbame', 'šnekame'));
console.log('----------------------------');
// 6
let numbString = 'laBa8s rYta56s, lIEtuva';
let string = numbString.replace(/[0-9]/g, ''); 
console.log(string.toLowerCase().replace(/l/g, "L"));
console.log('----------------------------');
// 7
let arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9 ,10];
console.log(arr1);
arr1.splice(9, 10);
console.log(arr1);
arr1.splice(0, 1);
console.log(arr1);
arr1[5] = 'new';
console.log(arr1);
arr2 = ['a', 'b', 'c', 'd'];
console.log(arr2);
let newArray = arr1.concat(arr2);
console.log(newArray);
let arrString = newArray.join(', ');
console.log(arrString);
console.log('----------------------------');
// 8
let mokinys = [
    {
        vardas: 'Martynas', pavarde: 'Lubys', amzius: 17, vidurkis: 4.5,
        stipendija: false
    },
    {
        vardas: 'Alina', pavarde: 'Alijeva', amzius: 16, vidurkis: 9,
        stipendija: true
    },
    {
        vardas: 'Kazimieras', pavarde: 'Bakštys', amzius: 17, vidurkis: 9.3,
        stipendija: true
    },
    {
        vardas: 'Algimantas', pavarde: 'Peraitis', amzius: 16, vidurkis: 6.5,
        stipendija: true
    },
    {
        vardas: 'Kotryna', pavarde: 'Petraityte', amzius: 16, vidurkis: 4,
        stipendija: false
    }
];
// 9
console.log(mokinys[1].amzius);
console.log(mokinys[3].vidurkis);
console.log(mokinys[0]);