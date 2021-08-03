// for
// 1
let t = [15, 12, 13, 20];
let trainDays = t.length;
let sum = 0;
 
for (let i = 0; i < trainDays; i++) {
    sum += t[i];
}

let v = Math.round(sum / trainDays * 100) / 100;

console.log(`Per ${trainDays} dienas(-ų) Zinas buvo dresuojamas ${sum} minučių. Vidutiniškai per dieną katinas buvo dresuojamas ${v} minučių.`);
console.log('-------------------------------------');

// 2
let b = 4;
let d = 5;
let days = 3;
let strawberries = 0;

for (let i = 0; i < days; i++) {
    strawberries += b;
    b += d;
}

console.log(`Per ${days} dienas prinoko ${strawberries} braškės(-ių).`);
console.log('-------------------------------------');

// 3
let kp = 100;
let bets = [5, 7, 5, 5];
let price = 0;

for (let i = 0; i < bets.length; i++) {
    price += bets[i];
}

console.log(`Galutinė prekės kaina bus ${kp + price} litai.`);
console.log('-------------------------------------');

// 4
let number = 28;
let dividers = [];
let sumNumber = 0;

for (let i = 0; i < number; i++) {
    if (number % i == 0) {
        dividers.push(i);
    }
} 

for (let i = 0; i < dividers.length; i++) {
    sumNumber += dividers[i];
}

if (number == sumNumber) {
    console.log(`Skaičius ${number} yra tobulas.`);
} else {
    console.log(`Skaičius ${number} nėra tobulas.`);
}

console.log('-------------------------------------');

// 5
let s = 7;
let N = 5;
let Sum = 0;
let ss = s;

for (let i = 0; i < N; i++) {
    Sum += ss; 
    ss = ss * 10 + s;
    console.log
}

console.log(Sum);
console.log('-------------------------------------');

// while
// 1
let n = 5;
let m = 3;
let nSum = n;
let mSum = m;
let bmk = 0;

while (true) {
    if (nSum == mSum) {
        bmk = nSum;
        break;
    } else if (mSum > nSum) {
        nSum += n;
    } else {
        mSum += m; 
    }
}

console.log(`Skaičių ${n} ir ${m} mažiausias bendras kartotinis yra ${bmk}.`);
console.log('-------------------------------------');

// 2
let wage = {
    afterYear: 0,
    threeMonths: 0,
    double: 0,
    moreThan: 0
};
let x = 1300;
let y = 300;
let salary = x;
let i = 1;

while (true) {
    salary += y;
    if (i == 3) {
        wage.threeMonths = salary;
        salary = x;
        i = 1;
        break;
    }
    i++;
}
while (true) {
    salary += y;
    if (salary > x * 2) {
        wage.double = i;
        salary = x;
        i = 1;
        break;
    }
    i++;
}
while (true) {
    salary += y;
    if (salary >= 4000) {
        wage.moreThan = i;
        salary = x;
        i = 1;
        break;
    }
    i++;
}
while (true) {
    salary += y;
    if (i == 12) {
        wage.afterYear = salary;
        break;
    }
    i++;
}

console.log(`Po 1 metų atlyginimas bus ${wage.afterYear} eur.`);
console.log(`Po 3 mėnesių atlyginimas bus ${wage.threeMonths} eur.`);
console.log(`Po ${wage.double} mėnesių jo atlyginimas bus daugiau nei dvigubai didesnis.`);
console.log(`Po ${wage.moreThan} mėnesių jo atlyginimas bus nemažesnis nei 4000 eurų.`);
console.log('-------------------------------------');

// 3
let num = 1234;

let reverseNum = parseFloat (num
        .toString()
        .split('')
        .reverse()
        .join('')
);

console.log(`Pradinis skaičius - ${num}.`);
console.log(`Atvirkštinis skaičius - ${reverseNum}.`);
console.log('-------------------------------------');

// 4
let naturalNum = 21;
let naturalArr = [];
let j = 1;
let naturalSum = 0;

while (true) {
    naturalSum += j;
    naturalArr.push(j);
    j++;
    if (naturalSum >= naturalNum) {
        break;
    }
}

if (naturalSum == naturalNum) {
    console.log(`Susumavus naturalių skaičių seką - [${naturalArr}], gausime skaičių - ${naturalNum}.`);
} else if (naturalSum > naturalNum) {
    console.log(`Susumavus naturalių skaičių seką, skaičiaus (${naturalNum}) negausime.`);
}

console.log('-------------------------------------');

// 5
let firstNum = 5;
let secondNum = 2;
let count = 0;
let k = 1;

while (k <= firstNum) {
    if (firstNum % k == 0) {
        count++;
    }
    k++;
    if (k == firstNum) {
        k = 0;
        break;
    }
}

while (k <= secondNum) {
    if (secondNum % k == 0) {
        count++;
    }
    k++;
    if (k == secondNum) {
        break;
    }
}

if (count == 2) {
    console.log(`Skaičiai ${firstNum} ir ${secondNum} tarpusavį yra pirminiai.`);
} else if (count > 2) {
    console.log(`Skaičiai ${firstNum} ir ${secondNum} tarpusavį yra sudėtiniai.`);
} 

console.log('-------------------------------------');

// 6
let numb = 24;
let h = 1;
let factorial = 1;

while (true) {
    factorial *= h;
    if (factorial >= numb) {
        break;
    } else {
        h++;
    }
}

if (factorial > numb) {
    console.log(`Skaičius ${numb} nėra jokio skaičiaus faktorialas.`);
} else if (factorial == numb) {
    console.log(`Skaičius ${numb} yra skaičiaus ${h} faktorialas.`);
}

console.log('-------------------------------------');

// ciklai + masyvai
// 1
let circleRadius = [3, 5, 11, 4, 8, 9, 10, 11, 1, 5];
let radiusMax = 0;
let countMax = 1;

for (let i = 0; i < circleRadius.length; i++) {
    if (radiusMax < circleRadius[i]) {
        radiusMax = circleRadius[i];
    } else if (radiusMax == circleRadius[i]) {
        countMax++;
    }
}

console.log(`Didžiausio apskritimo spindulys - ${radiusMax}, yra ${countMax} tokio dydžio apskritimai (-ų).`);
console.log('-------------------------------------');

// 2
let A = [1110, 1248, 961, 215, 222, 366, 764, 800, 932, 1600];
let countMoney = 0;

for (let i = 0; i < A.length; i++) {
    if (A[i] > 1000) {
        countMoney++;
    }
}

console.log(`${countMoney}-ų/os klientų indėliai yra didesni nei 1000 Lt.`);
console.log('-------------------------------------');

// 3
let missed = [2, 4, 8, 4, 6, 9, 12, 1, 2, 6];

for (let i = 0; i < missed.length - 1; i++) {
    if (missed[i] > missed[i + 1]) {
        let temp = missed[i];
        missed[i] = missed[i + 1];
        missed[i + 1] = temp;
        i = -1;
    }
}

console.log(`Darželyje dėl ligos praleistų kiekvieno vaiko dienų skaičius - ${missed}.`);
console.log('-------------------------------------');

// 4
let cards = [11, 15, 8, 7, 16, 21, 12, 45, 36, 20];
let biblioteca = [];

for (let i = 0; i < cards.length; i++) {
    let temp = cards[i] + i;
    biblioteca.push(temp);
}

console.log(`Kortelių skaičius atskiruose skyriuose - ${biblioteca}.`);
console.log('-------------------------------------');

// 5
