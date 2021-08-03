// salyginiai sakiniai, operatoriai
// 1
let firstClient = 3;
let secondClient = 5;

if (firstClient > secondClient) {
    console.log('Ilgiau aptarnaujamas pirmas pirkėjas.');
} else if (secondClient > firstClient) {
    console.log('Ilgiau aptarnaujamas antras pirkėjas.');
} else {
    console.log('Abu pirkejai aptarnaujami vienodą laiką.');
}

console.log('--------------------------------------');

// 2
let J = 3;
let P = 5;

if (J > P) {
    console.log('Turnyrą laimėjo Jonas.');
} else if (P > J) {
    console.log('Turnyrą laimėjo Povilas.');
} else {
    console.log('Turnyras baigėsi lygiosiomis.');
}

console.log('--------------------------------------');

// 3
let M = 200;
let K = 300;

if (M > K) {
    console.log('Daugiau saldainių pirko Martynas.');
} else if (K > M) {
    console.log('Daugiau saldainių pirko Karolis.');
} else {
    console.log('Karolis ir Martynas nupirko tiek pat saldainių.');
}

console.log('--------------------------------------');

// 4
let firstOlymp = 1896;
let year = 2005;

if (year % 4 == 0) {
    let nr = (year - firstOlymp) / 4 + 1;
    console.log(`Olympinių žaidynių numeris - ${nr}.`);
} else {
    console.log('Metai neolimpiniai.');
}

console.log('--------------------------------------');

// 5
let time = 23;

if (time > 30) {
    console.log('Liko dar labai daug laiko.');
} else if (time < 30 && time > 15) {
    console.log('Liko dar nemažai laiko.');
} else if (time < 15 && time > 7) {
    console.log('Liko nedaug laiko.');
} else {
    console.log('Pamoka baigiasi.');
}

console.log('--------------------------------------');

// 6
let leapYear = 1980;

if (leapYear % 4 == 0 && leapYear % 100 != 0 || leapYear % 400 == 0) {
    console.log(`${leapYear} metai yra keliamieji.`);
} else {
    console.log(`${leapYear} metai yra paprastieji.`);
}

console.log('--------------------------------------');

// 7
let loteryNumber = 164976;
let LuckyNumber = loteryNumber;
let sum = 0;

while (0 < LuckyNumber) {
    sum += LuckyNumber % 10;
    LuckyNumber = Math.floor(LuckyNumber / 10);
}

if (sum % 4 == 0) {
    console.log(`Loterijos bilietas - ${loteryNumber}, yra laimingas.`);
} else {
    console.log(`Loterijos bilietas - ${loteryNumber}, nėra laimingas.`);
}

console.log('--------------------------------------');

// 8
let n = 10;
let p = 200;
let pn = [40, 40, 50, 30, 40];
let s = 11;
let pageSum = 0;

for (let i = 0; i < pn.length; i++) {
    pageSum += pn[i];
}

if (p * n <= pageSum * s) {
    console.log('Jonas knygas perskaityti spės.');
} else {
    console.log('Jonas knygų perskaityti nespės.');
}

console.log('--------------------------------------');

// 9
let nn = [1, 1, 1];
let Sum = 0;

for (let i = 0; i < nn.length; i++) {
    Sum += nn[i];
}

if (Sum == 3) {
    console.log('Mokinys dešimtuką gaus.');
} else {
    console.log('Mokinys dešimtuko negaus.');
}

console.log('--------------------------------------');

// 10
let k = 4500;

if (k > 4000) {
    console.log('Jolantai geriausiai tiktų pirmos grupės kelionė.');
} else if (k >= 3000 && k <= 3999) {
    console.log('Jolantai geriausiai tiktų antros grupės kelionė.');
} else if (k >= 1000 && k <= 2999) {
    console.log('Jolantai geriausiai tiktų trečios grupės kelionė.');
} else {
    console.log('Jolantai geriausiai tiktų ketvirtos grupės kelionė.');
}

console.log('--------------------------------------');