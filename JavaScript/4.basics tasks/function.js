// funkcijos
// 1
let mass = [13.5, 10, 8, 9.5, 17];
let price = 0.5;

function drauguKiekis () {
    let n = mass.length;
    let kb = 0;
    let k = 0;
    console.log(`Stovyklauti vyko ${n} draugai (-ų).`);
    for (let i = 0; i < n; i++) {
        console.log(`${i+1}-o draugo kuprinė sveria ${mass[i]} kilogramų.`);
        kb += mass[i];
        if (mass[i] <= 10) {
            k++;
        }
    }

    console.log(`Draugai is viso vežė ${kb} kilogramų.`);
    let s = kb * price;
    console.log(`Už visą bagažą draugai turės sumokėti ${s} Eurų.`);
    let v = Math.round(kb / n * 100) / 100;
    console.log(`Vidutiniškai kiekvienas draugas veš po ${v} kilogramų.`);
    console.log(`Pas ${k} keliaujančius (-ų) bagažas buvo ne sunkesnis, nei 10kg.`);
    console.log('-------------------------------------');
}

drauguKiekis();

// 2
let u = [7, 6, 6];

function olimpiadosUzdaviniai () {
    let n = u.length;
    let sum = 0;
    for (let i = 0; i < n; i++) {
        sum += u[i];
    }
    console.log(`${n} olimpiadoje dalyvavę programuotojai išsprendė ${sum} uždavinių.`);
    console.log('-------------------------------------');
}

olimpiadosUzdaviniai();

// 3
let m = [18, 10, 10];

function gydytojoPriemimai () {
    let n = m.length;
    let sum = 0;
    let k = 0;
    for (let i = 0; i < n; i++) {
        sum += m[i];
        if (m[i] > 20) {
            k++;
        }
    }
    let v = Math.round(sum / n * 100) / 100;
    console.log(`Pacientai vidutiniškai gydytojo kabinete praleido po ${v} minučių.`);
    console.log(`Iš ${n} pacientų, ${k} kabinete praleido ilgiau, nei 20min.`);
    console.log('-------------------------------------');
}

gydytojoPriemimai();

// 4
let travel = [
    {
        v: 1,
        m: 24,
        k: 15
    },
    {
        v: 2,
        m: 12,
        k: 23
    },
    {
        v: 0,
        m: 36,
        k: 8
    },
];

function kelioneAutobusu () {
    let kv = 0;
    let t = 0;
    let k = 0;
    for (let i = 0; i < travel.length; i++) {
        kv += travel[i].k;
        t += Math.round((travel[i].v * 60 + travel[i].m) / travel.length);
        if (travel[i].k < 10) {
            k++;
        }
    }
    console.log(`${travel.length} autobusai(-ų) pervežė ${kv} keleivių.`);
    console.log(`Vidutiniškai vienas autobusas kelionėja sugaišta ${t} min.`);
    console.log(`${k} autobuse(-uose) važiavo mažiau, nei 10 žmonių.`);
    console.log('-------------------------------------');
}

kelioneAutobusu();

// 5
let strawberry = 4;
let plusStrawberry = 5;
let days = 3;

function braskes () {
    let sum = 0;
    for (let i = 0; i < days; i++) {
        sum += strawberry;
        strawberry += plusStrawberry;
    }
    console.log(`Per ${days} dienas prinoko ${sum} braškės (-ių).`);
    console.log('-------------------------------------');
}

braskes();

// 6
let a = 5;
let b = 24;

function ledai () {
    let k = 0;
    for (let i = a; i <= b; i++) {
        if (i % 6 == 0) {
            k++;
        }
    }
    console.log(`Reikalingas porcijų kiekis: ${k}`);
    console.log('-------------------------------------');
}

ledai();

// 7
let chapter = 17;

function knyga () {
    let sum = 0;
    let i = 1;
    while (true) {
        sum += i;
        if (chapter < sum) {
            sum = chapter;
            break;
        }
        i++;
    }
    let v = Math.round(chapter / i * 100) / 100;
    console.log(`Tadas visą knygą perskaitys per ${i} dienas (-ų).`);
    console.log(`Tadas vidutiniškai per dieną perskaitė ${v} skyrius (-ų).`);
    console.log('-------------------------------------');
}

knyga();
